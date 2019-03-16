package Inheritance;

public class Herbivore extends Animal {

    @Override
    public String canEat(String eat) {
        return "I eat "+ eat;
    }
}
