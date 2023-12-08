package be7.model;

public class MyCalc {
    // Utility Object --> API

    // Q. 두 개의 정수를 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의(add)
    public static int add(int a, int b) {
        return a+b;
    }
    // Q. 두 개의 정수를 매개변수로 받아서 뺄셈을 구하여 리턴하는 메서드를 정의(sub)
    public static int sub(int a, int b) {
        return a-b;
    }
    // Q. 두 개의 정수를 매개변수로 받아서 곱셈을 구하여 리턴하는 메서드를 정의(mul)
    public static int mul(int a, int b) {
        return a*b;
    }
    // Q. 두 개의 정수를 매개변수로 받아서 나눗셈을 구하여 리턴하는 메서드를 정의(div)
    public static int div(int a, int b) {
        return a/b;
    }
}
