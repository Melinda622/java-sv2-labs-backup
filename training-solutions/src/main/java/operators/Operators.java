package operators;

public class Operators {

    public boolean isEven(int n){
        return n%2==0;
    }

    public void getResultOfDivision(int number, int divisor){
        int remainder= number%divisor;
        int result=number/divisor;
        System.out.println(number+"/"+divisor+"="+result+","+"maradék: "+remainder);
    }

    public String isNull(String s){
       return s==null?"null értékű":"nem null értékű";
    }

   public boolean isEmpty(String s){
       return s == null || s.equals("");
   }
}
