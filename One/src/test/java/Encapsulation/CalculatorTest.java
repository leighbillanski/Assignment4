package Encapsulation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private int num1,num2,sum;
    Calculator calculator = new Calculator();
    @Before
    public void setUp() throws Exception {

        num1 = 4;
        num2 = 6;
        sum = num1 + num2;

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSum() {
        calculator.setSum(6,4);
        assertEquals(sum , calculator.getSum());

    }

    @Test
    public void setSum() {
        calculator.setSum(6,4);
        assertEquals(sum , calculator.getSum());

    }
}