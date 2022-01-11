package methodparam.marriage;

import java.util.ArrayList;
import java.util.List;

public class Man {

    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public Man(String name, List<RegisterDate> registerDates) {
        this.name = name;
        this.registerDates = registerDates;
    }

    public void addDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }
}
