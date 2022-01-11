package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LongWord implements FileOperations{

    List <String> words=new ArrayList<>();

    @Override
    public List<String> readFromFile(Path path) {
        this.words=FileOperations.super.readFromFile(path);
        return words;
    }

    @Override
    public String getLongWord() {
       return words.get(0)+words.get(words.size()-1);
    }
}
