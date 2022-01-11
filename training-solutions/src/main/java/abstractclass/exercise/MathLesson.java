package abstractclass.exercise;

public class MathLesson {

    public static void main(String[] args) {

        MathExercise mathExercise = new Adder();
        MathExercise mathExercise2 = new Subtracter();
        MathExercise mathExercise3 = new Multiplier();
        MathExercise mathExercise4 = new Divisor();

        System.out.println(mathExercise.getSolution(4, 5));
        System.out.println(mathExercise2.getSolution(6, 4));
        System.out.println(mathExercise3.getSolution(3, 2));
        System.out.println(mathExercise4.getSolution(6, 2));
    }
}
