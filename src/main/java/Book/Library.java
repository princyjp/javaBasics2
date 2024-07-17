package Book;

import java.util.ArrayList;

public  class Library {
    ArrayList<Ebook> ebooksCollection = new ArrayList<>();
    ArrayList<GraphicNovel> graphicNovelCollection = new ArrayList<>();
    ArrayList<SheetMusic> sheetMusicCollection = new ArrayList<>();

    ArrayList<Book> allBooks = new ArrayList<>();

    public void depositEbook(Ebook ebook){
        ebooksCollection.add(ebook);
        allBooks.add(ebook);
        System.out.println("ebook added");
        System.out.println(ebooksCollection.toString());

    }
    public void depositGraphicNovel(GraphicNovel graphicNovel){
        graphicNovelCollection.add(graphicNovel);
        allBooks.add(graphicNovel);
        System.out.println("graphic Novel added");

    }
    public void depositSheetMusic(SheetMusic sheetMusic){
        sheetMusicCollection.add(sheetMusic);
        allBooks.add(sheetMusic);
        System.out.println("Sheet Music added");

    }
    public void withdrawEbook(Ebook ebook){
        ebooksCollection.remove(ebook);
        System.out.println("ebook removed");
        System.out.println(ebooksCollection.toString());

    }
    public void withdrawGraphicNovel(GraphicNovel graphicNovel){
        graphicNovelCollection.remove(graphicNovel);
        System.out.println("Graphic Novel removed");
        System.out.println(graphicNovelCollection.toString());

    }
    public void withdrawSheetMusic(SheetMusic sheetMusic){
        sheetMusicCollection.remove(sheetMusic);
        System.out.println("sheet music removed");
        System.out.println(sheetMusicCollection.toString());

    }

    public ArrayList<Ebook> getEbooksCollection() {
        return ebooksCollection;
    }

    public ArrayList<GraphicNovel> getGraphicNovelCollection() {
        return graphicNovelCollection;
    }

    public ArrayList<SheetMusic> getSheetMusicCollection() {
        return sheetMusicCollection;
    }

    public ArrayList<Book> getAllBooks() {
        return allBooks;
    }
}
