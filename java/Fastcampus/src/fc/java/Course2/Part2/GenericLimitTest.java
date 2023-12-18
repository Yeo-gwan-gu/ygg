package fc.java.Course2.Part2;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};

        AverageCalculator<Integer> integerAverageCalculator = new AverageCalculator<>(integers);
        double integerAverage = integerAverageCalculator.calculateAverage();
        System.out.println(integerAverage);

        AverageCalculator<Double> doubleAverageCalculator = new AverageCalculator<>(doubles);
        double doubleAverage = integerAverageCalculator.calculateAverage();
        System.out.println(integerAverage);
    }
}
