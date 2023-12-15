package fc.java.Course2.Part1;

import fc.java.Course2.model2.Book;

import java.util.ArrayList;

public class ArrayListBestTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력 하시오.
        // Book[], Object[]
        ArrayList<Book> list = new ArrayList<>(); // 기본 크기(10) / <> 안에 있는 객체 타입에 맞는 형태로만 입력
        list.add(new Book("Java", 30000, "한빛", "홍길동"));
        list.add(new Book("C++", 15000, "대림", "나길동"));
        list.add(new Book("Python", 50000, "정보", "김길동"));

        Book vo = list.get(0); // <Book> 형태로 타입을 맞추어 입력했기 때문에 DownCasting을 하지 않아도 된다.
        System.out.println(vo);
        vo = list.get(1); // <Book> 형태로 타입을 맞추어 입력했기 때문에 DownCasting을 하지 않아도 된다.
        System.out.println(vo);
        vo = list.get(2); // <Book> 형태로 타입을 맞추어 입력했기 때문에 DownCasting을 하지 않아도 된다.
        System.out.println(vo);

        System.out.println(); // 줄바꿈

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // Object --> Book(JVM에서 자동으로 Book의 toString())
        }
    }
}