package fc.java.part3.ch03;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtil
        int sum = MyUtil.hap(a,b);
        System.out.println("sum = " + sum);
    }
}
