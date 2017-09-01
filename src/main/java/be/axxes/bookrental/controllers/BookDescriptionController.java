package be.axxes.bookrental.controllers;

import be.axxes.bookrental.dao.AuthorRepository;
import be.axxes.bookrental.dao.BookDescriptionRepository;
import be.axxes.bookrental.dao.TagRepository;
import be.axxes.bookrental.domain.Author;
import be.axxes.bookrental.domain.BookDescription;
import be.axxes.bookrental.domain.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@BasePathAwareController
public class BookDescriptionController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private BookDescriptionRepository bookDescriptionRepository;

    @RequestMapping(path = "/bookDescriptions", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void createBookDescription(@RequestBody BookDescription bookDescription) {
        bookDescription.getAuthors().forEach(a -> {
                    final Author author = authorRepository.findAuthorByFirstnameAndLastname(a.getFirstname(), a.getLastname());
                    if (author == null) {
                        a.setId(authorRepository.save(a).getId());
                    } else {
                        a.setId(author.getId());
                    }
                }
        );

        bookDescription.getTags().forEach(a -> {
                    final Tag tag = tagRepository.findTagByName(a.getName());
                    if (tag == null) {
                        a.setId(tagRepository.save(a).getId());
                    } else {
                        a.setId(tag.getId());
                    }
                }
        );

        bookDescriptionRepository.save(bookDescription);
    }
}
