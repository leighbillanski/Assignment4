package DIP;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotFlyTest {

    NotFly notFly = new NotFly();
    String str,str1;

    @Before
    public void setUp() throws Exception {
        str = "I eat seeds.";
        str1 = "I walk on ground";
    }

    @Test
    public void canEat() {
        assertSame(str,notFly.canEat());
    }

    @Test
    public void move() {
        assertSame(str1,notFly.move());
    }
}