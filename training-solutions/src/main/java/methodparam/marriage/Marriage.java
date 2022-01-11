package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man) {
        changeMaidenName(woman, man);
        addRegisterDate(woman, man);
    }

    private void addRegisterDate(Woman woman, Man man) {
        woman.addDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
        man.addDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
    }

    public void changeMaidenName(Woman woman, Man man) {
        String lastNameOfWife = woman.getName().substring(0, woman.getName().indexOf(" "));
        String firstNameOfWife = woman.getName().substring(woman.getName().indexOf(" "));

        String lastNameOfHusband = man.getName().substring(0, man.getName().indexOf(" "));
        woman.setName(lastNameOfHusband + "-" + lastNameOfWife + firstNameOfWife);
    }
}
