package introexceptionthrow;

public class Validation {

    public void validateName(String name){
        if(name==null||name.equals("")){
            throw new IllegalArgumentException("Your name cannot be empty!");
        }
    }

    public void validateAge(String ageString){

        if(ageString.equals("")){
            throw new IllegalArgumentException("Your age cannot be empty!");
        }
        int age=Integer.parseInt(ageString);
        if(age<0){
            throw new IllegalArgumentException("Your age must be between 0 and 120!");
        }else if(age>120) {
            throw new IllegalArgumentException("Your age must be between 0 and 120!");
        }
    }
}
