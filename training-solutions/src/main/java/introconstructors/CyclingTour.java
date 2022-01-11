package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public int registerPerson(int person) {
        return this.numberOfPeople = this.numberOfPeople + person;
    }

    public double ride(double km) {
        return this.kms = this.kms + km;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public static void main(String[] args) {

        System.out.println(LocalDate.of(2021, 11, 11));
        CyclingTour danubeTour = new CyclingTour("Cycle along the Danube to Visegrád", LocalDate.of(2021, 11, 11));
        System.out.println(danubeTour.getDescription());
        System.out.println(danubeTour.getStartTime());
        System.out.println(danubeTour.getKms());
        System.out.println(danubeTour.getNumberOfPeople());

        danubeTour.registerPerson(10);
        danubeTour.ride(50);

        System.out.println(danubeTour.getDescription());
        System.out.println(danubeTour.getStartTime());
        System.out.println(danubeTour.getKms());
        System.out.println(danubeTour.getNumberOfPeople());
    }
}
