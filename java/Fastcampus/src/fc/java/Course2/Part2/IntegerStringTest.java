package fc.java.Course2.Part2;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1+str2); // "123"+"123" = "123123"

//      "123"+"123" = 246(정수) --> 123(정수)+123(정수) = 246(정수)로 변환
        int num = Integer.parseInt(str1)+Integer.parseInt(str2);
        System.out.println(num); // 246

//      su1+su2 = "123123"
        int su1 = 123;
        int su2 = 123;
        System.out.println(su1+su2); // 246

//      1번째 방법 (정수 -> 문자열 변환)
        String str = String.valueOf(su1)+String.valueOf(su2);
        System.out.println(str); // "123123"

//      2번째 방법 (정수 -> 문자열 변환)
        String strr = "" + su1 + su2;
        System.out.println(strr); // "123123"

    }
}
