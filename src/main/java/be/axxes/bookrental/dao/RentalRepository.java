package be.axxes.bookrental.dao;

import be.axxes.bookrental.domain.Book;
import be.axxes.bookrental.domain.LibraryUser;
import be.axxes.bookrental.domain.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface RentalRepository extends JpaRepository<Rental, String> {

}
