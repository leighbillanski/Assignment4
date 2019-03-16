package DIP;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlyTest {

    Fly fly = new Fly();
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void canEat() {
        assertSame("I eat seeds.", fly.canEat());
    }

    @Test
    public void move() {
        assertSame("I can fly.", fly.move());
    }
}