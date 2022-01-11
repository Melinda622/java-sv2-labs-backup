package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        System.out.println("Válasszon az alábbi lehetőségekből!");
        System.out.println("1.Felhasznalók listázása");
        System.out.println("2.Felhasznaló felvétele");
        System.out.println("Többi: Kilépés");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy számot!");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("1.Felhasznalók listázása");
        }
        if (number == 2) {
            System.out.println("2.Felhasznaló felvétele");
        } else {
            System.out.println("");
        }
    }
}
