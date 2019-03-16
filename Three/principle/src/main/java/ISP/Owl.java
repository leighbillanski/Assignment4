package ISP;

public class Owl implements Bird{
    @Override
    public String fly() {
        return "I can fly.";
    }

    @Override
    public String eat() {
        return "I eat seeds.";
    }

    @Override
    public String sound() {
        return "I say who-who.";
    }
}
