package Book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 100);
        System.out.println(book.getTitle() + " Current Page: " + book.getCurrentPage());
        book.turnPage(10);
        System.out.println(book.getTitle() + " Current Page: " + book.getCurrentPage());
        book.turnPage(-9);
        System.out.println(book.getTitle() + " Current Page: " + book.getCurrentPage());
    }
}
