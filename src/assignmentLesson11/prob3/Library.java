package assignmentLesson11.prob3;

import java.util.HashMap;
import java.util.Hashtable;

public class Library {
    HashMap<String, Book> bookStore;


    Library() {
        this.bookStore = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author) {

        if (bookStore.containsKey(ISBN)) {
            System.out.println("Book exists isbn: " + ISBN);
        } else {
            bookStore.put(ISBN, new Book(ISBN, title, author));
            System.out.println("Book Added: " + ISBN);
        }
    }

    public void borrowBook(String ISBN) {

        Book book = bookStore.get(ISBN);

        if (book != null) {
            if (!book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.println("Book successfully borrowed: " + ISBN);
            } else
                System.out.println("Book is already borrowed: " + ISBN);

        } else {
            System.out.println("Book is not exists: " + ISBN);
        }
    }

    public void returnBook(String ISBN) {
        Book book = bookStore.get(ISBN);

        if (book != null) {
            if (book.isBorrowed()) {
                book.setBorrowed(false);
                System.out.println("Book successfully returned: " + ISBN);
            } else {
                System.out.println("Book is already in Library: " + ISBN);
            }
        } else {
            System.out.println("Book is not exists: " + ISBN);
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        Book book = bookStore.get(ISBN);

        if (book != null && book.isBorrowed())
            return true;

        return false;
    }

    public Book getBookDetails(String ISBN) {
        Book book = bookStore.get(ISBN);

        if (book == null)
            System.out.println("Book is not found: " + ISBN);

        return book;
    }

    public void listAllBooks() {

        if (bookStore.isEmpty()) {
            System.out.println("No book found");
            return;
        }

        bookStore.values().forEach(book -> {
            System.out.println(book);
        });
    }

    public void listBorrowedBooks() {

        boolean isFound = false;

        for (Book b : bookStore.values()) {
            if (b.isBorrowed()) {
                System.out.println(b);
                isFound = true;
            }
        }

        if (!isFound)
            System.out.println("No borrowed book found");
    }

    void main() {
        Library lib = new Library();

        lib.addBook("978-1401971366", "The Let Them", "TheoryMel Robbins");
        lib.addBook("978-0593831878", "The Emperor of Gladness", "Ocean Vuong");
        lib.addBook("978-0385550369", "James", "Percival Everett");
        lib.addBook("978-1546171461", "Sunrise on the Reaping", "Suzanne Collins");
        lib.addBook("978-0385546898", "The Secret of Secrets", "Dan Brown");
        lib.addBook("978-0385546898", "The Secret of Secrets", "Dan Brown");

        String testIsbn = "978-1401971366";

        lib.borrowBook(testIsbn);
        lib.borrowBook(testIsbn);

        System.out.println(testIsbn + " is borrowed: " + lib.isBookBorrowed(testIsbn));
        lib.returnBook(testIsbn);
        
        System.out.println(testIsbn + " is borrowed: " + lib.isBookBorrowed(testIsbn));
        lib.returnBook(testIsbn);

        System.out.println("Selected book: " + lib.getBookDetails(testIsbn));

        System.out.println("List of Books");
        lib.listAllBooks();

        lib.borrowBook(testIsbn);
        System.out.println("List of borrowed books");
        lib.listBorrowedBooks();

    }
}
