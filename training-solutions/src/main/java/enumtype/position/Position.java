package enumtype.position;

public enum Position {
    BUSINESS_ANALYST(500_000, "cell phone"), PROJECT_MANAGER(600_000, "company car"), SOFTWARE_ENGINEER(460_000, "gym membership");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
