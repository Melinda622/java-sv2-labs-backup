package methodpass;

public class One {

    public int addOne(int number){
       return number+1;
    }

    public static void main(String[] args) {
        One one =new One();

        int number=2;
        System.out.println(2);

        number+=1;
        System.out.println(number);

        one.addOne(4);
        System.out.println(number);
    }
}
