package fc.java.Course2.Part1;
import fc.java.Course2.model2.*;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        // A, B, C 객체를 배열(Object[])에 저장하고 출력 하시오.
        ObjectArray list = new ObjectArray();
        list.add(new A()); // UpCasting --> Object element=new A();
        list.add(new B()); // UpCasting --> Object element=new B();
        list.add(new C()); // UpCasting --> Object element=new C();
        A a = (A)list.get(0); // A <= Object / DownCasting
        a.display();
        B b = (B)list.get(1); // B <= Object / DownCasting
        b.display();
        C c = (C)list.get(2); // C <= Object / DownCasting
        c.display();

        System.out.println(); // 줄바꿈

//      for문 출력
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof A) {
                ((A) list.get(i)).display();
            } else if (list.get(i) instanceof B) {
                ((B) list.get(i)).display();
            } else {
                ((C) list.get(i)).display();
            }
        }
    }
}
