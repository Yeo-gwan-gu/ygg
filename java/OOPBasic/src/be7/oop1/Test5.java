package be7.oop1;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,2};

        for (int i : arr) { // 배열 중 짝수만 출력하기
            if (i % 2 == 0) {
                System.out.print(i+"\t");
            }
        }
        System.out.println();

        for (int i : arr) { // 배열 중 홀수만 출력하기
            if (i % 2 != 0) {
                System.out.print(i+"\t");
            }
        }
        System.out.println();

        int sum = 0;        // 짝수의 합
        for (int i : arr) {
            if (i % 2 == 0) {
                sum +=i;
            }
        }

        int sum2 = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                sum2 +=i;
            }
        }

        System.out.println(sum); // 6 (4,2)
        System.out.println(sum2); // 9 (3,1,5)
    }
}
