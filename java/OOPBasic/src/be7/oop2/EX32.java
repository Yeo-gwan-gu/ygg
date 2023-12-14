package be7.oop2;

import be7.model.*;

public class EX32 {
    public static void main(String[] args) {
      // Animal ani = new Animal(); --> 객체생성 불가
      // 다형성 이론 전제조건 --> 보장
      // 1) 상속 관계(부모=추상클래스(50%)/인터페이스(100%))
      // 2) 재정의가 선행
      // 3) 업캐스팅(객체 생성) --> 부모를 사용
      // 4) 동적바인딩
      Animal ani = new Dog(); // UpCasting
      ani.eat();
      ani.move();

      ani = new Cat();
      ani.eat();
      ani.move();
      Cat c = (Cat)ani; // DownCasting
      c.night();
      ((Cat)ani).night(); // DownCasting --> .(dot)연산자가 우선순위이기 때문에 형변환()를 ()로 한번 더 감싸서 순위를 올린다.
    }
}
