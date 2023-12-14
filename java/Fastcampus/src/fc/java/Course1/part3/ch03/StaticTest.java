package fc.java.Course1.part3.ch03;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        int sum = hap(a,b);
        System.out.println("sum = " + sum);
        System.out.println("hap = "+hap(a,b));

    }
    // Q. 매개변수로 2개의 정수를 입력 받아서 총합을 구하여 리턴하는 메서드를 정의하시오.
    public static int hap(int a, int b) {
        int v = a+b;
        return v;
    }
}
