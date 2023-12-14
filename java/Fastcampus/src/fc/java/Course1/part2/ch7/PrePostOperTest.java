package fc.java.Course1.part2.ch7;

public class PrePostOperTest {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(--x); // 출력값 : 9 (x=9)
        System.out.println(x++); // 출력값 : 9 (x=10)
        System.out.println(x--); // 출력값 : 10 (x=9)
        System.out.println(++x); // 출력값 : 10 (x=10)
        System.out.println(x); // 출력값 : 10 (x=10)
    }
}
