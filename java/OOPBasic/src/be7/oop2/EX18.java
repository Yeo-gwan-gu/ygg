package be7.oop2;

import be7.model.BookDTO;

public class EX18 {
    public static void main(String[] args) {
        // [정수] 1개를 저장할 [변수를 선언] 하시오.
        int a;
        // [책] 한권을 저장할 [변수를 선언] 하시오.
        // [책]을 저장하기 위한 [객체를 생성] 하는 방법
        BookDTO b = new BookDTO(); // new(객체 생성 연산자), BookDTO(생성자 메서드)
        b.setTitle("자바");
        b.setPrice(30000);
        b.setName("홍길동");
        b.setPage(300);

        // 위의 책 1권의 정보를 [호출] 하여 [출력] 하시오.
        EX18.bookPrint(b); // 번지전달기법(Call By Reference)
    }
    // 매개변수로 책 1권을 받아서 출력하시오(bookPrint)
    public static void bookPrint(BookDTO b) {
        System.out.println(b.getTitle()); // 자바
        System.out.println(b.getPrice()); // 30000
        System.out.println(b.getName()); // 홍길동
        System.out.println(b.getPage()); // 300
    }
}
