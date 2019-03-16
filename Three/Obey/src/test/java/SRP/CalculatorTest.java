package SRP;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Before
    public void setUp() throws Exception {
        calculator.calcSum(5,5);
    }

    @Test
    public void getSum() {
        assertEquals(10, calculator.getSum());
    }
}