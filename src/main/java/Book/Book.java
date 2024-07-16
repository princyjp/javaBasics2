package Book;

public class Book {
    private String title;
    private int pages;
    private int currentPage;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.currentPage = 1;
    }
    public int turnPage(int page){
        int previousPage = currentPage;
        currentPage += page;
        if(currentPage > pages || currentPage <= 0){
            currentPage = previousPage;
            System.out.println("Page does not exist");
        }

        return currentPage;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public int getCurrentPage() {
        return currentPage;
    }
}
