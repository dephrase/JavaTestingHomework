import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testCalculatorSubtract5and2equals3(){
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void testAdd5and2equals7(){
        assertEquals(7, calculator.add(5, 2));
    }

    @Test
    public void testDivide9and3equals3(){
        assertEquals(3, calculator.divide(9, 3), 0.0);
    }

    @Test
    public void testMultiply3and7equals21(){
        assertEquals(27, calculator.multiply(9,3));
    }


}
