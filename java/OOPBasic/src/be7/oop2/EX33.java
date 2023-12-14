package be7.oop2;
import be7.model.*;

public class EX33 {
    public static void main(String[] args) {
        // 다형성 활용 : 다형성 인수
        display(new Dog());
        display(new Cat());


    }
    public static void display(Animal d) { // 다형성 인수
        d.eat();
        d.move();
        if (d instanceof Cat) { // 어떤 타입으로 다운캐스팅 할 것인지 정확하게 파악
            ((Cat)d).night();
        }
    }

}
