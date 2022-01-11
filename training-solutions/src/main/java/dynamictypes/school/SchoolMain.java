package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {
        School school = new School("Corvinus", 3);
        System.out.println(school);
        School school2 = new PrimarySchool("Lisznyai", 8);
        System.out.println(school2);
        School school3 = new SecondarySchool("Arany", 4);
        System.out.println(school3);
    }
}
