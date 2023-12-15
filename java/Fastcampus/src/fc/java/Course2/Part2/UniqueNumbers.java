package fc.java.Course2.Part2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2,4,6,7,1,3}; // 2, 1, 3 중복

        Set<Integer> uniqueNums = new HashSet<>();

//      set에 nums 배열 데이터 담기
        for (int number : nums) {
            uniqueNums.add(number);
        }

        System.out.println("Unuque numbers...");

//      출력
        for (int number : uniqueNums) {
            System.out.print(number+"\t");
        }
    }
}
