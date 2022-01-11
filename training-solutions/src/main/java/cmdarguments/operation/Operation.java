package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("list")) {
                System.out.println("Listázás");
            }
            if (args[i].equals("add")) {
                System.out.println("Hozzáadás");
            }
            if (args[i].equals("delete")) {
                System.out.println("Törles");
            }
            if (!args[i].equals("add") && !args[i].equals("list") && !args[i].equals("delete")) {
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}
