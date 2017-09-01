package be.axxes.bookrental.dao;

import be.axxes.bookrental.domain.Author;
import be.axxes.bookrental.domain.BookDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AuthorRepository extends JpaRepository<Author, String> {

    Author findAuthorByFirstnameAndLastname(String firstname, String lastname);
}
