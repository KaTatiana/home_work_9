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
}
