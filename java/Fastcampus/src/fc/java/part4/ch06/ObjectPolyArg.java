package fc.java.part4.ch06;
import fc.java.poly.*;

public class ObjectPolyArg {
    public static void main(String[] args) {

        A a = new A();
        display(a);
        B b = new B();
        display(b);

    }
    private static void display(Object obj) {
        if (obj instanceof A) {
            ((A) obj).printGo();
        } else {
            ((B)obj).printGo();
        }
    } // display_

}
