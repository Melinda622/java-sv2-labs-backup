package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner sentence = new Scanner(System.in);
        System.out.println("Adjon meg egy több tagmondatból álló mondatot!");
        String sentenceByWords = sentence.nextLine();

        Scanner words = new Scanner(sentenceByWords);

        while (words.hasNext()) {
            System.out.println(words.next());
        }
        System.out.println();

        Scanner clauses = new Scanner(System.in);
        System.out.println("Adjon meg egy több tagmondatból álló mondatot!");
        String sentenceByClauses = clauses.nextLine();

        Scanner writeClauses = new Scanner(sentenceByClauses).useDelimiter(",");
        while (writeClauses.hasNext()) {
            System.out.println(writeClauses.next());
        }
    }
}
