package DIP;

public class Fly implements Bird {
    @Override
    public void canEat(String food) {
        System.out.println("I eat seeds.");
    }

    @Override
    public void move() {
        System.out.println("I can fly.");

    }
}
