package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg az utasok számát!");
        int numberOfPassengers = scanner.nextInt();
        String boat1 = "2 személyes csónak";
        String boat2 = "3 személyes csónak";
        String boat3 = "5 személyes csónak;";

        int remainingPassengers = numberOfPassengers - 10;

        if (numberOfPassengers <= 2 && numberOfPassengers>0) {
            System.out.println("Bérelt hajók:" + " " + boat1 + " Még ennyi személy bérelhet: 8 fő");
        }
        if (numberOfPassengers == 3) {
            System.out.println("Bérelt hajók:" + " " + boat2 + " Még ennyi személy bérelhet: 7 fő");
        }
        if (numberOfPassengers <= 5 && numberOfPassengers > 3) {
            System.out.println("Bérelt hajók:" + " " + boat3 + " Még ennyi személy bérelhet: 5 fő");
        }
        if (numberOfPassengers <= 7 && numberOfPassengers > 5) {
            System.out.println("Bérelt hajók:" + " " + boat1 + ", " + boat3 + " Még ennyi személy bérelhet: 3 fő");
        }
        if (numberOfPassengers == 8) {
            System.out.println("Bérelt hajók:" + " " + boat2 + ", " + boat3 + " Még ennyi személy bérelhet: 2 fő");
        }
        if (numberOfPassengers > 8 && numberOfPassengers <= 10) {
            System.out.println("Bérelt hajók:" + " " + boat1 + ", " + boat2 + ", " + boat3 + "Még ennyi személy bérelhet:0");
        }
        if (numberOfPassengers > 10) {
            System.out.println("Bérelt hajók " + " " + boat1 + ", " + boat2 + ", " + boat3 + " Ennyi fő maradt még a parton: " + remainingPassengers + " Még ennyi személy bérelhet: 0");
        }
    }
}
