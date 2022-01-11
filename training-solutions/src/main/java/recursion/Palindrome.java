package recursion;

public class Palindrome {

    public boolean isPalindrome(String word){
        if(word.length()>1) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                String temp = word.substring(1, word.length() - 1);
                isPalindrome(temp);
                return true;
            }else{
                return false;
            }
        }else{
            return true;
        }
    }
}
