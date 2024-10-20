package LibraryManagementSystem;

import LibraryManagementSystem.enums.Genre;
import LibraryManagementSystem.interfaces.Borrowable;

public class EBook extends Book implements Borrowable {

    private String downloadLink;
    private boolean isBorrowed;

    public EBook(String title, String author, String ISBN, Genre genre, String downloadLink) {
        super(title, author, ISBN, genre);
        this.downloadLink = downloadLink;
        this.isBorrowed = false;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Ebook");

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Genre: " + genre);

        System.out.println("Downloading Ebook from: " + downloadLink);
    }

    @Override
    public void borrow() {
        if (!isBorrowed){
            isBorrowed = true;
            System.out.println(title + " has been borrowed");
        }else {
            System.out.println(title + " is already borrowed");
        }
    }

    @Override
    public void returnBook() {
        if (isBorrowed){
            isBorrowed = false;
            System.out.println(title + " has been returned");
        }else{
            System.out.println(title + " was not borrowed");
        }
    }
}
