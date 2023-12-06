package fc.java.part4.ch02;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        // Upcasting(업캐스팅)
        Animal a = new Dog();
        a.eat();  // 출력값 : 개처럼 먹다.  // Animal --> (동적바인딩) --> Dog

        a = new Cat();
        a.eat();  // 출력값 : 고양이처럼 먹다.  // Animal --> (동적바인딩) --> Cat

    }
}
