package fc.java.Course1.part3.ch03;

 import fc.java.Course1.model.CarDTO;
 import java.util.Scanner;

public class PackageNameTest {
    public static void main(String[] args) {
        // Q. 지금까지 자바에서 제공해주어 사용해본 클래스들의 이름을 적어보시오.
        String str = "홍길동";
//        java.util.Scanner scan = new java.util.Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World");

        // Q. 우리가 직접 만들어서 사용해본 클래스들의 이름을 적어보시오.
//        fc.java.Course1.poly.model.CarDTO car = new fc.java.Course1.poly.model.CarDTO();
        CarDTO car = new CarDTO();
    }
}
