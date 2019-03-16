package DIP;

public class NotFly implements Bird {
    @Override
    public String canEat() {
        return "I eat seeds.";
    }

    @Override
    public String  move() {
        return "I walk on ground";
    }
}
