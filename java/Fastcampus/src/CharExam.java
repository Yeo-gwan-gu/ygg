public class CharExam {
    public static void main(String[] args) {
        // Q. '1'+'2'+'3'+'4'+'5' = 15가 나오도록 프로그래밍 하시오.

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        char c4 = '4';
        char c5 = '5';

        int sum = (c1-'0')+(c2-'0')+(c3-'0')+(c4-'0')+(c5-'0');
        System.out.println("sum = " + sum); // 15
    }
}
