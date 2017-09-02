package be.axxes.bookrental.dto;

public class BookDTO {

    private boolean available;
    private String id;



    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(final boolean available) {
        this.available = available;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }
}
