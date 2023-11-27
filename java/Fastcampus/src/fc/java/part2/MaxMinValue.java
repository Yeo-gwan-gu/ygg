package fc.java.part2;

public class MaxMinValue {
    public static void main(String[] args) {
        // Q. 삼항 연산자를 이용하여 정수 2개 중 max value와 min value 를 출력하시오.
        // min : 10, max 20

        int a = 10;
        int b = 20;

        int min = (a<b) ? a : b;
        System.out.println("min = " + min); // 10

        int max = (a>b) ? a : b;
        System.out.println("max = " + max); // 20

    }
}
