package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

   public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int min){
       boolean contains=false;
       for(BankAccount b:accounts){
           if(b.getBalance()>min){
               contains=true;
           }
       }return contains;
   }
}
