package algorithmsdecision;

public class Prime {

    public boolean isPrime(int number) {
        boolean prime = true;
        if (number < 2) {
            prime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
