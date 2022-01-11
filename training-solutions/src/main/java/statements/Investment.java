package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public double getYield(int days) {
        return (double) fund * (double) interestRate / 100 / 365 * (double) days;
    }

    public double close(int days) {
        double amountPaidOut = ((double) getFund() + getYield(50)) * 9997 / 10000;
        double payment = active ? amountPaidOut : 0;
        setActive(false);
        return payment;
    }

    public void setActive(boolean active) {
        this.active = active;
        ;
    }

    public int getFund() {
        return fund;
    }
}
