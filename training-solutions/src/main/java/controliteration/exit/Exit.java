package controliteration.exit;

import java.util.Scanner;

public class Exit {
    public void write() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával");
        } while (!scanner.next().equals("x"));
        System.out.println("Ön sikeresen kilépett!");
    }

    public static void main(String[] args) {
        Exit exit = new Exit();
        exit.write();
    }
}
