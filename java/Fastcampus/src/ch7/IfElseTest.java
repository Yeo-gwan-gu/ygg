package ch7;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        // Q. 정수 1개를 입력받아 짝수인지 홀수인지 판단하는 프로그램을 만드시오.
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int num = scan.nextInt();

        if (num % 2 != 0) {
            System.out.println("홀수입니다.");
        } else {
            System.out.println("짝수입니다.");
        }


        // Q. 입력 받은 수가 12의 배수인지 출력하는 코드를 작성하시오.
        Scanner scan1 = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 : ");
        int num1 = scan1.nextInt();

        if (num1 % 12 == 0) {
            System.out.println("12의 배수입니다.");
        } else {
            System.out.println("12의 배수가 아닙니다.");
        }

        // Q. 년도를 입력 받아서 해당 년도가 윤년인지 아닌지를 판단하여 출력하는 코드를 작성하시오.
        // (윤년:2월29일이 존재하는 연도, 4의 배수이며 100의 배수인 해 이거나 400의 배수인 해)

        Scanner scan2 = new Scanner(System.in);
        System.out.print("년도를 입력하시오 : ");
        int num2 = scan2.nextInt();

        if (num2 % 4 == 0) {
            System.out.println("윤년입니다.");
        } else if (num2 % 100 == 0) {
            System.out.println("윤년입니다.");
        } else if (num2 % 400 == 0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
