package fc.java.Course1.part2.ch7;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        // Q. 나누기와 나머지 연산자의 활용 (정수의 자릿수 구하기)
        int digit = 3625;
        System.out.println("digit = "+digit); // 3625
        System.out.println("일의 자릿수 = "+digit % 10); // 5
        System.out.println("십의 자릿수 = "+digit / 10 % 10); // 2
        System.out.println("백의 자릿수 = "+digit / 100 % 10); // 6
        System.out.println("천의 자릿수 = "+digit / 1000 % 10); // 3

        // 짝수(0), 홀수(1) / 배수
        // 홀수, 짝수 찾기
        int su = 5;
        if(su % 2 == 0) {
            System.out.println("su는 짝수입니다.");
        } else {
            System.out.println("su는 홀수입니다.");
        }
    }
}
