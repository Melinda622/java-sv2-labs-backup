package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimarySchool {

    List<Person> persons;

    public PrimarySchool(List<Person> persons) {
        this.persons = persons;
    }

    public List<Student> getStudents(){
        List<Student>students=new ArrayList<>();
        for (Person p: persons){
            if(p.getAge()<18) {
                students.add(new Student(p.getName(), p.getAddress()));
            }
        }return students;
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Kiss Béla", 56, "1118 Budapest, Sasadi út 34."),
                new Person("Nagy Béla", 10, "1031 Budapest, Vizimolnár utca 22."),
                new Person("Nagy Erika", 6, "1031 Budapest, Vizimolnár utca 22."),
                new Person("Németh Gyöngyi", 32, "1144 Budapest, Füredi utca 7."),
                new Person("Asztalos László", 8, "1149 Budapest, Nagy Lajos király útja 104."),
                new Person("Siklós", 43, "1144 Budapest, Füredi utca 7."));
        PrimarySchool primarySchool=new PrimarySchool(persons);
        System.out.println(primarySchool.getStudents().size());



    }
}
