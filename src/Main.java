import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Author grin =new Author("Александр","Грин");
        Author robertHeinlein= new Author("Роберт","Хайнлайн");
        Author tolkin = new Author("Джон Рональд Руэл","Толкин");
        Book doorIntoSummer=new Book("Дверь в лето",robertHeinlein,1956);
        Book scarletSails=new Book("Алые паруса",grin,1922);

        scarletSails.setYearPublication(1960);

        System.out.println(scarletSails.getYearPublication());
        int booksSize=2;
        Book[] books=new Book[booksSize];
        books[0]=doorIntoSummer;
        books[1]=scarletSails;

        Library library= new Library(10);

        library.addBook("Хоббит", tolkin, 2019);

        library.addBooks(books);

        library.updateBookYear("Алые паруса",1955);
        library.printBooks();

        System.out.println(grin.equals(robertHeinlein));
        System.out.println(doorIntoSummer.equals(scarletSails));
        System.out.println(grin.hashCode());
        System.out.println(doorIntoSummer.hashCode());

    }
}