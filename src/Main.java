public class Main {
    public static void main(String[] args){
        Autor autor1 = new Autor("�����", "�����������");
        Autor autor2 = new Autor("������", "������");

        Book book1 = new Book("����", autor1, "1736");
        Book book2 = new Book("������ �� ��� ������", autor2, "1736");

        book1.setBookDate("2022");

            System.out.println(book1.getAutor().getAutorName() + " " + book1.getAutor().getAutorSirname() + " " +
            book1.getBookTitle() + " " + book1.getBookDate());
    }
}