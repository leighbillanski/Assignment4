package Polymorphism;

import Inheritance.*;

public class Main {

    public static void main(String[] args){
        Animal myLion = new Lion();
        Animal myZebra = new Zebra();

        System.out.println(myLion.canEat("meat"));
        System.out.println(myZebra.makeSound("whinny"));

    }

}
