/**
 * Library.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 16-Feb-2023 15:28
 */

package de.telran.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();
    private ArrayList<Reader> readerList = new ArrayList<>();

    private int readerIDCounter = 0;


    public Library() {
    }

    // выдать книгу читателю
    public void lendBook(Reader reader, Book book) {
        if (bookList.contains(book) && book.isAvailable()) {
            reader.getBookList().add(book);

        }
    }

    // вернуть книгу в библиотеку от читателя
    public void returnBook(Reader reader, Book book) {
        reader.getBookList().remove(book);
        //bookList.indexOf(book)

    }

    //добавить книгу в фонд библиотеки
    public void addBook(Book book) {
        bookList.add(book);
    }

    // добавить книгу в библиотеку
    public void addBook(String title, String author, String ISBN) {

        Book book = new Book(title, author, ISBN);
        bookList.add(book);
    }

    // удалить книгу из библиотеки
    public void removeBook(Book book) {
        if (!book.isAvailable()) System.out.println("Книга находится у читателя, не могу удалить");
        else {
            bookList.remove(book);
        }
    }


    //добавить нового читателя в библиотеку
    public void addReader(Reader reader) {
        readerIDCounter++;
        reader.setID(readerIDCounter);
        readerList.add(reader);
    }


    public void printReaders() {

    }

    public void printAvailableBooks() {

    }

    // распечатать книги, взятые читателями
    public void printIssuedBooks() {

    }

    // какие книги взял читатель
    public void printReaderBooks(int readerId) {

    }
}

