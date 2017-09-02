package be.axxes.bookrental.controllers;

import be.axxes.bookrental.dao.BookRepository;
import be.axxes.bookrental.domain.Book;
import be.axxes.bookrental.dto.BookBulkDTO;
import be.axxes.bookrental.dto.BookDTO;
import be.axxes.bookrental.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@BasePathAwareController
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookService bookService;

    @RequestMapping(path = "/books/bulkimport", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void bulkImportBooks(@RequestBody BookBulkDTO bulkBook) {
        for (int i = 0; i < bulkBook.getAmount(); i++) {
            Book book = new Book();
            book.setBookdescription(bulkBook.getBookDescription());
            bookRepository.save(book);
        }
    }

    @ResponseBody
    @RequestMapping(path = "/books/bydescription/{descriptionId}", method = RequestMethod.GET)
    public List<BookDTO> getBooks(@PathVariable String descriptionId) {
        return bookService.getBooks(descriptionId);
    }


}
