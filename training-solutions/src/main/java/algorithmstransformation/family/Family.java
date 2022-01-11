package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    List<FamilyMember> familyMembers=new ArrayList<>();

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String firstName){
        List<Integer> result=new ArrayList<>();
        for (FamilyMember f: familyMembers){
            if(f.getName().contains(firstName)){
                result.add(f.getAge());
            }
        }return result;
    }

    public void addFamilyMember(FamilyMember familyMember){
        familyMembers.add(familyMember);
    }


    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }
}
