package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem bill = new BillItem("toothbrush", 500, 3, 0.27);
        System.out.println(bill.getProduct());
        System.out.println(bill.calculatePrice());
    }
}
