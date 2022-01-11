package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        Position businessAnalyst = Position.BUSINESS_ANALYST;
        System.out.println(businessAnalyst.getSalary());
        System.out.println(businessAnalyst.getBenefit());

        Position projectManager = Position.PROJECT_MANAGER;
        System.out.println(projectManager.getSalary());
        System.out.println(projectManager.getBenefit());
    }
}
