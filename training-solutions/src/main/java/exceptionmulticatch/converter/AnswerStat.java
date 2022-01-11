package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter converter) {
        this.converter = converter;
    }

    public int answerTruePercent(String answers) {
        boolean[] output =
                converter.binaryStringToBooleanArray(answers);

        double countTrue = 0;

        for (boolean b : output) {
            if (b) {
                countTrue++;
            }
        }
        double percentage = countTrue / output.length * 100;
        return (int) Math.round(percentage);
    }

    public boolean[] convert(String input) {

        try {
            return converter.binaryStringToBooleanArray(input);
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new InvalidBinaryStringException("Invalid input", e);
        }
    }
}
