package fc.java.part4.ch03;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal --> Dog, Cat
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat(); // 업캐스팅(UpCasting)
        ani.eat();

        Cat c = (Cat)ani;  // 다운캐스팅(DownCasting) 부모 --> 자식 강제 형변환
        c.night();

        ((Cat)ani).night(); // 한줄로 표현

    }
}
