public class Library {

    private Book[] booksArray;

    public Library(Book[] booksArray, int arrayLenghts) {
        this.booksArray = new Book[arrayLenghts];
        this.booksArray = booksArray;
    }

    public void addBook(Book newBook){
        for (int i = 1; i < 5 ; i++) {
            if (booksArray[i] == null) {
                booksArray[i] = newBook;
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
}
