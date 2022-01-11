package interfacedependencyinversion.amount;

public class Cash implements Payable{

    @Override
    public int getPayableAmount(int amount) {

        String stringAmount=Integer.toString(amount);
        int number=Character.getNumericValue(stringAmount.charAt(stringAmount.length()-1));

        if(stringAmount.endsWith("1")||stringAmount.endsWith("2")){
            return amount-number;
        }else if(stringAmount.endsWith("3")||stringAmount.endsWith("4")){
           return amount+(5-number);
        }else if(stringAmount.endsWith("8")||stringAmount.endsWith("9")){
            return amount+(10-number);
        }else if(stringAmount.endsWith("6")||stringAmount.endsWith("7")){
           return amount-Math.abs(5-number);
        }else{
            return amount;
        }
    }
}
