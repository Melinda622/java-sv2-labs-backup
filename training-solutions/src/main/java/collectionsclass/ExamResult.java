package collectionsclass;

public class ExamResult implements Comparable<ExamResult> {

    private String name;
    private int result;

    public ExamResult(String name, int result) {
        this.name = name;
        this.result = result;
    }

    @Override
    public int compareTo(ExamResult e) {
        return this.result - e.result;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }
}
