package fc.java.Course2.Part1;

import fc.java.Course2.model2.*;

public class InterfaceAPI {
    public static void main(String[] args) {
        CC c = new BB(); // UpCasting
//      BB의 x()가 동작 --> 동적 바인딩
        c.x();
        c.y();
        c.z();
    }
}
