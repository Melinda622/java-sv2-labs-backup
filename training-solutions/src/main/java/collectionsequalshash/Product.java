package collectionsequalshash;

import java.util.Objects;

public class Product {

    private String name;
    private String regNumber;

    public Product(String name, String regNumber) {
        this.name = name;
        this.regNumber = regNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(((Product)obj).regNumber,this.regNumber);
    }

    public String getName() {
        return name;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
