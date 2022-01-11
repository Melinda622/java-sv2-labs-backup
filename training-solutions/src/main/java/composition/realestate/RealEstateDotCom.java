package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address1 = new Address("Budapest", "1014", "Fő utca", 3);
        Details details1 = new Details("villa", address1, 120, 300);
        RealEstate realEstate1 = new RealEstate("Rozsadomb", 100_000_000, details1);

        System.out.println(address1.toString());
        System.out.println(details1.toString());
        System.out.println(realEstate1.toString());

        System.out.println(address1.getCity());
        System.out.println(details1.getDescription());
        System.out.println(realEstate1.getPrice());
    }
}
