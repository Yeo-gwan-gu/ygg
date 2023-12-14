package fc.java.Course1.part4.ch06;
import fc.java.Course1.poly.A;
import fc.java.Course1.poly.B;

public class ObjectTest {
    public static void main(String[] args) {
        // Q. A 객체를 UpCasting으로 생성하시오.
        A a = new A();
        a.display();

        B b = new B();
        b.display();
    }
}
