package fc.java.part4.ch04;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyTest {
    public static void main(String[] args) {
        // Upcasting 으로 객체를 생성
        // 상속관계, 재정의(Override), 동적 바인딩
        // 다형성(message polymorphism)
        // 상위클래스가 동일한 메세지로 하위클래스를 서로 다르게 동작시키는 객체지향 원리
        Animal x = new Dog();
        x.eat(); // 실행 시점에서 사용될(호출될) 메서드가 결정되는 바인딩(동적바인딩) --> 개처럼 먹다.

        x = new Cat();
        x.eat(); // --> 고양이처럼 먹다.

        // DownCasting(다운캐스팅)
        ((Cat)x).night(); // --> 밤에 눈에서 빛이 난다.
        // Overloading(오버로딩) : 정적 바인딩 = 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
        // --> 프로그램의 실행 속도와 관계가 없다. (X)
        // Override(재정의) : 동적바인딩 = 실행시점에서 사용될(호출될)메서드가 결정되는 바인딩
        // --> 프로그램의 실행 속도와 관계가 있다. (O)


    }
}
