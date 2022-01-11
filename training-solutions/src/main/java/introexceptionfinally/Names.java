package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Names {

    public String nameWithDr(List<String> names){
        String result="";
        for (int i = 0; i < names.size() ; i++) {
            if (names.get(i).startsWith("dr")) {
                result=names.get(i);
                return result;
            }
        }   return result;
    }

    public static void main(String[] args) {
        Names name=new Names();

        //Dr-t tartalamazo nevek
       /* try {
            List<String> names = Files.readAllLines(Paths.get("src/main/java/introexceptionfinally/names.txt"));
            if(name.nameWithDr(names)==""){
                System.out.println("");
            }else{
                System.out.println(name.nameWithDr(names));
            }

        } catch (IOException ioe) {
            System.out.println("Cannot read file");
            ioe.printStackTrace();
        }finally{
            System.out.println("End of reading.");
        }*/

        //Dr-t nem tartalamazo nevek
        /*try {
            List<String> names = Files.readAllLines(Paths.get("src/main/java/introexceptionfinally/nameswithoutdr.txt"));
            if(name.nameWithDr(names)==""){
                System.out.println("");
            }else{
                System.out.println(name.nameWithDr(names));
            }

        } catch (IOException ioe) {
            System.out.println("Cannot read file");
            ioe.printStackTrace();
        }finally{
            System.out.println("End of reading.");
        }*/

        //Nem talalhato faljnev
        try {
            List<String> names = Files.readAllLines(Paths.get("src/main/java/introexceptionfinally/nameswithoutd.txt"));
            if(name.nameWithDr(names)==""){
                System.out.println("");
            }else{
                System.out.println(name.nameWithDr(names));
            }

        } catch (IOException ioe) {
            System.out.println("Cannot read file");
            ioe.printStackTrace();
        }finally{
            System.out.println("End of reading.");
        }
    }
}
