package fc.java.Course2.Part1;

public class IntArrayBasic {
    public static void main(String[] args) {
//      Q. 정수 5개를 배열에 저장하고 출력하시오.
//      생성동작
        int[] nums = new int[5]; // 고정길이(단점) -> 가변길이?
//      저장동작(입력,추가)
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
//      nums.length : 길이를 구하는 동작
        for (int i = 0; i < nums.length; i++) {
//          데이터를 얻는 동작(가져오는 동작)
            int data = nums[i];
            System.out.print(data+"\t");
        } // for_출력_end

        System.out.println(); // 줄바꿈

//      향상된 for문(foreach)
        for (int data : nums) {
            System.out.print(data+"\t");
        } // foreach_출력_end
    }
}
