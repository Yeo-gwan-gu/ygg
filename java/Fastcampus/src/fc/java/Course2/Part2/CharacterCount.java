package fc.java.Course2.Part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello, World";
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = str.toCharArray(); // {'H','e','l','l','o'......}

//      중복 문자 조회
        for (char cc : strArray) {
            if (charCountMap.containsKey(cc)) {
                charCountMap.put(cc, charCountMap.get(cc)+1);
            } else {
                charCountMap.put(cc, 1);
            }
        }

//      출력
        System.out.println("Character Counts");
        for (char cc : charCountMap.keySet()) {
            System.out.println(cc + " : " + charCountMap.get(cc));
        }
    }
}
