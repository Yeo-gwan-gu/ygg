package be7.oop2;

import java.util.Scanner;

public class EX24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Q. 정수 여러개를 입력 받아서 출력하시오. (-1)을 입력하면 종료하시오.

//        while (true) { // while의 조건식이 true일 경우 무한 반복한다.(무한루프)
//            System.out.print("정수를 입력하세요 : ");
//            int data = scan.nextInt(); // blocking(블럭킹)
//            if (data == -1) break; // 무한루프가 종료되어 탈출할 수 있도록 break를 넣어줘야한다.
//        } // while_

        int data;
        System.out.print("정수를 입력하세요 : ");
        while ((data=scan.nextInt()) != -1) {
            System.out.println(data);
            System.out.print("정수를 입력하세요 : ");
        } // while_
        System.out.println("종료");
    }
}
