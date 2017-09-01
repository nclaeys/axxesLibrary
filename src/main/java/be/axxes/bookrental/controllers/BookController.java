package be.axxes.bookrental.controllers;

import be.axxes.bookrental.dao.BookRepository;
import be.axxes.bookrental.domain.Book;
import be.axxes.bookrental.dto.BookBulkDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@BasePathAwareController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping(path = "/books/bulkimport", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void bulkImportBooks(@RequestBody BookBulkDTO bulkBook){
        for (int i = 0; i < bulkBook.getAmount(); i++) {
            bookRepository.save(new Book(bulkBook.getBookDescription()));
        }
    }


}
