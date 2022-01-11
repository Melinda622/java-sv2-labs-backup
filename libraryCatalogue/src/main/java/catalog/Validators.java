package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String word){
        if(word==null){
            return true;
        }else if(word!=null&&word.isBlank()){
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List<String> items){
        return (items==null||items.size()==0);
    }
}
