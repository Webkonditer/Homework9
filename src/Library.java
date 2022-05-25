import java.util.Arrays;

public class Library {

    private Book[] booksArray;

    public Library(int arrayLenghts) {
        this.booksArray = new Book[arrayLenghts];
    }

    public void addBook(Book book) {
        for (int i = 0; i < booksArray.length ; i++) {
            if (booksArray[i] == null) {
                booksArray[i] = book;
                break;
            }
        }
    }

    public void printBooks(){
        for (Book book: booksArray) {
            if (book != null) {
                System.out.println(book.getAutor().getAutorName() + " " + book.getAutor().getAutorSirname() + ": " + book.getBookTitle() + ": " + book.getBookDate());
            }
        }
    }

    public void searchBook(String bookTitle){
        for (Book book: booksArray) {
            if (book.getBookTitle() == bookTitle) {
                System.out.println(book.getBookTitle() + " by " + book.getAutor().getAutorName() + " " + book.getAutor().getAutorSirname() + " was published in " +  book.getBookDate());
                break;
            }
        }
    }

    public void changeBookDate(String bookTitle, int bookDate){
        for (Book book: booksArray) {
            if (book.getBookTitle() == bookTitle) {
                book.setBookDate(bookDate);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String library = "Library:\n";
        for (Book book: booksArray) {
            if (book != null) {
                library = library + book.toString() + "\n";
            }
        }
        return library;
    }
}
