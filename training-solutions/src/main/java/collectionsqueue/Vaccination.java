package collectionsqueue;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> result = new PriorityQueue<>();
        for (Person p : people) {
            if (p.getAge() >= 18 && p.getAge() <= 65) {
                result.add(p.getAge());
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Vaccination vaccination = new Vaccination();

        List<Person> people = new LinkedList<>();
        people.add(new Person("John Doe", 30));
        people.add(new Person("Jane Doe", 20));
        people.add(new Person("Jill Doe", 60));
        people.add(new Person("James Doe",40));
        people.add(new Person("Jordan Doe",45));

        System.out.println(vaccination.getVaccinationOrder(people));
        Queue<Integer> result = vaccination.getVaccinationOrder(people);
        System.out.println(result.poll());
    }
}
