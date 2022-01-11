package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private long balance;
    private Currency currency;
    private static final List<Rate> RATES;

    static {
        List<Rate> rates = new ArrayList<>();

         rates.add(new Rate(Currency.EUR, 360.25));
         rates.add(new Rate(Currency.USD, 340.25));
         rates.add(new Rate(Currency.CHF, 350.25));

        RATES = rates;
    }

    public List<Rate> getRates(){
        return RATES;
    }

    public CreditCard(long balance, Currency currency) {
        for (Rate r : RATES) {
            if (r.getCurrency()==currency) {
                balance=(long) (balance * r.getConversionFactor());
            }
        }
        this.currency=currency;
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {

            for (Rate r : RATES) {
                if (r.getCurrency()==currency) {
                    long result=(long) (amount * r.getConversionFactor());
                    if(balance>=result){
                        setBalance(balance - result);
                        return true;
                    }
                }
            }
            return false;
    }

    public boolean payment(long amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
