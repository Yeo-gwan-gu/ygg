package fc.java.part2.ch5;

public class CastingTest {
    public static void main(String[] args) {

        float f1 = .10f; // 0.10 (0. 생략)
        System.out.println("f1 = " + f1);
        float f2 = 15f; // 15.0
        System.out.println("f2 = " + f2);
        float f3 = 3.14f;
        System.out.println("f3 = " + f3);
        double d1 = 123.4567;
        System.out.println("d1 = " + d1);

        float x = 15.6f;
        // int y = x;     ---형변환 필요 (큰 -> 작은)
        int y = (int)x;
        System.out.println("y = " + y); // 15(손실)

        char c = 'A';
        int cc = c; // 자동형변환 (작은 -> 큰)
        System.out.println("cc = " + cc); // 65 (ACSII 코드값으로 출력)

        int dd = 5;
        double ddd = dd; // 자동형변환 (작은 -> 큰)
        System.out.println("ddd = " + ddd); // 5.0

        double dx = 14.67;
        // int dy = dx;    ---형변환 필요 (큰 -> 작은)
        int dy = (int)dx;
        System.out.println("dy = " + dy); // 14(손실)
    }
}
