package be.axxes.bookrental.dto;

import be.axxes.bookrental.domain.Book;
import be.axxes.bookrental.domain.BookDescription;

public class BookBulkDTO {

    private int amount;
    private BookDescription bookDescription;



    public BookDescription getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(final BookDescription bookDescription) {
        this.bookDescription = bookDescription;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }
}
