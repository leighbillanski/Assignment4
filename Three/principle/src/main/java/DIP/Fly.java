package DIP;

public class Fly implements Bird {
    @Override
    public String canEat() {
        return "I eat seeds.";
    }

    @Override
    public String move() {
        return "I can fly.";

    }
}
