package interfacedependencyinversion.amount;

public class BankAtm implements Payable{

    @Override
    public int getPayableAmount(int amount) {
        String stringAmount=Integer.toString(amount);

        String hundred=Character.toString(stringAmount.charAt(stringAmount.length()-3));
        String decimal=Character.toString(stringAmount.charAt(stringAmount.length()-2));
        String number=Character.toString(stringAmount.charAt(stringAmount.length()-1));

        String outputString=hundred+decimal+number;
        int output=Integer.parseInt(outputString);
        return amount+Math.abs(1000-output);
    }
}
