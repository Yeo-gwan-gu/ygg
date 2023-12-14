package be7.oop2;

import be7.model.BookDTO;
import be7.model.ObjectArray;

import java.util.ArrayList;

public class EX38 {
    public static void main(String[] args) {
//      10 이라는 정수를 만들어 보시오.
        int a = 10;
        Integer aa = new Integer(10); // Wrapper Class(기본자료형을 객체자료형으로 바꾸어 사용하는 클래스)
        System.out.println(aa.intValue()); // aa.toSting() -> 10

//      Integer = int (X)
        Integer bb = 10; // boxing(박싱) -> API가 자동으로 들어가도록 박싱 -> new Integer(10)

//      int = Integer (X)
        int cc = new Integer(30); // unBoxing(언박싱)
        System.out.println(cc);

        ObjectArray<Integer> arr = new ObjectArray<>();
//      arr.add(new Integer(10));
        arr.add(10); // boxing
        arr.add(20);
        arr.add(30);
        for (int i = 0; i < arr.size(); i++) {
//          int data = arr.get(0); // unboxing
            System.out.println(arr.get(i));
        }

//      Object[] -> BookDTO[]
//      List API - ArrayList -> Object[]
//      ArrayList<BookDTO> arrL = new ArrayList<>();
        ObjectArray<BookDTO> brr = new ObjectArray<>();
        brr.add(new BookDTO("자바", 30000, "홍길동", 300));
        brr.add(new BookDTO("스프링", 50000, "김길동", 500));
        brr.add(new BookDTO("CS", 15000, "나길동", 100));
        for (int i = 0; i < brr.size(); i++) {
            System.out.println(brr.get(i));
        }
    }
}
