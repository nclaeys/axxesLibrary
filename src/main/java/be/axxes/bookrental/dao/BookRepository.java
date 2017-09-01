package be.axxes.bookrental.dao;

import be.axxes.bookrental.domain.Author;
import be.axxes.bookrental.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, String> {
}
