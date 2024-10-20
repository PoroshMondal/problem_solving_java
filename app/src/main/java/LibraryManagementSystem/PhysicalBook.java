package LibraryManagementSystem;

import LibraryManagementSystem.interfaces.Borrowable;

public class PhysicalBook extends Book implements Borrowable {

    private int pages;
    private boolean isBorrowed;
    public PhysicalBook(String title, String author, String ISBN, int pages) {
        super(title, author, ISBN);
        this.pages = pages;
        this.isBorrowed = false;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Pages: " + pages);
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
