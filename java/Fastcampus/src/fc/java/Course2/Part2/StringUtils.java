package fc.java.Course2.Part2;

import fc.java.Course2.model2.Converter;

public class StringUtils {
//  인스턴스 메서드
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
//      인스턴스 메서드 참조 : 객체참조::메서드명
        StringUtils stringUtils = new StringUtils();
        Converter<String, String> converter = stringUtils::reverse;
        String result = converter.converter("hello");
        System.out.println(result); // olleh
    }
}
