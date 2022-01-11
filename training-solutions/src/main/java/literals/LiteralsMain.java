package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println(x + "" + y);
        System.out.println(Integer.toString(x) + Integer.toString(y));

        double quotient = 3 / 4;
        System.out.println(quotient);
        quotient = 3 / 4F;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String word = "title";
        word = word.toUpperCase();
        System.out.println(word.toUpperCase());
        System.out.println(word);

        int a = 1;
        int b = -2;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
    }
}
