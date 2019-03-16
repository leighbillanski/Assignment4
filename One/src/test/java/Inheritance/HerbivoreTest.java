package Inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HerbivoreTest {

    Herbivore herbivore = new Herbivore();
    String food;

    @Before
    public void setUp() throws Exception {
        food = "I eat grass";
    }

    @Test
    public void canEat() {
        assertEquals(food,herbivore.canEat("grass"));
        assertNotSame(food,herbivore.canEat("grass"));
    }
}