package be7.oop2;

public class EX30 {
    public static void main(String[] args) {
        // 문자열의 대소 비교(크기)
        String str1 = new String("APPLE");
        String str2 = new String("BEE");
        String str3 = new String("BEE");
        // str1 < str2
        int cmp = str1.compareTo(str2);
        System.out.println(cmp); // -1 (str1 < str2) --> 음수 = 앞의 값이 뒤의 값보다 크다.

        int cmp2 = str2.compareTo(str1);
        System.out.println(cmp2); // 1 (str2 < str1) --> 양수 = 앞의 값이 뒤의 값보다 작다.

        int cmp3 = str2.compareTo(str3);
        System.out.println(cmp3); // 0 (str2 == str3) --> 0 = 앞의 값과 뒤의 값이 같다.

        if (cmp == 0) {
            System.out.println("str1 == str2");
        } else if (cmp < 0) {
            System.out.println("str1 < str2");
        } else {
            System.out.println("str1 > str2");
        }

        if (str2.equals(str3)) {
            System.out.println("str2 == str3");
        } else {
            System.out.println("str2 != str3");
        }

        

    }
}
