package collectionsequalshash;

import java.util.LinkedList;
import java.util.List;

public class WebShop {

    private List<Product> products=new LinkedList<>();

    public void add(Product product){
        products.add(product);
    }

    public int findHowMany(Product product){
        int result=0;

        for (Product p: products) {
            if(p.equals(product)){
                result++;
            }
        }return result;
    }

    public static void main(String[] args) {

        WebShop webShop=new WebShop();

        webShop.add(new Product("toothBrush","12346"));
        webShop.add(new Product("toothPaste","12545"));
        webShop.add(new Product("toothBrush2","12346"));
        webShop.add(new Product("toothPaste2","12545"));
        webShop.add(new Product("toothBrush2","12346"));
        webShop.add(new Product("toothPaste3","12545"));
        webShop.add(new Product("dentalFloss","125457"));
        webShop.add(new Product("toothPaste4","12545"));

        System.out.println(webShop.findHowMany(new Product("toothBrush","12346")));
        System.out.println(webShop.findHowMany(new Product("toothPaste","12545")));
        System.out.println(webShop.findHowMany(new Product("dentalFloss","125457")));
    }
}
