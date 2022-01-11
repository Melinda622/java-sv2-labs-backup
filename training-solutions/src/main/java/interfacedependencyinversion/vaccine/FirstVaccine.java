package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {

        for (Person p : registrated) {
            if (p.getPregnant() == Pregnancy.YES) {
                vaccinationList.add(p);
            }
        }

        for (Person p : registrated) {
            if (p.getAge() > 65) {
                vaccinationList.add(p);
            }
        }

        for (Person p : registrated) {
            if (p.getAge() <= 65 && p.getPregnant() == Pregnancy.NO) {
                vaccinationList.add(p);
            }
        }
    }
}
