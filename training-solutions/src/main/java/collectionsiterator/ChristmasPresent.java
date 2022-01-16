package collectionsiterator;

public class ChristmasPresent {

    private String description;
    private String nameOfPerson;
    private int price;

    public ChristmasPresent(String description, String nameOfPerson, int price) {
        this.description = description;
        this.nameOfPerson = nameOfPerson;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ChristmasPresent{" +
                "description='" + description + '\'' +
                ", name='" + nameOfPerson + '\'' +
                ", price=" + price +
                '}';
    }
}
