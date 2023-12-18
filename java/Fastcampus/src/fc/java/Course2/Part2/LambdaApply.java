package fc.java.Course2.Part2;

import fc.java.Course2.model2.StringOperation;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase = (s) -> s.toUpperCase();
        StringOperation toLowerCase = (s) -> s.toLowerCase();

        String input = "Lambda Expressions";
        System.out.println(input);
        System.out.println(processString(input, toUpperCase));
        System.out.println(processString(input, toLowerCase));
    }
    public static String processString(String input, StringOperation operation) {
        return operation.apply(input);
    }
}
