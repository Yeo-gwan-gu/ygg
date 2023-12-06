package fc.java.part4.ch04;

import fc.java.model.*;

public class PolyMethodTest {
    public static void main(String[] args) {

        Dog d = new Dog();
        display(d);

        Cat c = new Cat();
        display(c);
    }
//    public static void display(Dog d) {
//        d.eat();
//    }
//    public static void display(Cat c) {
//        c.eat();
//    }
    public static void display(Animal ani) { // 다형성인수 : 하나의 타입으로 여러개의 타입을 받을 수 있다.
        ani.eat();

        // Cat 타입으로 받은 경우에만 실행 --> if
        // ((Cat)ani).night();
        if(ani instanceof Cat) { // instanceof --> 타입확인 연산자
            ((Cat)ani).night();
        }
    }
}
