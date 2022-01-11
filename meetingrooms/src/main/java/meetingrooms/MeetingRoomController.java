package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

    Office office = new Office();

    public void readOffice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a tárgyaló nevét:");
        String name = scanner.next();
        System.out.println("Kérem adja meg a tárgyaló hosszát:");
        int length = scanner.nextInt();
        System.out.println("Kérem adja meg a tárgyaló szélességét:");
        int width = scanner.nextInt();

        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }

    public void printMenu() {
        System.out.println("1. Tárgyaló rögzítése");
        System.out.println("2. Tárgyalók sorrendben");
        System.out.println("3. Tárgyalók visszafele sorrendben");
        System.out.println("4. Minden második tárgyaló");
        System.out.println("5. Területek");
        System.out.println("6. Keresés pontos név alapján");
        System.out.println("7. Keresés névtöredék alapján");
        System.out.println("8. Keresés terület alapján");
        System.out.println("9. Kilépés");
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem válasszon az alábbi menüpontok közül!");
        printMenu();
        System.out.println("");
        System.out.println("Kivalasztott menüpont:");
        int number = scanner.nextInt();
        System.out.println("");
        if (number == 1) {
            readOffice();
            System.out.println("Kérem adja meg a következő tárgyaló nevét");
            String name = scanner.next();
            System.out.println("Kérem adja meg a következő tárgyaló hosszát");
            int length = scanner.nextInt();
            System.out.println("Kérem adja meg a következő tárgyaló szélességét");
            int width = scanner.nextInt();
            office.addMeetingRoom(new MeetingRoom(name, length, width));
            System.out.println("");
        }
        if (number == 2) {
            readOffice();
            System.out.println("Kérem most adja meg egy következő tárgyaló adatait!\n");
            readOffice();
            office.printNames();
            System.out.println("");
        }
        if (number == 3) {
            readOffice();
            System.out.println("Kérem most adja meg egy következő tárgyaló adatait!\n");
            readOffice();
            office.printNamesReverse();
            System.out.println("");
        }
        if (number == 4) {
            readOffice();
            System.out.println("Kérem most adja meg egy következő tárgyaló adatait!\n");
            readOffice();
            office.printEvenNames();
            System.out.println("");
        }
        if (number == 5) {
            readOffice();
            System.out.println("Kérem most adja meg egy következő tárgyaló adatait!\n");
            readOffice();
            office.printAreas();
            System.out.println("");
        }
        if (number == 6) {
            readOffice();
            System.out.println("Kérem most adja meg egy következő tárgyaló adatait!\n");
            readOffice();
            System.out.println("Adja meg keresett tárgyaló nevét!");
            String searchedName= scanner.next();
            office.printMeetingRoomsWithName(searchedName);
            System.out.println("");
            System.out.println("");
        }
        if (number == 7) {
            readOffice();
            System.out.println("Kérem most adja meg egy következő tárgyaló adatait!\n");
            readOffice();
            System.out.println("Adja meg keresett tárgyaló nevének a részét!");
            String searchedNamePart= scanner.next();
            office.printMeetingRoomsContains(searchedNamePart);
            System.out.println("");
        }
        if (number == 8) {
            readOffice();
            System.out.println("Kérem most adja meg egy következő tárgyaló adatait!\n");
            readOffice();
            System.out.println("Adja meg a terület határt!");
            int areaBiggerThan= scanner.nextInt();
            office.printAreasLargerThan(areaBiggerThan);
            System.out.println("");
        }
        if (number == 9) {
            System.out.println("A művelet befejezve");
            return;
        }
        printMenu();
    }

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }
}
