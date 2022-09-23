public class functions {
    //password, min length, reccommended length, maximum length
    public static boolean authenticateLength(String password){
        if(8 <= password.length())
            return true;
        else
            return false;
    }
}
