package fc.java.Course2.Part1;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[6];
        int i = 0; // 저장위치(pos)

        while(i < 6) {
            int num = rand.nextInt(45)+1; // 1~45
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    isDuplicate = true;
                    break;
                } // if_
            } // for_
            if (!isDuplicate) {
                arr[i++] = num;
            } // if_
        } // while_

        // 출력
        for (int num : arr) {
            System.out.print(num+" ");
        } // for_end_출력
    }
}
