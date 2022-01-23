package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

    private List<Integer> selectWinningNumbers(int ballCount) {
        List<Integer> numbersOnBalls = new ArrayList<>();
        for (int i = 0; i < ballCount; i++) {
            numbersOnBalls.add(i);
        }
        Collections.shuffle(numbersOnBalls);
        return numbersOnBalls;
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if(lotteryType>=ballCount){
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }
        List<Integer> winningNumbers = new ArrayList<>();
        List<Integer> numbersOnBalls = selectWinningNumbers(ballCount);
        while (winningNumbers.size() < lotteryType) {
            int index = new Random().nextInt(0, numbersOnBalls.size() - 1);
            int number = numbersOnBalls.get(index);

            if (!winningNumbers.contains(number)) {
                winningNumbers.add(number);
            }
        }
        Collections.sort(winningNumbers);
        return winningNumbers;
    }
}
