package be.axxes.bookrental.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    private String id;

    private BookDescription bookdescription;
    private List<Rental> rentals;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @ManyToOne
    public BookDescription getBookdescription() {
        return bookdescription;
    }

    public void setBookdescription(final BookDescription bookdescription) {
        this.bookdescription = bookdescription;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(final List<Rental> rentals) {
        this.rentals = rentals;
    }

}
