package attributes.bill;

public class BillItem {
    private String product;
    private int price;
    private int quantity;
    double vatPercent;

    public BillItem(String product, int price, int quantity, double vatPercent) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.vatPercent = vatPercent;
    }

    public double calculatePrice() {
        return price * (1 + vatPercent) * quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double vatPercent() {
        return vatPercent;
    }
}