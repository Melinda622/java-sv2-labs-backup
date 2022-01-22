package searching;

import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {

    private String regNumber;
    private String description;
    private LocalDate entryDate;

    public LostProperty(String regNumber, String description, LocalDate entryDate) {
        this.regNumber = regNumber;
        this.description = description;
        this.entryDate = entryDate;
    }

    public LostProperty(String description, LocalDate entryDate) {
        this.description = description;
        this.entryDate = entryDate;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty that = (LostProperty) o;
        return description.equals(that.description) && entryDate.equals(that.entryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, entryDate);
    }

    @Override
    public int compareTo(LostProperty o) {
        if (!this.description.equals(o.description)) {
            return this.description.compareTo(o.description);
        } else {
            return this.entryDate.compareTo(o.entryDate);
        }
    }
}
