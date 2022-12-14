import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(10, calculator.add(5,5));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(10,5));
    }

    @Test
    public void canMultiply(){
        assertEquals(25, calculator.multiply(5,5));
    }

    @Test
    public void canDivide(){
        assertEquals(1, calculator.divide(5,5), 0.0);
    }

}
