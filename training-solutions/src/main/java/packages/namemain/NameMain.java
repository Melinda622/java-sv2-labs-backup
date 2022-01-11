package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        Prefix prefix=new Prefix("Dr.");
        FirstName first=new FirstName("John");
        LastName last=new LastName("Carter");

        System.out.println(prefix.getPre()+" "+first.getFirst()+" "+last.getLast());
    }
}
