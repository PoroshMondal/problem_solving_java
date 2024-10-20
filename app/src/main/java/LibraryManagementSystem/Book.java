package LibraryManagementSystem;

import LibraryManagementSystem.enums.Genre;

public abstract class Book {
    protected String title;
    protected String author;
    protected String ISBN;
    protected Genre genre;

    public Book(String title, String author, String ISBN, Genre genre){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
    }

    // Abstract method (no implementation here, subclasses must implement this)
    public abstract void displayBookInfo();

    // Concrete method (subclasses can use this as is)
    public void borrow(){
        System.out.println(title + " is borrowed");
    }

    /*public void displayBookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }*/

}
