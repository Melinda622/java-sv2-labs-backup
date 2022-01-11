package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private List<String> composer = new ArrayList<>();
    private List<String> performers = new ArrayList<>();
    private int length;
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }else if(Validators.isEmpty(performers)){
            throw new IllegalArgumentException("Empty performers");
        }else if(length<0){
            throw new IllegalArgumentException("length cannot be under 0");
        }
        this.performers = performers;
        this.length = length;
        this.title = title;
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }else if(Validators.isEmpty(performers)){
            throw new IllegalArgumentException("Empty performers");
        }else if(length<0){
            throw new IllegalArgumentException("length cannot be under 0");
        }
        this.composer = composer;
        this.performers = performers;
        this.length = length;
        this.title = title;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();

        for (String s : composer) {
            contributors.add(s);
        }

        for (String p : performers) {
            contributors.add(p);
        }

        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
