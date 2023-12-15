package fc.java.Course2.Part1;

import fc.java.Course2.model2.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력 하시오.
        // Book[], Object[]
        ArrayList list = new ArrayList(); // 기본 크기(10)
        list.add(new Book("Java", 30000, "한빛", "홍길동"));
        list.add(new Book("C++", 15000, "대림", "나길동"));
        list.add(new Book("Python", 50000, "정보", "김길동"));

//        Book vo = (Book)list.get(0); // DownCasting : Book <-- (Book)Object
//        System.out.println(vo);
//        vo = (Book)list.get(1); // DownCasting : Book <-- (Book)Object
//        System.out.println(vo);
//        vo = (Book)list.get(2); // DownCasting : Book <-- (Book)Object
//        System.out.println(vo);

        System.out.println(); // 줄바꿈

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // Object --> Book(JVM에서 자동으로 Book의 toString())
        }
    }
}