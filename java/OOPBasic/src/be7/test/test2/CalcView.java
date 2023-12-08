package be7.test.test2;

import java.util.Scanner;

public class CalcView {
    Scanner scan = new Scanner(System.in);
    public String inputNumber(NumberDTO number) {
        System.out.println("두 수와 연산자를 입력하세요.(ex. 6  7  +) : ");
        // return에 두 수를 저장하고 연산자를 op에 저장하여 리턴하도록 구현
        System.out.print("첫번째 수 : ");
        int num1 = scan.nextInt();
        System.out.print("두번째 수 : ");
        int num2 = scan.nextInt();
        System.out.print("연산자를 입력하세요 : ");
        String op = scan.next();

        number.setNum1(num1);
        number.setNum2(num2);

        return op;
    }
    public void printResult(NumberDTO number, String op) {
        System.out.printf("두 수 %d와 %d의 ", number.getNum1(), number.getNum2());
        // switch ~ case 문을 이용하여 op에 따라 add, sub, mul, div를 출력하고 최종 결과값을 출력하는 부분 구현
        switch (op) {
            case "+":
                System.out.printf("add의 결과는 %.2f입니다.\n", number.getResult());
                break;
            case "-":
                System.out.printf("sub의 결과는 %.2f입니다.\n", number.getResult());
                break;
            case "*":
                System.out.printf("mul의 결과는 %.2f입니다.\n", number.getResult());
                break;
            case "/":
                System.out.printf("div의 결과는 %.2f입니다.\n", number.getResult());
                break;
            case "E":
                System.out.printf("프로그램이 종료됩니다.");
                break;
        }
    }
}
