package assignmentLesson11.prob3;

import java.util.Objects;

class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return Objects.equals(ISBN, book.ISBN) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title, author);
    }

    @Override
    public String toString() {
//        return STR."Book{ISBN='\{ISBN}', title='\{title}', author='\{author}', isBorrowed=\{isBorrowed}}";
        return "Book{ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", isBorrowed=" + isBorrowed + "}";
    }

}
