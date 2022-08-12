import java.util.Arrays;

public class Library {
    private final Book[] books;
    private int indMas=0;

    public Library(int sizeMas){
         books = new Book[sizeMas];
    }

    public void addBooks(Book[] param){
        for (Book book : param) {
            if (indMas < books.length) {
                books[indMas] = book;
                indMas += 1;
            }
        }
    }
    public void addBook(String nameBook, Author author, int year){
        if (indMas < books.length) {
            Book newBook = new Book(nameBook, author, year);
            books[indMas] = newBook;
            indMas += 1;
        }
    }
    public void updateBookYear(String bookName, int year){
        for (Book book : books) {
            if (book != null && book.getNameBook().equals(bookName)) {
                book.setYearPublication(year);
                return;
            }
        }
    }
    public void printBooks(){
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthorName() + ": " + book.getNameBook() + ": " + book.getYearPublication());
            }
        }
    }
}
