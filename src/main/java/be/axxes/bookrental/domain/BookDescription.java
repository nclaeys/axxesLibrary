package be.axxes.bookrental.domain;

import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import javax.persistence.*;

@Entity
public class BookDescription {

    private String id;

    private String title;
    private List<Author> authors;
    private List<Tag> tags;
    private List<Book> books;
    private String isbn;
    private String url;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "bookdescription_author", joinColumns = {@JoinColumn(name = "bookdescription_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id", nullable = false, updatable = false)})
    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(final List<Author> authors) {
        this.authors = authors;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "bookdescription_tag", joinColumns = {@JoinColumn(name = "bookdescription_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tag_id", nullable = false, updatable = false)})
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(final List<Tag> tags) {
        this.tags = tags;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bookdescription")
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(final List<Book> books) {
        this.books = books;
    }

    @Column(unique=true)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(final String isbn) {
        this.isbn = isbn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
