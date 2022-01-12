package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {

    private String companyName;
    private String tin;

    public Company(String companyName, String tin) {
        this.companyName = companyName;
        this.tin = tin;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            throw new NullPointerException();
        }else if(obj.getClass()!=Company.class){
            throw new IllegalArgumentException();
        }else if(this.companyName==null||this.tin==null){
            throw new NullPointerException();
        }
        return Objects.equals(((Company) obj).companyName,this.companyName)&&Objects.equals(((Company) obj).tin,this.tin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName,tin);
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTin() {
        return tin;
    }

    public static void main(String[] args) {

        Company company=new Company("Google","63376783");
        Company google=new Company("Google","63376783");
        Company meta=new Company("Meta","57576789");
        Company prezi=new Company("Prezi","468767836");

        Company test=new Company("Google","57558587");
        Company test2=new Company("Googli","63376783");

        List<Company> companies=new ArrayList<>();
        companies.add(google);
        companies.add(meta);
        companies.add(prezi);


        if(companies.contains(company)){
            System.out.println(true);
        }

        if(companies.contains(test)){
            System.out.println(true);
        }

        if(companies.contains(test2)){
            System.out.println(true);
        }
    }
}
