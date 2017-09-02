package be.axxes.bookrental.services;

import be.axxes.bookrental.dao.BookRepository;
import be.axxes.bookrental.domain.Rental;
import be.axxes.bookrental.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public List<BookDTO> getBooks(@PathVariable String descriptionId) {
        return bookRepository.findByBookdescription_Id(descriptionId).stream().map(book -> {
            BookDTO bookDTO = new BookDTO();
            bookDTO.setId(book.getId());

            LocalDate currentDate = LocalDate.now();
            boolean available = true;
            for (final Rental rental : book.getRentals()) {
                if ((rental.getStart().isBefore(currentDate) || rental.getStart().isEqual(currentDate)) && rental.getEnd().isAfter(currentDate)) {
                    available = false;
                    break;
                }
            }
            bookDTO.setAvailable(available);
            return bookDTO;
        }).collect(Collectors.toList());
    }
}
