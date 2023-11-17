package Level1;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        int sum1 = B % 10; // 일의 자릿수
        int sum2 = (B/10) % 10; // 십의 자릿수
        int sum3 = (B/100) % 10; // 백의 자릿수

        System.out.println(A*sum1); // 2360
        System.out.println(A*sum2); // 3776
        System.out.println(A*sum3); // 1416
        System.out.println((A*sum1)+((A*sum2)*10)+((A*sum3)*100)); // 181720

    }
}
