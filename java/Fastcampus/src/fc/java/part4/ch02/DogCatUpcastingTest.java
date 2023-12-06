package fc.java.part4.ch02;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Dog 객체를 사용해보자
        // Dog d = new Dog();
        // d.eat();
        Animal a = new Dog();
        a.eat();
        a = new Cat();
        a.eat();
    }
}
