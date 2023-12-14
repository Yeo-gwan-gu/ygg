package be7.oop2;

import be7.model.Animal;
import be7.model.Cat;
import be7.model.Dog;

public class EX31 {
    public static void main(String[] args) {

        Dog g = new Dog();
        g.eat();
        g.move();
        Cat c = new Cat();
        c.eat();
        c.night();
        c.move();
    }
}
