package be7.oop2;

import be7.model.IntArray;
import be7.model.Remocon;

public class EX27 {
    public static void main(String[] args) {
        // 정수 5개를 배열에 저장하고 총합을 구하여 출력하시오.
        // 부모 = 자식
        Remocon arr = new IntArray(); // 부모인터페이스명 변수명 = new 자식클래스명(); --> 자동형변환(upCasting)
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println(arr.size());

    }
}
