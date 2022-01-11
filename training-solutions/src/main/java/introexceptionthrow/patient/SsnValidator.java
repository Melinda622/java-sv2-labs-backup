package introexceptionthrow.patient;

import java.util.Arrays;

public class SsnValidator {
    public boolean isValidSsn(String ssn){
        boolean result=false;

        if(ssn.length()!=9){
            throw new IllegalArgumentException("A TAJ számnak 9 számjegyűnek kell lennie!");
        }

        for (int i = 0; i < ssn.length(); i++) {
          if (Character.isDigit(ssn.charAt(i))){
              result=true;
          }else{
              result=false;
              return result;
          }
        }

        int[] a=new int[ssn.length()-1];
        for (int i = 0; i <ssn.length()-1; i++) {
           a[i]=Character.getNumericValue(ssn.charAt(i));
        }
        int sum=0;
        for (int i = 0; i <ssn.length()-1 ; i++) {
            if((i+1)%2==0){
               a[i]=a[i]*7;
            }else if((i+1)%2==1){
                a[i]=a[i]*3;
            }
            sum+=a[i];
        }
        int lastDigit=Character.getNumericValue(ssn.charAt(8));
        if (sum%10==lastDigit){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
}
