package LibraryManagementSystem;

import LibraryManagementSystem.interfaces.Borrowable;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private List<Book> borrowBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowBooks = new ArrayList<>();
    }

    public void borrowBook(Book book){
        if (book instanceof Borrowable){
            borrowBooks.add(book);
            System.out.println(name + " has borrowed " + book.title);

            ((Borrowable)book).borrow();
        }else {
            System.out.println(book.title + "can not be borrowed");
        }
    }

    public void returnBook(Book book){
        if (book instanceof Borrowable){
            if (borrowBooks.contains(book)){
                borrowBooks.remove(book);
                System.out.println(name + " has returned " + book.title);

                ((Borrowable)book).returnBook();
            } else {
                System.out.println(book.title + "has not borrowed");
            }
        }else {
            System.out.println(book.title + "can not be returned");
        }
    }

    public void listBorrowedBooks(){
        if (borrowBooks.isEmpty()){
            System.out.println(name + "has not borrowed any books");
        }else {
            System.out.println(name + "has borrowed the following books");
            for (Book book : borrowBooks){
                System.out.println(" - " + book.title);
            }
        }
    }

    public String getMemberId(){
        return  memberId;
    }

    public String getMemberName(){
        return name;
    }

}
