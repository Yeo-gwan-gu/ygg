package fc.java.Course1.part4.ch05;

import fc.java.Course1.poly.Animal;
import fc.java.Course1.poly.Cat;
import fc.java.Course1.poly.Dog;

public class IsNotOverride {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night();

    }
}
