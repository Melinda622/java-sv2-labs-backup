package methodstructure.pendrives;

import java.util.List;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: ");
        sb.append(name);
        sb.append("capacity: ");
        sb.append(capacity);
        sb.append("price: ");
        return sb.toString();
    }

    public void risePrice(int percent) {
        price = (int) (price * (1 + (percent/100.0)));
    }

    public int comparePricePerCapacity(Pendrive other) {
        int result = 0;
        if (((price / capacity) - (other.getPrice() / other.getCapacity())) > 0.01) {
            result = 1;
        } else if (((price / capacity) - (other.getPrice() / other.getCapacity())) < -0.01)/*((price / capacity) < other.getPrice() / other.getCapacity()*/ {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    public boolean isCheaperThan(Pendrive other) {
        return getPrice() < other.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        System.out.println(10/100.0);

    }
}
