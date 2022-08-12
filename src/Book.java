import java.util.Objects;

// 1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
// Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
public class Book {
    private final String nameBook;
    private final Author author;
    private int yearPublication;

    public Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return nameBook;
    }
    public Author getAuthorName() {
        return author;
    }
    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this. yearPublication= yearPublication;
    }

    public String toString() {
        return nameBook + " " +author+" "+yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearPublication);
    }
}