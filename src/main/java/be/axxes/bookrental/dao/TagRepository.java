package be.axxes.bookrental.dao;

import be.axxes.bookrental.domain.Author;
import be.axxes.bookrental.domain.Book;
import be.axxes.bookrental.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TagRepository extends JpaRepository<Tag, String> {

    Tag findAuthorByName(String name);

}
