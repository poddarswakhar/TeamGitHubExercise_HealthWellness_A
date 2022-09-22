public class functions {
    //password, min length, reccommended length, maximum length
    public static boolean authenticateLength(String password, int min){
        if(min <= password.length())
            return true;
        else
            return false;
    }
}
