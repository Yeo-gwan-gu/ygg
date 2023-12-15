package fc.java.Course2.Part1;

public class StringSplit {
    public static void main(String[] args) {
//      문자열 분리하기
        String str = "Hello,World,Java";
        System.out.println(str); // Hello,World,Java
        String[] strArray = str.split(",");

        for (String s : strArray) { // Hello ↩  ︎World ↩  ︎Java
            System.out.println(s);
        }

        System.out.println(); // 줄바꿈

//      정규표현식을 사용하여 공백을 구분자로 사용한다. \s+
        String str1 = "Hello World Java"; // Hello World Java
        String[] strArray2 = str1.split("\\s+");

        for (String ss : strArray2) {
            System.out.println(ss); // Hello ↩  ︎World ↩  ︎Java
        }
    }
}
