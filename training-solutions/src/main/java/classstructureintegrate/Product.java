package classstructureintegrate;

public class Product {
    private String name;
    private int price;

    public Product(String name,int price){
        this.name=name;
        this.price=price;
    }

    public int increasePrice(int amount){
        return price=price+amount;
    }

    public int decreasePrice(int amount){
        return price=price-amount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
