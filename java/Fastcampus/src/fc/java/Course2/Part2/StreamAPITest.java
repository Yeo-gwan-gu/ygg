package fc.java.Course2.Part2;

import java.util.Arrays;
public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

//      기존 방식
//        int even = 0;
//        for (int num : numbers) {
//            if (num % 2 == 0) {
//                even+=num;
//            }
//        }

//      Stream, 람다식 활용
        int sumOfEvens = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0) // 람다식
                .sum();
        System.out.println("sumOfEvens = " + sumOfEvens); // 6

        int[] evenNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0) // 람다식
                .toArray();

        for (int even : evenNumbers) {
            System.out.println("even = "+ even);
        }
    }
}
