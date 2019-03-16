package DIP;

public class NotFly extends Bird {

    @Override
    public void canEat(String food) {
        super.canEat("seed");
    }
     public void move(){
        System.out.println("I walk on ground.");
     }
}
