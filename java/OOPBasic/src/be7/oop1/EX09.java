package be7.oop1;

public class EX09 {
    public static void main(String[] args) {
        // 변수 -> 배열
        // 변수 -> 메서드?

        int a = 300; // 매개변수
        int b = 500; // 매개변수
         // a+b=800 --> 메서드 호출(Call)
        int sum = intHap(a,b);  // 메서드명(실인수)
        System.out.println(sum); // 300+500=800

    }
    // 매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 메서드를 정의(intHap)
    public static int intHap(int a, int b) {  // 접근제어자 리턴타입 메서드명(매개변수) {} static은 같은 static끼리 호출가능
        int sum = a+b; // a, b의 총합
        return sum; // 리턴(결과값) --> intHap에 담는다 -> intHap=변수역할  ---> int intHap = sum;
    }
}
/*
- 메서드 파라메터 전달방식, 메서드 오버로딩, static 개념, JVM 동작방식(메서드 관점)
- 사용자정의 자료형, class(클래스), Book(책), Movie(영화) 객체 만들어 보기
 */
