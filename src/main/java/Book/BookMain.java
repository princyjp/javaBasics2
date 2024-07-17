package Book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 100);
        System.out.println(book.getTitle() + " Current Page: " + book.getCurrentPage());
        book.turnPage(10);
        System.out.println(book.getTitle() + " Current Page: " + book.getCurrentPage());
        book.turnPage(-9);
        System.out.println(book.getTitle() + " Current Page: " + book.getCurrentPage());
        Ebook ebook = new Ebook("Thor",90);
        Library library = new Library();
        library.depositEbook(ebook);
        library.withdrawEbook(ebook);

    }
}
