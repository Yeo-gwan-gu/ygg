package fc.java.part2.ch7;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        // Q. switch~case 문을 활용하여 요일에 해당하는 운동을 출력하시오.
        // Sunday : 야구하기
        // Monday : 농구하기
        // Tuesday : 수영하기
        // Wednesday : 수영하기
        // Friday : 휴식
        // Saterday : 휴식

//        String day = "Sunday"; // 야구하기
        Scanner scan = new Scanner(System.in);
        System.out.print("요일을 적으세요 : ");
        String day = scan.nextLine();

        switch(day) {
            case "Sunday" :
                System.out.println("야구하기");
                break;
            case "Monday" :
                System.out.println("농구하기");
                break;
            case "Tuesday" :
            case "Wednesday" :
                System.out.println("수영하기");
                break;
            default :
                System.out.println("휴식");
        }
    }
}
