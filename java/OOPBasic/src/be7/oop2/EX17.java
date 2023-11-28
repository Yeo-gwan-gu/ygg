package be7.oop2;

public class EX17 { // 시작객체, 메인클래스
    public static void main(String[] args) {
        // 자료형 : 사용자정의 자료형(UDDT) - class(메인클래스와 다름)
        // [정수] 1개를 저장할 [변수를 선언] 하시오.
        int a=1;
        int b=2;

        // [책] 1권을 저장할 [변수를 선언] 하시오.
        // Book b;
        String title = "자바";
        int price = 30000;
        String name = "김길동";
        int page = 500;
        // 위의 4개의 [데이터를 이동] 해보시오.
        EX17.bookPrint(title,price,name,page); // call
    }
    // 매개변수로 책 정보를 받아서 출력하는 메서드를 정의(bookPrint)
    public static void bookPrint(String title,int price,String name,int page) {
        System.out.println(title+"\t"+price+"\t"+name+"\t"+page);
    }
}
