public class Main {
    public static void main(String[] args){
        Autor autor1 = new Autor("Федор", "Достоевский");
        Autor autor2 = new Autor("Сергей", "Есенин");

        Book book1 = new Book("Бесы", autor1, "1736");
        Book book2 = new Book("Шагане ты моя Шагане", autor2, "1924");

        book1.setBookDate("2022");

        //System.out.println(book1.getAutor().getAutorName() + " " + book1.getAutor().getAutorSirname() + " " + book1.getBookTitle() + " " + book1.getBookDate());

        //Средний уровень

        Book[] books = new Book[5];

        books[0] = book1;
        books[1] = book2;

        Autor autor3 = new Autor("Анджей", "Сапковский");
        Book book3 = new Book("Ведьмак", autor3, "1986");

        addBook(books, book3);

        printBooks(books);
    }

    public static void addBook(Book[] booksArray, Book newBook){
        for (int i = 1; i < 5 ; i++) {
            if (booksArray[i] == null) {
                booksArray[i] = newBook;
                break;
            }
        }
    }

    public static void printBooks(Book[] booksArray){
        for (Book book: booksArray) {
            if (book != null) {
                System.out.println(book.getAutor().getAutorName() + " " + book.getAutor().getAutorSirname() + ": " + book.getBookTitle() + ": " + book.getBookDate());
            }
        }
    }
}