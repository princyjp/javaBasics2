package Book;

public class Ebook extends Book{
    enum FileType{TXT,PDF}
    public Ebook(String title, int pages) {
        super(title, pages);
    }
}
