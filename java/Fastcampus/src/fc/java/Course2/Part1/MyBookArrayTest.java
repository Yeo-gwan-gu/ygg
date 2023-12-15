package fc.java.Course2.Part1;

import fc.java.Course2.model2.Book;
import fc.java.Course2.model2.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        // 책 3권의 데이터를 배열에 저장하고 출력하시오.
        BookArray list = new BookArray(); // 책, 길이(5)
        list.add(new Book("Java", 30000, "한빛", "홍길동"));
        list.add(new Book("C++", 15000, "대림", "나길동"));
        list.add(new Book("Python", 50000, "정보", "김길동"));

        Book vo = list.get(0);
        System.out.println(vo); // Book{title='Java', price=30000, company='한빛', author='홍길동'}
        vo = list.get(1);
        System.out.println(vo); // Book{title='C++', price=15000, company='대림', author='나길동'}
        vo = list.get(2);
        System.out.println(vo); // Book{title='Python', price=50000, company='정보', author='김길동'}

//      기본 for문 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
