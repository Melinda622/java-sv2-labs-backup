package objectclass;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String author;
    private String title;


    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public boolean equals(Object o){
        return this==o;
    }

    @Override
    public String toString() {
        return "author: " + author +" "+ title+ " + title";
    }

}
