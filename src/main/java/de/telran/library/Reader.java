/**
 * Reader.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 16-Feb-2023 15:08
 */

package de.telran.library;


import java.util.ArrayList;

public class Reader {
    private int ID;
    private String Name;
    ArrayList<Book> bookList; // список книг, которые взял читатель

    public void setID(int ID) {
        this.ID = ID;
    }
    public void addBook(Book book) {
        bookList.add(book);
    }

    // удалить книгу из списка взятых читателем
    public void removeBook(int bookID){

    }

    //  распечатать все книги, которые взял читатель
    public void printReaderStatus() {

    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }
}
