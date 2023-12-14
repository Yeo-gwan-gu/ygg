package fc.java.Course1.part2.ch7;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        // Q. 80점 이상의 학생 중에서 90점 이상은 A반, 85점 이상은 B반,
        // 그렇지 않으면 C반으로 편성하고 점수가 80점 미만이면 불합격 처리하는 프로그램을 만드시오.
        // 단, 점수는 0~100 사이값으로 입력 받는디ㅏ.

        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int a = scan.nextInt();

        if (a > 0 && a <=100) {
            if (a >= 80) {
                if (a >= 90) {
                    System.out.println("A반 입니다.");
                } else if (a >= 85) {
                    System.out.println("B반 입니다.");
                } else if (a < 85) {
                    System.out.println("C반 입니다.");
                } else {
                    System.out.println("불합격 입니다.");
                }
            } else {
                System.out.println("유효한 점수가 아닙니다.");
            }
        }
    }
}
