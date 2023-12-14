package be7.oop2;

import be7.model.*;

public class EX34 {
    public static void main(String[] args) {
        // 다형성 활용 : 다형성 배열
        Animal[] ani = {new Dog(), new Cat()};
        myArray(ani);

    }
    public static void myArray(Animal[] ani) {
        for (int i = 0; i < ani.length; i++) {
            ani[i].eat();
            ani[i].move();
            if(ani[i] instanceof Cat) {
                ((Cat)ani[i]).night();
            }
        }
    }
}
