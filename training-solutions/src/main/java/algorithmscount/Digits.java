package algorithmscount;

public class Digits {

    public int getCountOfNumbers() {
        int count = 0;

        for (int i = 10; i < 100; i++) {

            if (((i / 10) + 5) == i % 10 || (i / 10) == ((i % 10) + 5)) {
                count++;
            }
        }return count;
    }
}
