package be7.oop1;

public class EX11 {
    public static void main(String[] args) {
        // 1. 1씩 증가하는 모든 표현
        int a = 10;
        a+=1;
        a=a+1;
        a++;
        ++a;
        System.out.println(a); // 10 + 1 + 1 + 1 + 1 = 14
        System.out.println(a++); // 후위형 연산자 -> 후에 + 연산 실행
        System.out.println(a); // ++ --> 14+1 = 15
        System.out.println(++a); // 16

        // 2. 누적
        // 1~100까지의 총 합을 구하시오.
        int hap = 0;
        for (int i = 1; i <= 100; i++) {
            hap+=i;
        }
        System.out.println(hap); // 5050

        // 3. 카운트
        // 1~10 까지의 수 중 짝수의 수와 홀수의 수를 출력
        int evenCnt = 0; // 짝수
        int oddCnt = 0; // 홀수

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenCnt++; // 카운트
            } else {
                oddCnt++; // 카운트
            } // if_
        } // for_
        System.out.println("evenCnt = " + evenCnt); //5
        System.out.println("oddCnt = " + oddCnt); // 5

        // 4. swap(메모리 교환)  --> 두개의 변수에 저장된 데이터를 서로 이동할 시 tmp(빈공간)을 꼭 만들어 줘야한다.
        int x = 10;
        int y = 20;
        int tmp; // 메모리 교환용 빈공간

        tmp=x; // tmp에 x값 저장
        x=y;   // x에 y값 저장
        y=tmp; // tmp에 있던 x값 y로 이동
        System.out.println("x = " + x); // 10 -> 20
        System.out.println("y = " + y); // 20 -> 10
    }
}
