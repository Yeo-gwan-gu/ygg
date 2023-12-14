package be7.oop2;

public class EX29 {
    public static void main(String[] args) {
        // 문자열 처리
        // "APPLE"(객체, String)
        String a = "APPLE";
        System.out.println("a = "+a);
        System.out.println("a.length = "+a.length());
        System.out.println("a(0) = "+a.charAt(0));
        System.out.println("a(1) = "+a.charAt(1));
        System.out.println("a(2) = "+a.charAt(2));
        System.out.println("a(3) = "+a.charAt(3));
        System.out.println("a(4) = "+a.charAt(4));

        for (int i = 0; i < a.length(); i++) {
            System.out.println("a"+"("+i+")"+" = "+a.charAt(i));
        }

        // 대소문자 변환
        System.out.println(a.toLowerCase()); // apple
        System.out.println(a.toUpperCase()); // APPLE

        // 문자열 범위 내의 문자 확인
        System.out.println(a.substring(0,1)); // A
        System.out.println(a.substring(0,2)); // AP
        System.out.println(a.substring(0,4)); // APPL

        // 문자열의 해당 문자 인덱스 확인
        System.out.println(a.indexOf("L")); // 3
        System.out.println(a.indexOf("X")); // -1 (false)

        // 문자열 변환
        System.out.println(a.replaceAll("P","#")); // P --> # 으로 변환

        // 문자열 분리
        String s = "apple#red#blue";
        String[] sp = s.split("#");
        for (int i = 0; i < sp.length; i++) {
            System.out.println(sp[i]);
        }


        if (a.charAt(1) == a.charAt(2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
