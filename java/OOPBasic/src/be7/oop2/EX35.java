package be7.oop2;

import be7.model.*;

public class EX35 {
    public static void main(String[] args) {
        // 다형성 Object 이해
        // A 객체를 UpCasting으로 생성하시오.
        Object obj = new A();
        System.out.println(obj.toString()); // 번지값 출력 : A@30f39991
        ((A)obj).display();

        obj = new B();
        ((B)obj).display();

        printDisplay(new A());
        printDisplay(new B());
    }
    public static void printDisplay(Object obj) { // 다형성 인수

        if (obj instanceof A) {
            ((A)obj).display();
        } else {
            ((B)obj).display();
        }
    }
}
