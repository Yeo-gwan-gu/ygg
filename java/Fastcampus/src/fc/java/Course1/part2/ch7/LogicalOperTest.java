package fc.java.Course1.part2.ch7;

public class LogicalOperTest {
    public static void main(String[] args) {
        // Q. 논리연산자의 결과 값을 쓰시오.
        int x = 1, y = 0;
        System.out.println(!(x>0)); // false
        System.out.println(x>0 && x<3); // true
        System.out.println(x>0 && y<0); // false
        System.out.println(x<0 || y>=0); // true
        System.out.println(y<0 && y<-5); // false

        int a = 3, b = 5;
        System.out.println((a>=3) && (b<6)); // true
        System.out.println((a!=3) && (a>2)); // false
        System.out.println((b!=5) || (a==1)); // false
    }
}
