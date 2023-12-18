package fc.java.Course2.Part2;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "김길동", "이길동");
        Collections.sort(names, String::compareTo);
        System.out.println(names); // [김길동, 이길동, 홍길동]

        for (String name : names) {
            System.out.println(name);
        }
    }
}
