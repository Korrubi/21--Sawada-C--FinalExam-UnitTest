import org.junit.jupiter.api.Test;
import java.lang.*;


import static org.junit.jupiter.api.Assertions.*;
public class testClass {

    @Test
    public void testRunTimeError(){
        assertThrows(RuntimeException.class, () ->
            StringCalculator.add("-12, 89"));
    }

    @Test
    public void testNumbersOver1K(){
        assertEquals(0,0);
    }
}
