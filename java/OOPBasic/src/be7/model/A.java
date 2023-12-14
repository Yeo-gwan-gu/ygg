package be7.model;
import java.lang.*; // 생략

public class A extends Object{
    public A() { // 생략
        super(); // new Object()
    }

    public void display() {
        System.out.println("나는 A이다.");
    }


    @Override
    public String toString() {
        // 부모의 toString()을 사용하고 싶다.
        System.out.println(super.toString()); // 번지
        return "A가 toSting()";
    }
}
