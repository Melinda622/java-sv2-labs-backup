package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("The Alchemist");
        System.out.println(book.getTitle());

        book.setTitle("War and Peace");
        System.out.println(book.getTitle());
    }
}
