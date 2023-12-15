package fc.java.Course2.Part1;

public class StringCompare {
    public static void main(String[] args) {
//      문자열 비교하기
        String str1 = "Hello";
        String str2 = "World";

//      equals() 메서드 활용하기 : (대소문자 구분)
//      두 문자열이 같으면 'true', 다르면 'false'를 반환한다.
//      equalsIgnoreCase() : 대소문자를 구분하지 않음
        if (str1.equals(str2)) {
            System.out.println("str1 == str2");
        } else {
            System.out.println("str1 != str2");
        }


        String str3 = "apple";
        String str4 = "banana";
//      compareTo() 메서드 활용하기
//      문자열을 사전순(ASCII)으로 비교하며,
//      두 문자열이 같으면 '0'을 반환하고,
//      비교 대상 문자열이 기준 문자열보다 작으면 음수,
//      크면 양수를 반환한다.
        int result = str3.compareTo(str4);

        if (result == 0) {
            System.out.println("str3 == str4");
        } else if (result < 0) {
            System.out.println("str3 < str4");
        } else {
            System.out.println("str3 > str4");
        }

    }
}
