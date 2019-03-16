package Inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarinoreTest {

    private String food;
    Carinore carinore = new Carinore();
    @Before
    public void setUp() throws Exception {
        food = "I eat meat";
    }

    @Test
    public void canEat() {
        assertEquals(food,carinore.canEat("meat"));
        assertNotSame(food,carinore.canEat("meat"));
    }
}