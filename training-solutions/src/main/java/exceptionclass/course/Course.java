package exceptionclass.course;

public class Course {

    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        if(begin==null){
            throw new IllegalArgumentException("Begin is null!");
        }else if(name==null){
            throw new IllegalArgumentException("Name is null!");
        } else{
            this.name = name;
            this.begin = begin;
        }
    }

    @Override
    public String toString() {
        return begin+": "+name;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }
}
