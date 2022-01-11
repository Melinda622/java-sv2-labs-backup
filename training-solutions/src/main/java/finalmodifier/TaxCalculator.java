package finalmodifier;

public class TaxCalculator {
    public static final double VAT = 0.27;

    public double tax(double price) {
        return VAT * price;
    }

    public double priceWithTax(double price) {
        return price + tax(price);
    }

    public static void main(String[] args) {
        TaxCalculator taxcalculator = new TaxCalculator();

        System.out.println(taxcalculator.tax(500));
        System.out.println(taxcalculator.priceWithTax(500));
    }
}
