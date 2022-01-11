package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    List<String> students = Arrays.asList("Gárdos Helga", "Joó Lilla", "Kiss József", "Nagy Béla",
            "Németh Dóra", "Pongrácz Imola", "Rendes Richárd", "Szabó Nóra", "Takács Júlia", "Vígh Elemér");

    public String getTodayReferringStudent(int number) {
        return students.get(number - 1);
    }

    public String getTodayReferringStudent(Number number) {
        return students.get(number.value - 1);
    }

    public String getTodayReferringStudent(String numberName) {
        int number = 0;
        for (Number n : Number.values()) {
            if (numberName.equalsIgnoreCase(n.name())) {
                number = n.value;
            }
        }

        for (int i = 0; i < students.size(); i++) {
            if (i == (number - 1)) {
                return students.get(i);
            }
        }
        return null;
    }

    public List<String> getStudents() {
        return students;
    }
}


