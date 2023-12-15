package fc.java.Course2.model2;

public class MinMaxFinder {

    // 최소값 구하기
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            } // if_
        } // for_
        return min;
    } // findMin_end

    // 최대값 구하기
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } // if_
        } // for_
        return max;
    } // findMin_end
}
