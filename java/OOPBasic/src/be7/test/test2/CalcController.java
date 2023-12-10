package be7.test.test2;

import java.util.Scanner;

public class CalcController {
    ICalcService service;
    public CalcController(ICalcService service) {
        this.service = service;
    }

    public void applicationStart() {
        CalcView view = new CalcView();
        // while에 로직을 구현하시오.(연산자에 따라서 switch~ case로 분기하면 된다.

        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            NumberDTO number = new NumberDTO();
            String op = view.inputNumber(number);

            switch (op) {
                case "+":
                    number = service.add(number);
                    break;
                case "-":
                    number = service.sub(number);
                    break;
                case "*":
                    number = service.mul(number);
                    break;
                case "/":
                    number = service.div(number);
                    break;
                case "%":
                    number = service.na(number);
                    break;
                case "E":
                    isRunning = false;
                    break;
                default:
                    System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
                    continue;
            }
            view.printResult(number, op);
        }
    }
}
