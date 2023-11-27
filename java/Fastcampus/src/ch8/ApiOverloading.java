package ch8;

public class ApiOverloading {
    public static void main(String[] args) {
        // Method Overloading
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE");

        int max = maxValue(7,9);
        System.out.println("max = " + max);

        int min = minValue(3, 8);
        System.out.println("min = " + min);
    }

    // Q. 두개의 정수를 매개변수로 받아서 더 큰 수를 리턴하는 메서드를 정의하시오.
    public static int maxValue(int a, int b) {
        return (a>b) ? a : b;
    } // maxValue_

    // Q. 두개의 정수를 매개변수로 받아서 더 작은 수를 리턴하는 메서드를 정의하시오.
    public static int minValue(int a, int b) {
        return (a<b) ? a : b;
    } // minValue_
}
