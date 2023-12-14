package fc.java.Course2.Part1;

public class MinMaxTest {
    public static void main(String[] args) {

        int[] arr = {5,3,9,1,7};

        int min = MinMaxTest.Min(arr);
        int max = MinMaxTest.Max(arr);

        System.out.println("min : " + min);
        System.out.println("max : " + max);

    }
    public static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    } // findMin_end

    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    } // findMax_end
}