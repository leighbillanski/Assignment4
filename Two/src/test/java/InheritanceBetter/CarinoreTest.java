package InheritanceBetter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class CarinoreTest {

    private String food,sound;
    Carinore carinore = new Carinore();
    @Before
    public void setUp() throws Exception {
        food = "I eat meat";
        sound = null;
    }

    @Test
    public void canEat() {
        assertEquals(food,carinore.canEat("meat"));
        assertNotSame(food,carinore.canEat("meat"));
    }

    @Test
    public void makeSound(){
        assertEquals(sound,carinore.makeSound(null));
    }
}