package fc.java.part3.ch03;

import fc.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        AllStatic st = new AllStatic();
//        System.out.println(st.hap(a,b));
//        System.out.println(st.max(a,b));
//        System.out.println(st.min(a,b));

        System.out.println(AllStatic.hap(a,b));
        System.out.println(AllStatic.max(a,b));
        System.out.println(AllStatic.min(a,b));
    }
}
