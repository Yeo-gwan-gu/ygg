package fc.java.Course2.Part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExamples2 {
    public static void main(String[] args) {
        List<String> worlds = Arrays.asList("apple", "banana", "charry", "orange");

//      스트림의 각 원소를 대문자로 변환한 새로운 리스트 생성
        List<String> upperCaseWorlds = worlds.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperCaseWorlds);

    }
}
