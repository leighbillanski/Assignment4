package Inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LionTest {

    Lion lion = new Lion();
    String sound,food;

    @Before
    public void setUp() throws Exception {
        sound = "I roar";
        food = "I eat meat";
    }

    @Test
    public void makeSound() {
        assertEquals(sound,lion.makeSound("roar"));
        assertNotSame(sound,lion.makeSound("roar"));
    }

    @Test
    public void canEat() {
        assertEquals(food,lion.canEat("meat"));
        assertNotSame(food,lion.canEat("meat"));
    }
}