package classstructuremethods;

import com.sun.security.jgss.GSSUtil;

public class ClientMain {

    public static void main(String[] args) {
        Client client=new Client();

        client.setName("Joe Black");
        client.setYear(1970);
        client.setAddress("4 Oxford Street");

        System.out.println("Name:"+client.getName());
        System.out.println("Year of birth:"+client.getYear());
        System.out.println("Address:"+client.getAddress());

        client.migrate("10 Carnaby street");

        System.out.println("Address successfully modified, new address after move:"+" "+client.getAddress());
    }

}
