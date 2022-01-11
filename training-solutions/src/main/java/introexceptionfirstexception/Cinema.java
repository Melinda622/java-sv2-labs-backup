package introexceptionfirstexception;

import java.util.Random;
import java.util.Scanner;

public class Cinema {

    public void buyTicket() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üdvözöljük a mozijegy foglaló rendszerünkben, kérjük adja meg a kért adatokat");
        System.out.println("Írja be a vásárló nevét:");
        String name = scanner.nextLine();
        System.out.println("Írja be a film címét:");
        String title = scanner.nextLine();
        System.out.println("Írja be, hogy hány darab jegyet szeretne:");
        int numberOfTickets = scanner.nextInt();
        System.out.println("Írja be, hogy hányadik sorban szeretne ülni:");
        int rowNumber = scanner.nextInt();

        int seatNumber = random.nextInt(1, 12 - numberOfTickets);

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:");
        System.out.println("Vásárló neve: " + name);
        System.out.println("Film címe: " + title);
        StringBuilder sb = new StringBuilder();
        sb.append("Lefoglalt helyek: ");
        for (int i = 0; i < numberOfTickets; i++) {
            sb.append(rowNumber);
            sb.append(". ");
            sb.append("sor ");
            sb.append(seatNumber + i);
            sb.append(". ");
            sb.append("szék");
            if (i != numberOfTickets - 1)
                sb.append(", ");
        }
        System.out.println(sb.toString());
        System.out.println("Jó szórakozást!");
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.buyTicket();
    }
}
