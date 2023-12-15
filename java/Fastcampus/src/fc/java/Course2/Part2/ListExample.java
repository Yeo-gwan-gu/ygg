package fc.java.Course2.Part2;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
//      ArrayList 객체 생성
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana"); // 중복 데이터 추가 (o)

        System.out.println(); // 줄바꿈

//      데이터 접근 및 출력
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("첫번째 데이터 : "+list.get(0));
        System.out.println("두번째 데이터 : "+list.get(1));
        System.out.println("마지막 데이터 : "+list.get(list.size()-1));

        System.out.println(); // 줄바꿈

//      데이터 삭제
        list.remove(0); // "apple" 삭제
        for (String str : list) {
            System.out.println(str);
        }

//      데이터 변경
        list.set(1, "s"); // "cherry" --> "s" 로 변경
        for (String str : list) {
            System.out.println(str);
        }


    }
}
