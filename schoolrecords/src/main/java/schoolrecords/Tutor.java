package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    List<Subject> subjects=new ArrayList<>();

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public boolean tutorTeachingSubject(Subject subject){
        for (Subject s:subjects) {
           if( s.getName().equals(subject.getName())){
               return true;
           }
        }return false;
    }

    public String getName() {
        return name;
    }
}
