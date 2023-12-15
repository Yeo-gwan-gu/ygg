package fc.java.Course2.Part1;

import fc.java.Course2.model2.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr = {5,1,6,2,8};

        int min = MinMaxFinder.findMin(arr);
        int max = MinMaxFinder.findMax(arr);
        System.out.println("min : " + min);
        System.out.println("max : " + max);
    }
}
