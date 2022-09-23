import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class functions {
    //password, min length, reccommended length, maximum length
    public static boolean authenticateLength(String password){
        if(8 <= password.length())
            return true;
        else
            return false;
    }
    //password, checking if special character is present
    public static boolean specialCharacter(String password){
        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher hasSpecial = special.matcher(password);
        return hasSpecial.find();
    }

    public static boolean hasNum(String password) {
        char[] chars = password.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return true;
            } else
                continue;
        }
        return false;
    }
    // password, checking if it contains at least one upper case
    public static boolean oneUpperCase(String password){
        for(char c: password.toCharArray()){
            if (Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }
}
