package InheritanceBetter;

public class Carinore implements Animal {

    @Override
    public String makeSound(String sound) {
        return null;
    }

    @Override
    public String canEat(String eat) {
        return "I eat " + eat;
    }
}
