package Book;

public class GraphicNovel extends Book{

    private String illustrator;
    public GraphicNovel(String title, int pages, String illustrator) {
        super(title, pages);
        this.illustrator = illustrator;
    }
}
