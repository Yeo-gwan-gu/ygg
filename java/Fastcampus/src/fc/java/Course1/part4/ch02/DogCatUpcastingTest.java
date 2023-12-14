package fc.java.Course1.part4.ch02;

import fc.java.Course1.model.Cat;
import fc.java.Course1.model.Animal;
import fc.java.Course1.model.Dog;

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
