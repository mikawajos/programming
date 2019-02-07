package testScripts;

public class bookStore {

    private static String title;
    private static String author;
    static int pages;
    static String publisher;
    static String isbn;

    public bookStore(String title, String author, int pages, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    bookStore(bookStore book){
        this(bookStore.title, bookStore.author, bookStore.pages, bookStore.publisher, bookStore.isbn);
    }

    void printInfo() {
        String info = title + ";  " + author + ";  " + pages + ";  " + publisher + ";  " + isbn;
        System.out.println(info);
    }

    public static void main(String[] args) {
        final String appName = "BOOKSTORE 1.0";
        bookStore book1 = new bookStore("W pustyni i w puszczy", "Henryk Sienkiewicz", 101, "PolWyd Naukowe", "MASKDKERU34" );

        System.out.println(appName);
        System.out.println("Dostepne ksiazki w bibliotece");
        book1.printInfo();

        bookStore book2 = new bookStore("Nowe przygody", "Marcin TTW", 10, "WYdawnictwo PWN", "taratrrasdasd");
        book2.printInfo();
    }
}
