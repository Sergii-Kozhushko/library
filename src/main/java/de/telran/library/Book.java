/**
 * Book.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 16-Feb-2023 15:10
 */

package de.telran.library;

public class Book {
    private String ISBN;
    //private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
