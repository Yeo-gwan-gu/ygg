package fc.java.Course1.part4.ch06;
import fc.java.Course1.poly.A;
import fc.java.Course1.poly.B;

public class ObjectPolyArray {
    public static void main(String[] args) {
        // A, B 클래스를 저장할 배열을 생성하시오.

        Object[] obj = new Object[2];
        obj[0] = new A();
        obj[1] = new B();
        displ(obj);

        /*
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof A) {
                ((A) obj[i]).display();
            } else {
                ((B) obj[i]).display();
            }
        }
         */
    }

    private static void displ(Object[] obj) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof A) {
                ((A) obj[i]).display();
            } else {
                ((B) obj[i]).display();
            }
        }
    }
}
