package objectclass;

public class Beer {

    private String name;
    private int price;

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public boolean equals(Object o){
        return this==o;
    }

    @Override
    public String toString() {
        return "name: " + name +" "+ price+ " + price";
    }
}
