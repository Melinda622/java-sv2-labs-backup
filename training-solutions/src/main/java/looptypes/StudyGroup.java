package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {
   public void printStudyGroups(List<String> students) {
       for (int i = 0; i < students.size(); i++) {
           if (students.get(i).length() <= 10) {
               System.out.print(students.get(i) + ":" + " "+"1. group");
               System.out.println();
           } else {
               System.out.print(students.get(i) +":"+" "+"2.group");
               System.out.println();
           }
       }
   }
    public static void main(String[] args) {

        List<String> group=new ArrayList(Arrays.asList("John Doe","Vladimir Trockij","Kiss Töhötöm","Jane Doe", "Végh Béla"));
        System.out.println(group);

        StudyGroup study=new StudyGroup();
        study.printStudyGroups(group);
    }
}
