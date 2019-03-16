package ISP;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OwlTest {

    Owl owl = new Owl();
    String eat,fly,sound;

    @Before
    public void setUp() throws Exception {
        eat = "I eat seeds.";
        fly = "I can fly.";
        sound = "I say who-who.";
    }

    @Test
    public void fly() {
        assertSame(fly,owl.fly());
    }

    @Test
    public void eat() {
        assertSame(eat,owl.eat());
    }

    @Test
    public void sound() {
        assertSame(sound,owl.sound());
    }
}