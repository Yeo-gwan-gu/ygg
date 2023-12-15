package fc.java.Course2.Part1;

public class StringManipulation {
    public static void main(String[] args) {
//      Hello World 라는 문자열을 생성하고, String 기능 확인

        String str = new String("Hello World");
        char firstChar = str.charAt(0); // '0'번째 문자
        String replacedString = str.replace("o", "X"); // 모든 "o"라는 문자를 "X"로 바꾸어 대입(원본이 변경 되는건 아님)
        int index = str.indexOf("W"); // "W"의 index 위치 (만약 찾고자 하는 "W"가 없을 경우 -1을 리턴)
        int length = str.length(); // str의 길이(공백 포함)
        String upperCase = str.toUpperCase(); // 대문자로 변경
        String lowerCase = str.toLowerCase(); // 소문자로 변경
        String subString = str.substring(6); // index(6)~마지막까지만 가져오기 (부분만 가져오기) (공백 포함)
        String subString2 = str.substring(6, 9); // // index(6)~index(9)만 가져오기 (부분만 가져오기) 8전까지 가져옴(마지막 수에서 -1) (공백 포함)

        System.out.println(str); // Hello World
        System.out.println(str.charAt(0)); // H
        System.out.println(str.replace("o","X")); // HellX WXrld
        System.out.println(str.indexOf("W")); // 6
        System.out.println(str.indexOf("P")); // -1 (없는 경우 -1 출력)
        System.out.println(str.length()); // 11 (" ")공백 포함
        System.out.println(str.toUpperCase()); // HELLO WORLD
        System.out.println(str.toLowerCase()); // hello world
        System.out.println(str.substring(6)); // World
        System.out.println(str.substring(6, 9)); // Wor
        System.out.println(str.substring((str.indexOf("W")))); // "W"의 index부터 출력

//      문자열의 문자를 한개씩 꺼내서 출력
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+"\t");
        }


    }
}
