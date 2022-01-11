package catalog;

import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature {

    private List<String> authors = new ArrayList<>();
    private int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if(title.isEmpty()){
            throw new IllegalArgumentException("Empty title");
        }else if(Validators.isEmpty(authors)){
            throw new IllegalArgumentException("authors null");
        }else if(numberOfPages<0){
            throw new IllegalArgumentException("pages cannot be under 0");
        }

        /*else if(authors==null){
            throw new IllegalArgumentException("authors null");
        }else if(numberOfPages<0){
            throw new IllegalArgumentException("pages cannt be under 0");
        }*/
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
