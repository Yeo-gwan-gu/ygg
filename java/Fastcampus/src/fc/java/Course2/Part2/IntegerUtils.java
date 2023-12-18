package fc.java.Course2.Part2;

import fc.java.Course2.model2.Converter;

public class IntegerUtils {
    public static int stringToInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
//      정적 메서드 참조 : 클래스::메서드명
        Converter<String, Integer> converter = IntegerUtils::stringToInt;
        Integer result = converter.converter("123"); // Auto-unboxing
        System.out.println(result); // 123
    }
}

