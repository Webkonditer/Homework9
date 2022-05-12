public class Book {
    private String bookTitle;
    private Autor autor;
    private String bookDate;

    public Book(String bookTitle, Autor autor, String bookDate) {
        this.bookTitle = bookTitle;
        this.autor = autor;
        this.bookDate = bookDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }
}
