package Inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZebraTest {

    Zebra zebra = new Zebra();
    String sound,food;

    @Before
    public void setUp() throws Exception {
        food = "I eat grass";
        sound ="I whinny";
    }

    @Test
    public void makeSound() {
        assertEquals(sound,zebra.makeSound("whinny"));
        assertNotSame(sound,zebra.makeSound("whinny"));
    }

    @Test
    public void canEat() {
        assertEquals(food,zebra.canEat("grass"));
        assertNotSame(food,zebra.canEat("grass"));
    }

}