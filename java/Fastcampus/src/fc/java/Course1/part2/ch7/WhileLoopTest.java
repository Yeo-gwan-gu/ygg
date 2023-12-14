package fc.java.Course1.part2.ch7;

public class WhileLoopTest {
    public static void main(String[] args) {
        // Q. 0~5까지의 수를 출력하시오.
        int i = 0; // 초기식
        while (i <=5) { // 조건식
            System.out.print(i+"\t");
            i++; // 증감식
        }

        System.out.println();

        // Q. int[]] numbers = {1,2,3,4,5,6,7,8,9,10} 주어진 배열의 모든 원소를 출력하시오.
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        i=0;
        while (i < numbers.length) {
            System.out.print(numbers[i]+"\t");
            i++;
        }

        System.out.println();

        // Q. 1~10까지 출력하는 프로그램을 while 과 do~while문으로 작성하시오.

        i=1;

        while (i <= 10) {                // while문
            System.out.print(i+"\t");
            i++;
        }

        System.out.println();

        i=1;
        do {                             // do~while문
            System.out.print(i+"\t");
            i++;
        } while(i <= 10);
    }
}
