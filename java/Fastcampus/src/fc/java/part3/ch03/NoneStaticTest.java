package fc.java.part3.ch03;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        NoneStaticTest st = new NoneStaticTest();
        int sum = st.hap(a,b);
    }
    public int hap(int a, int b) {
        int v = a+b;
        return v;
    }
}
