package fc.java.Course2.Part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
//      HashSet 객체 생성
        Set<String> set = new HashSet<>();

//      요소 추가
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // 중복 (x)

//      size 출력
        System.out.println(set.size()); // 3 (중복 제외)

//      출력
        for (String str : set) {
            System.out.println(str);
        }

//      특정 문자열 포함 여부 확인(true or false)
        boolean contains = set.contains("Cherry");
        System.out.println(contains);

//      set 전체 비우기
        set.clear();
        boolean empty = set.isEmpty();
        if (set.isEmpty()) {
            System.out.println("set이 전부 비었습니다.");
        }
    }
}
