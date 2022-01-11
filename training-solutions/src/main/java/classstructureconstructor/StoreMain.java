package classstructureconstructor;

public class StoreMain {
    public static void main(String[] args) {
        Store product1 =new Store("toothbrush");
        System.out.println("Opening stock of toothbrush: "+ product1.getStock());

        Store product2 =new Store("toothpaste");
        System.out.println("Opening stock of toothpaste: "+ product2.getStock());

        product1.store(4);
        System.out.println("Current stock of toothbrush after goods receipt: "+ product1.getStock());

        product1.dispatch(4);
        System.out.println("Current stock of toothbrush after dispatch: "+ product1.getStock());

        product2.store(5);
        System.out.println("Current stock of toothpaste after goods receipt: "+ product2.getStock());

        product2.dispatch(3);
        System.out.println("Current stock of toothpaste after dispatch: "+ product2.getStock());

    }
}
