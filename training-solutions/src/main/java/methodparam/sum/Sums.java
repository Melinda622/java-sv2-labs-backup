package methodparam.sum;

public class Sums {

    double sumPositive;
    double sumNegative;

    public Sums(double sumPositive, double sumNegative) {
        this.sumPositive = sumPositive;
        this.sumNegative = sumNegative;
    }

    @Override
    public String toString() {
        return "Sum{" +
                "sumPositive=" + sumPositive +
                ", sumNegative=" + sumNegative +
                '}';
    }

    public double getSumPositives() {
        return sumPositive;
    }

    public void setSumPositive(double sumPositive) {
        this.sumPositive = sumPositive;
    }

    public double getSumNegatives() {
        return sumNegative;
    }

    public void setSumNegative(double sumNegative) {
        this.sumNegative = sumNegative;
    }
}
