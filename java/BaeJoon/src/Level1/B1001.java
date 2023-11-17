//        문제
//        두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//        출력
//        첫째 줄에 A-B를 출력한다.
package Level1;

import java.util.Scanner;

public class B1001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        System.out.println(A-B);
    }
}
