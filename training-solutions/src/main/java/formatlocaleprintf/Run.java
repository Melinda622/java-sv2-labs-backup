package formatlocaleprintf;

import java.time.LocalDate;
import java.util.*;

public class Run {
    private List<Double> distance = new ArrayList<>();
    private String name;


    public Run(List<Double> distance, String name) {
        this.distance = distance;
        this.name = name;
    }

    public void printFormattedRunText() {
        String greeting = String.format("%s", getName());
        String dateString = LocalDate.now().toString();
        String date = String.format("%s", dateString);
        for (int i = 0; i < distance.size(); i++) {
            System.out.printf("Kedves " + greeting + "! A mai dátum: " + date + ".! Ezen a héten ez a(z) " + i + ". futásod. Most %.1f km-t futottál.\n", distance.get(i));
        }
    }

    public void addRun(double km) {
        distance.add(km);
    }

    public List<Double> getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Run run = new Run(new ArrayList<>(Arrays.asList(3.4)), "Kiss Béla");

        run.addRun(12.8);
        run.addRun(10.5);
        run.addRun(21.1);

        run.printFormattedRunText();

    }
}


