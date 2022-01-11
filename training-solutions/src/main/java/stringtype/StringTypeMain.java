package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        String s3 = "Hello" + "World";
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        String empty = "" + "";
        String alphabet = "Abcde";

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        System.out.println(empty);
        System.out.println(empty.length());
        System.out.println(alphabet.length());
        System.out.println(alphabet.substring(0, 1) + alphabet.substring(2, 3));
        System.out.println(alphabet.substring(0, 3));
    }
}
