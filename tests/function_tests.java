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
    public void testForNumbersTrue() {assertEquals(true, functions.hasNum("password123"));}
    @Test
    public void testForNumbersFalse() {assertEquals(true, functions.hasNum("password"));}
}
