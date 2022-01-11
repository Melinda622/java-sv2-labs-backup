package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public List<String> createToDoList() {

        List<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String s = "";
        System.out.println("Please add the items on the to-do-list. If you are finished, just enter x.");
        do {
            s = scanner.nextLine();
            if (!s.equalsIgnoreCase("x")) {
                toDoList.add(s);
            }
        } while (!s.equalsIgnoreCase("x"));
        return toDoList;
    }

    public void printToDoList() {

        try {
            Files.write(Paths.get("src/main/java/introexceptionwritefile/todolist.txt"), createToDoList());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ToDo toDo = new ToDo();
        toDo.printToDoList();
    }
}
