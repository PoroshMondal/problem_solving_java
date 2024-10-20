package LibraryManagementSystem;

public class EBook extends Book {

    private String downloadLink;

    public EBook(String title, String author, String ISBN, String downloadLink) {
        super(title, author, ISBN);
        this.downloadLink = downloadLink;
    }

    @Override
    public void displayBookInfo() {
        super.displayBookInfo(); // calling the parent method
        System.out.println("Downloading Ebook from: " + downloadLink);
    }
}
