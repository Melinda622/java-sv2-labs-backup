package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private MarkType markType;
    private List<Mark> grades=new ArrayList<>();

    public Student(String name) {

        if(name.equals("")){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public void grading(Mark mark){
        if(mark==null){
            throw new NullPointerException("Mark must not be null!");
        }
        grades.add(mark);
    }

    public double calculateAverage(){
        double sum=0;
        double average=0;

        if (grades.isEmpty()){
            return 0.0;
        }

        for (Mark m:grades) {
            sum+=m.getMarkType().getNumberValue();
        }
        average=sum/grades.size();
        average=Math.round(average*100);
        average=average/100;
        return average;
    }

    public double calculateSubjectAverage(Subject subject){
        double sum=0;
        double average=0;
        int count=0;
        if (grades.isEmpty()){
            return 0.0;
        }
        for (Mark m:grades) {
            if(m.getSubject().getName().equalsIgnoreCase(subject.getName())) {
                sum += m.getMarkType().getNumberValue();
                count++;
            }
        }
        if(count==0){
            return 0.0;
        }
        average=sum/count;
        return average;
    }
    public String toString(){

        return name+" marks: "+grades.get(grades.size()-1).getSubject().getName()+": "+grades.get(grades.size()-1).getMarkType().getStringValue()+"("+grades.get(grades.size()-1).getMarkType().getNumberValue()+")";
    }

    public String getName() {
        return name;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public List<Mark> getGrades() {
        return grades;
    }
}
