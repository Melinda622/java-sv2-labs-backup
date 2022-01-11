package cmdarguments.verse;

public class VerseMain {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.print( args[i]+" ");
        }
        System.out.println("");
        for (int i = 4; i>=0; i--) {
            System.out.print(args[i]+" ");
        }
    }
}
