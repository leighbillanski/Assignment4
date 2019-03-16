package DIP;

public class Fly extends Bird{

    @Override
    public void canEat(String food) {
        super.canEat("seeds.");
    }
    public void move(){
        System.out.println("I can fly.");
    }
}
