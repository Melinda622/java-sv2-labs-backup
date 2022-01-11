package classstructureconstructor;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        stock = 0;
    }

    public int store(int quantity){
        return stock=stock+quantity;
    }

    public int dispatch(int quantity){
        return stock=stock-quantity;
    }

    public String getProduct(){
         return product;
    }

    public int getStock(){
        return stock;
    }
}
