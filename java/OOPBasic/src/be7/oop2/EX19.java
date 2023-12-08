package be7.oop2;

import be7.model.BookDTO;

public class EX19 {
    public static void main(String[] args) {
        BookDTO b = new BookDTO();
        System.out.println(b.getTitle()+"\t"+b.getPrice()+"\t"+b.getName()+"\t"+b.getPage());
        // toString() : 디버깅 용도
        System.out.println(b.toString());
        System.out.println(b); // b.toSting()

        // 초기화는 개발자가 하고 싶은 대로 할 수 있어야 한다.
        // 오라클 40000  나길동 300
        BookDTO b1 = new BookDTO("오라클", 40000, "나길동", 300);
        System.out.println(b1);
    }

}
