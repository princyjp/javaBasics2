package Book;

public class SheetMusic extends Book{
    private String composer;
    public SheetMusic(String title, int pages, String composer) {
        super(title, pages);
        this.composer = composer;
    }
}
