package catalog;

public class SearchCriteria {

    public String contributor;
    public String title;

    private SearchCriteria(String title, String contributor) {
        this.contributor = contributor;
        this.title = title;
    }

    public static SearchCriteria createByBoth(String title, String contributor){
        if(contributor==null){
            throw new IllegalArgumentException("Contributor is null");
        }else if(title==null){
                throw new IllegalArgumentException("Title is null");

        }else{
            return new SearchCriteria(title,contributor);
        }
    }

   public static SearchCriteria createByContributor(String contributor){
        if(contributor==null){
            throw new IllegalArgumentException("Contributor is null");
        }else{
            return new SearchCriteria("",contributor);
        }
   }

    public static SearchCriteria createByTitle(String title){
        if(title==null){
            throw new IllegalArgumentException("Title is null");
        }else{
            return new SearchCriteria(title,"");
        }
    }

    public boolean hasContributor(){
        return !Validators.isBlank(contributor);
    }

    public boolean hasTitle(){
       return !Validators.isBlank(title);
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }
}
