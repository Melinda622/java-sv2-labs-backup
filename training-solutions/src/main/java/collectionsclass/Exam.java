package collectionsclass;

import java.util.*;

public class Exam {

    List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<String> successful = new ArrayList<>();
        Collections.sort(examResults);
        Collections.reverse(examResults);

        for (int i = 0; i < places; i++) {
            successful.add(examResults.get(i).getName());
        }
        return successful;
    }
}
