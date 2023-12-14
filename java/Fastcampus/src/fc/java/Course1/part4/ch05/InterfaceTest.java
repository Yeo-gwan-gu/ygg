package fc.java.Course1.part4.ch05;

import fc.java.Course1.poly.Radio;
import fc.java.Course1.poly.RemoCon;
import fc.java.Course1.poly.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
    }
}
