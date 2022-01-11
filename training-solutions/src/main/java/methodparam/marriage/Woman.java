package methodparam.marriage;

import java.time.LocalDate;
import java.util.List;

public class Woman {

    private String name;
    private List<RegisterDate> registerDates;

    public Woman(String name, List<RegisterDate> registerDates) {
        this.name = name;
        this.registerDates = registerDates;
    }

    public void addDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }
}
