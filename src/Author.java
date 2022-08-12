import java.util.Objects;

//2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
public class Author {
    String authorName;
    String authorSurname;

    public Author(String authorNam, String authorSurname) {
        this.authorName = authorNam;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() { return authorName; }
    public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public String toString() {
        return authorName + " " +authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }
}
