package stringmethods.filename;

import java.util.Locale;

public class FileNameManipulator {
    public char findLastCharacter(String s){
        return s.charAt(s.length()-1);
    }

    public String findFileExtension(String fileName){
        return fileName.substring(fileName.length()-3);
    }

    public boolean identifyFileByExtension(String ext, String fileName){
        return ext.equals(fileName.substring(fileName.length()-3));
    }

    public boolean compareFilesByName(String searchedFileName,String actualFileName){
            return searchedFileName.equalsIgnoreCase(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName){
       String lower=fileName.trim().substring(fileName.length()-3).toLowerCase();
       String namePart=fileName.substring(0,fileName.length()-3);
        return namePart+lower;
    }

    public String replaceStringPart(String fileName,String present,String target){
        if (fileName.contains(present)){
            return fileName=fileName.replace(present,target);
        }return fileName;
    }
    public static void main(String[] args) {
        FileNameManipulator file=new FileNameManipulator();

        String t="install.exe";
        String p="install.EXE";

        System.out.println(file.findFileExtension(t));
        System.out.println(file.identifyFileByExtension("exe",t));
        System.out.println(file.compareFilesByName(t,p));
        System.out.println(file.changeExtensionToLowerCase(p));
        System.out.println(file.replaceStringPart(t,"exe","jar"));
    }
}
