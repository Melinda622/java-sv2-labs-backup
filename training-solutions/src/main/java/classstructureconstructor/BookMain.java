package classstructureconstructor;

public class BookMain {
    public static void main(String[] args) {
        Book book=new Book("Jules Verne","Várkastély a Kárpátokban");

        book.register("1034578");

        System.out.println("Author: "+book.getAuthor());
        System.out.println("Title: "+book.getTitle());
        System.out.println("Registration number: "+book.getRegNumber());
    }
}
