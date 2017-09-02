package be.axxes.bookrental.config;

import be.axxes.bookrental.domain.Book;
import be.axxes.bookrental.domain.BookDescription;
import be.axxes.bookrental.domain.Rental;
import be.axxes.bookrental.domain.Tag;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RestResourceConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(BookDescription.class);
        config.exposeIdsFor(Book.class);
        config.exposeIdsFor(Tag.class);
        config.exposeIdsFor(Rental.class);
    }

}
