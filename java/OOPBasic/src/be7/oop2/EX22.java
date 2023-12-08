package be7.oop2;

import be7.model.BookDTO;
import be7.model.MyCalc;

import java.util.Scanner;

public class EX22 {
    public static void main(String[] args) {
        // MyCalc, java.lang,Math Scanner
        // 키보드로부터 데이터 입력받기
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력 1 : ");
        int su1=scan.nextInt();
        System.out.print("정수 입력 2 : ");
        int su2=scan.nextInt();
        scan.close();
        System.out.println(MyCalc.add(su1,su2)); // a+b
        System.out.println(MyCalc.sub(su1,su2)); // a-b
        System.out.println(MyCalc.mul(su1,su2)); // a*b
        System.out.println(MyCalc.div(su1,su2)); // a/b

    }
}
