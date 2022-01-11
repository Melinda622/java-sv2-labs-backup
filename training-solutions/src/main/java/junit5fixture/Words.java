package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    List<String> words=new ArrayList<>();

    public void addWord(String word){
        words.add(word);
    }

    public void getWordsStartWith(String prefix){
        List<String> wordsToBeDeleted=new ArrayList<>();
        for (String s:words){
            if(!s.substring(0,prefix.length()).equalsIgnoreCase(prefix)) {
                wordsToBeDeleted.add(s);
            }
        }words.removeAll(wordsToBeDeleted);
    }

    public void getWordsWithLength(int length){
        List<String> wordsToBeDeleted=new ArrayList<>();
        for(String s:words){
            if(s.length()!=length){
                wordsToBeDeleted.add(s);
            }
        }words.removeAll(wordsToBeDeleted);
    }

    public List<String> getWords() {
        return words;
    }
}
