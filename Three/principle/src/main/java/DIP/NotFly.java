package DIP;

public class NotFly implements Bird {
    @Override
    public void canEat(String food) {
        System.out.println("I eat seeds.");
    }

    @Override
    public void move() {
        System.out.println("I walk on ground");
    }
}
