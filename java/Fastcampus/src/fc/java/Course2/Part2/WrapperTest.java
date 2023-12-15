package fc.java.Course2.Part2;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장 하시오.

//      기본 자료형
        int a = 1;
        System.out.println(a);

//      사용자 정의 자료형(객체 자료형) --> Boxing
        Integer aa = new Integer(10);
        System.out.println(aa);
        System.out.println(aa.intValue()); // UnBoxing(Integer -> int)

//      Auto-boxing
        Integer bb = 20; // == Interger bb = new Integer(10);
        System.out.println(bb);

//      Auto-unboxing
        int b = bb;
        System.out.println(b);

        float f = 10.5f;
        Float ff = 10.6f; // new Float() --> Auto-boxing
        System.out.println(ff.floatValue()); // Unboxing

        Float af = 49.1f;
        System.out.println(af.floatValue()); // Unboxing
        float aff = af; // af.floatValue() --> Auto-boxing
        System.out.println(aff);
    }
}
