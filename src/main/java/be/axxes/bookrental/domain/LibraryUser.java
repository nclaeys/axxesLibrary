package be.axxes.bookrental.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class LibraryUser {

    private String id;

    private String username;
    private String firstname;
    private String lastname;

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

    @Column(unique = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    @OneToMany(mappedBy = "user")
    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(final List<Rental> rentals) {
        this.rentals = rentals;
    }

}
