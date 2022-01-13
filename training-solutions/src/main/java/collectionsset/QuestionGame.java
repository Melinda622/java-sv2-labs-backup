package collectionsset;

import java.util.*;

public class QuestionGame {

    public List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> answers) {
        this.rightAnswers = answers;
    }

    public Set<String> drawWinners() {

        Set<String> winners = new HashSet<>();

        if (rightAnswers.size() < 5) {
            throw new IllegalArgumentException("Not enough right answers!");
        }

        while (winners.size() < 5) {

            Random random = new Random();
            int randomIndex = random.nextInt(0, rightAnswers.size());
            RightAnswer rightAnswer;
            rightAnswer = rightAnswers.get(randomIndex);
            winners.add(rightAnswer.getSolver());

            rightAnswers.remove(rightAnswer);
        }
        return winners;
    }
}
