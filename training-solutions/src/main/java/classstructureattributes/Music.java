package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Song song=new Song();

        System.out.println("Who sings your favourite song?");
        song.band=scanner.nextLine();

        System.out.println("What is the title of your favourite song?");
        song.title=scanner.nextLine();

        System.out.println("How long is your favourite song (in minutes)?");
        song.length=scanner.nextInt();

        System.out.println(song.band+"-"+song.title+" "+"("+song.length+")"+" "+"perc");

    }
}


