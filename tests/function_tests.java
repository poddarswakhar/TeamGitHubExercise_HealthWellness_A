import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class function_tests {

    @Test
    public void testAuthenticateLengthTrue(){
        assertEquals(true, functions.authenticateLength("Christmas", 4));
    }
    @Test
    public void testAuthenticateLengthFalse(){
        assertEquals(false, functions.authenticateLength("Christmas", 10));
    }
}
