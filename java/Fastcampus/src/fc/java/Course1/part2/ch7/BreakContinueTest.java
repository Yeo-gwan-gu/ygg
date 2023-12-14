package fc.java.Course1.part2.ch7;

public class BreakContinueTest {
    public static void main(String[] args) {
        // Q. char[] c = {'s','h','u','t','d','o','w','n'};
        // 위 배열의 값을 출력 중 'o'라는 문자를 만나면 반복을 중지하시오.

        char[] c = {'s','h','u','t','d','o','w','n'};
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'o') break;
            System.out.print(c[i]); // shutd 까지만 출력되고 break
        }

        System.out.println(); // 줄바꿈

        // Q. 1~10까지의 수 중 3의 배수의 개수를 구하여 출력하시오.
        int count=0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 != 0) continue;
            count++;
        }
        System.out.print(count+"\t"); // 3의 배수를 만날 때 마다 count++ 실행 -> (3,6,9) -> 출력값 : 3
    }
}
