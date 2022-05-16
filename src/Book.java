public class Book {
    private String bookTitle;
    private Autor autor;
    private int bookDate;

    public Book(String bookTitle, Autor autor, int bookDate) {
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

    public int getBookDate() {
        return bookDate;
    }

    public void setBookDate(int bookDate) {
        this.bookDate = bookDate;
    }
}
