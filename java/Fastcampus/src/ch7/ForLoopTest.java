package ch7;

public class ForLoopTest {
    public static void main(String[] args) {
        // Q. 반복문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력하시오.

        for (char i = 'A'; i < 'Z'; i++) { // 대문자
            System.out.println(i+ "="+(int)i);
        }

        for (char c = 'a'; c < 'z'; c++) { // 소문자
            System.out.println(c+"="+(int)c);
        }


        // Q. int[] numbers = {1,2,3,4,5,6,7,8,9,10}; 배열 원소를 향상된 for문으로 출력하시오.

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {  // 기본 for문
            System.out.print(numbers[i]+"\t");
        }

        System.out.println();

        for (int n :numbers) {                     // 향상된 for문
            System.out.print(n+"\t");
        }

    }
}
