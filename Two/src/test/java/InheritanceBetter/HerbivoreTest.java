package InheritanceBetter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class HerbivoreTest {

    Herbivore herbivore = new Herbivore();
    String food,sound;

    @Before
    public void setUp() throws Exception {
        food = "I eat grass";
        sound = null;
    }

    @Test
    public void canEat() {
        assertEquals(food,herbivore.canEat("grass"));
        assertNotSame(food,herbivore.canEat("grass"));
    }

    @Test
    public void makeSound(){
        assertEquals(sound,herbivore.makeSound(null));
    }
}