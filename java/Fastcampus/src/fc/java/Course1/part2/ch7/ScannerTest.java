package fc.java.Course1.part2.ch7;
//import java.util.Scanner;
import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        // Q. 키보드로부터 데이터를 입력받는 방법 실습
        // 제목 : 자바
        // 가격 : 30000
        // 출판사 : 패스트캠퍼스
        // 저자 : 저자
        // 페이지수 : 700
        // ISBN : 1199110

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요 : ");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.print("문자를 입력하세요 : ");
        String str = scan.next();
        System.out.println("str = " + str);

        scan.nextLine(); // 버퍼 비우기
        System.out.print("문자를 입력하세요 : ");
        String str2 = scan.nextLine();
        System.out.println("str = " + str2);
    }
}
