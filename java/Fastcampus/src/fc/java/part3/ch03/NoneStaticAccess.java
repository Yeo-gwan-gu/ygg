package fc.java.part3.ch03;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtil1
        // 객체 생성
        MyUtil1 my1 = new MyUtil1();
        int sum = my1.hap(a,b);
        System.out.println("sum = " + sum);
    }
}
