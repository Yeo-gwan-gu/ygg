package be7.oop1;

public class Test8 {
    public static void main(String[] args) {
        float[][] ff = new float[3][3];

        int a = 10; // 2,4,6,8,10 --> 5
        int b = 5; //  2,4 --> 2

        int total = evenCount(a,b); // 메서드 호출(Call)
        System.out.println(total); // 7

    }
        public static int evenCount(int a, int b) {
        // 정수 2개를 받아서 두 수 사이의 짝수의 갯수를 구하시오.
        int aTotal = 0;
        int bTotal = 0;

            for (int i = 1; i <= a; i++) {
                if (i % 2 == 0) {
                    aTotal+=1;
                }
            }
            for (int i = 1; i <= b; i++) {
                if (i % 2 == 0) {
                    bTotal+=1;
                }
            }
        int sum = aTotal+bTotal;

            return sum;

        } // evenCount_
}
