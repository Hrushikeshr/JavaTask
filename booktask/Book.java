package booktask;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String bookGenre;
    private int bookEdition;
    private int bookPrice;


    public Book(String bookTitle, String bookAuthor, String bookGenre, int bookEdition, int bookPrice) {
        super();
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
        this.bookEdition = bookEdition;
        this.bookPrice = bookPrice;
    }


    public Book() {

    }


    @Override
    public String toString() {
        return "Book [bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookGenre=" + bookGenre
                + ", bookEdition=" + bookEdition + ", bookPrice=" + bookPrice + "]";
    }



    public String getBookTitle() {
        return bookTitle;
    }



}

