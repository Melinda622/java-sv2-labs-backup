package algorithmssum;

public class TwoDigitEvens {

    public int getSum(){
        int sum=0;
        for (int i = 10; i <100 ; i++) {
            if(i%5!=0&&i%2!=0){
                sum+=i;
            }
        }return sum;
    }
}
