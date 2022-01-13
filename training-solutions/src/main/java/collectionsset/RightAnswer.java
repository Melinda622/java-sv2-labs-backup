package collectionsset;

import java.util.Objects;

public class RightAnswer {

    private String solver;

    public RightAnswer(String solver) {
        this.solver = solver;
    }

    public String getSolver() {
        return solver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RightAnswer that = (RightAnswer) o;
        return solver.equals(that.solver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(solver);
    }
}
