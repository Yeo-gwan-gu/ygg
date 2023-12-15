package fc.java.Course2.Part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
//      Key-Value 형태의 데이터를 관리하는 Map 객체 생성
        Map<String, Integer> studentScores = new HashMap<>(); // Map <--(UpCasting)-- HashMap

//      데이터 추가(put)
        studentScores.put("Kim", 95);
        studentScores.put("Lee", 85);
        studentScores.put("Park", 90);
        studentScores.put("Choi", 80);

//      데이터 조회(get)
        System.out.println("Kim's score : " + studentScores.get("Kim")); // 95
        System.out.println("Lee's score : " + studentScores.get("Lee")); // 85

//      데이터 수정(put)
        studentScores.put("Park", 92);
        System.out.println("Park's score : " + studentScores.get("Park")); // 90 -> 92

//      데이터 삭제(remove)
        studentScores.remove("Choi");
        System.out.println("Choi's score : " + studentScores.get("Choi")); // null

//      전체 데이터 출력(Entry)
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + "s.score : " + entry.getValue());
        }
    }
}
