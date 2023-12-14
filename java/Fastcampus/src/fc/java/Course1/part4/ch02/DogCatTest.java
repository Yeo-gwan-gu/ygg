package fc.java.Course1.part4.ch02;

import fc.java.Course1.model.Cat;
import fc.java.Course1.model.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        // Q. Dog 객체를 생성하고 eat() 동작을 구동해 보시오.
        Dog d = new Dog();
        d.eat();

        // Q. Cat 객체를 생성하고 eat() 동작과 night()를 구동해 보시오.
        Cat c = new Cat();
        c.eat();
        c.night();
        // eat() --> 중복적인 구조


    }
}
