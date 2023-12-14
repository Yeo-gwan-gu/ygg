package fc.java.Course1.part2.ch5;

public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c); // A

        int a = 'A';
        System.out.println("a = " + a); // 65 (ASCII 코드 값으로 출력된다)

        int b = 'B'+1;
        System.out.println("b = " + (char)b); // C (67->C (형변환) B+1)


        // Q. '가'라는 한글 한 문자(수치형자료)를 변수에 저장하고 출력하시오.
        char han = '가';
        System.out.println("han = " + han); // 가

        int hanD = '가'; // 44032 유니코드값
        System.out.println("hanD = " + hanD); // 44032

        int hanU = '\uAC00'; // ASCII
        System.out.println("hanU = " + (char)hanU); // 가

        // Q. 대문자 'A'를 문자 'a'로 변환하여 출력하시오.(ASCII코드 참고)
        char upper = 'A';
        /* char lower = upper+32; */
        char lower = (char)(upper+32); // A -> a
        System.out.println("lower = " + lower); // a

        char lower1 = 'u'; // 117
        //char upper1 = (char)(lower1-32);
        int upper1 = lower1-32; // u -> U (117-32=85)
        System.out.println("upper1 = " + upper1); // 85
        System.out.println("upper1 = " + (char)upper1); // U

        // Q. '1'+'2'=3이 나오도록 프로그래밍 하시오
        int data = '1'+'2';
        System.out.println("data = " + data); // 99 (ACSII 코드값이 나옴 -> 원하는 3의 결과 값이 나오지 않음)

        // '0' = 48
        char i = '1'; // 49-48=1
        char j = '2'; // 50-48=2
        // int sum = (i-48)+(j-48);
        int sum = (i-'0')+(j-'0');
        System.out.println("sum = " + sum); // 3
    }
}
