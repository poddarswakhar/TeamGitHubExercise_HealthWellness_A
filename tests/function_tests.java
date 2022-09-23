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
}
