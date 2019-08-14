import org.junit.Test;
import org.testng.annotations.ITestAnnotation;

import static junit.framework.TestCase.assertEquals;

public class DivisorTests {

    @Test
    public void checkThereIsNoRemainder(){
        assertEquals(true, Divisor.divisorCalculator(5));
    }

    @Test
    public void checkThereIsARemainder(){
        assertEquals(false, Divisor.divisorCalculator(6));
    }

    @Test
    public void checkThereIsNoRemainderInputtingTwoNumbers(){
        assertEquals(true, Divisor.divisorCalculatorOnAnyNumbers(5, 35));
    }

    @Test
    public void checkThereIsARemainderOnInputtingTwoNumbers(){
        assertEquals(false, Divisor.divisorCalculatorOnAnyNumbers(6, 35));
    }

    @Test
    public void checkEachNumberWhichGoesIntoY(){
        assertEquals(2, Divisor.divisorCalculatorUpToAChosenNumber(10));
    }

}
