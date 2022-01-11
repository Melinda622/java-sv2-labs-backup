package introexceptionthrow;

public class AdultContent {
    public static void main(String[] args) {

        Adult adult=new Adult("Joe",18);
        Adult adult2=new Adult("Jack",17);

        System.out.println(adult.getAge());
        System.out.println(adult2.getAge());
    }
}
