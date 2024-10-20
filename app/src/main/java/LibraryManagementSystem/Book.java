package LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isBorrowed;

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }

    //methods(behavior)
    public void borrow(){
        if (!isBorrowed){
            isBorrowed = true;
            System.out.println(title + " has been borrowed");
        }else {
            System.out.println(title + " is already borrowed");
        }
    }

    public void returnBook(){
        if (isBorrowed){
            isBorrowed = false;
            System.out.println(title + " has been returned");
        }else{
            System.out.println(title + " was not borrowed");
        }
    }

    public void displayBookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }

}