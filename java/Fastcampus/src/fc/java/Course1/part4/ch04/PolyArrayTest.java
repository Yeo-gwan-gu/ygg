package fc.java.Course1.part4.ch04;

import fc.java.Course1.model.Animal;
import fc.java.Course1.model.Cat;
import fc.java.Course1.model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        // Dog, Cat 을 저장할 배열을 생성하시오.
        // Animal[] ani = {new Dog(), new Cat()};
        // 다형성 배열
        Animal[] ani = new Animal[2];
        ani[0] = d;
        ani[1] = c;
        display(ani);

    }
    public static void display(Animal[] ani) {
        for (int i = 0; i < ani.length; i++) {
            ani[i].eat(); // ani[0] = Dog, ani[1] = Cat

            if (ani[i] instanceof Cat) {
                ((Cat) ani[i]).night(); // Cat 타입일 경우에만 실행
            }

        }
    }
}