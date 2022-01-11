package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public int getMaxPoints() {
        return maxPoints;
    }

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        int count = 0;
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        for (Integer i : results) {
            double limitInPoints = maxPoints * limitInPercent / 100.0;
            if (i >= limitInPoints) {
                count++;
            }
        }
        return count;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        boolean hasFailed = false;
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        for (Integer i : results) {
            double limitInPoints = maxPoints * limitInPercent / 100.0;
            if (i < limitInPoints) {
                hasFailed = true;
            }
        }
        return hasFailed;
    }
}
