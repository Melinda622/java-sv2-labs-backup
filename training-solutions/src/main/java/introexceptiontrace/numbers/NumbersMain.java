package introexceptiontrace.numbers;

public class NumbersMain {
    public static void main(String[] args) {
        Change change = new Change();

        RandomOperations random=new RandomOperations();
        System.out.println(random.getNumbers());

        //Az i-t csak tömb hossza-1-ig kellene léptetni.
    }
}
