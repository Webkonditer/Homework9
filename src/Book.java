import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book: " + bookTitle + " by " + autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) && autor.equals(book.autor) && bookDate == book.bookDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, autor, bookDate);
    }
}
