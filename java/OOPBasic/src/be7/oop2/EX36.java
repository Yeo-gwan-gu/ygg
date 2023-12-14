package be7.oop2;

import be7.model.*;

public class EX36 {
    public static void main(String[] args) {
        // Object --> toString()
        BookDTO dto = new BookDTO("자바", 30000, "홍길동", 500);
        System.out.println(dto.toString());

        String str = "APPLE";
        System.out.println(str);

        // A, B 클래스를 저장할 배열을 생성?
        // A[], B[] => Object[]
        Object[] obj = {new A(), new B()}; // 2. 다형성 배열
        objectArray(obj); // Call by reference

    }
    public static void objectArray(Object[] obj) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof A) {
                ((A) obj[i]).display();
            } else {
                ((B) obj[i]).display();
            }
        }
    }
}
