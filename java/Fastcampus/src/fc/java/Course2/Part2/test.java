package fc.java.Course2.Part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
//  특정 객체의 인스턴스 메서드 참조 : 클래스명::메서드명
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Doe");
//      String 클래스의 compareTo 메서드 참조
        Collections.sort(names, String::compareTo);
        System.out.println(names); // [Doe, Jane, John]
    }
}
