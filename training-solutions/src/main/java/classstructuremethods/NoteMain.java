package classstructuremethods;

import com.sun.security.jgss.GSSUtil;

public class NoteMain {
    public static void main(String[] args) {
        Note note=new Note();
        note.setName("Joe Black");
        note.setTopic("Java");
        note.setText("Java is an object-oriented programming language");


        System.out.println(note.getNoteText());
    }
}
