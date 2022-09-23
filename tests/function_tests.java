import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class function_tests {

    @Test
    public void testAuthenticateLengthTrue(){
        assertEquals(true, functions.authenticateLength("Christmas"));
    }
    @Test
    public void testAuthenticateLengthFalse(){
        assertEquals(false, functions.authenticateLength("Christ"));
    }

    @Test
    public void testSpecialCharacterTrue() {assertEquals(true, functions.specialCharacter("password!"));}
    @Test
    public void testSpecialCharacterFalse() {assertEquals(false, functions.specialCharacter("password"));}

    @Test
    public void upperCaseTrueCases(){
        assertEquals(true, functions.oneUpperCase("Password!"));
        assertEquals(true, functions.oneUpperCase("passworD!"));
        assertEquals(true, functions.oneUpperCase("passWord!"));
        assertEquals(true, functions.oneUpperCase("PASSMEWORD!"));
    }

    @Test
    public void upperCaseFalseCases(){
        assertEquals(false, functions.oneUpperCase("password"));
        assertEquals(false, functions.oneUpperCase("passw!rd"));

    }
}
