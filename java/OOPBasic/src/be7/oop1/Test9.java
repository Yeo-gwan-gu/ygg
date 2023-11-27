package be7.oop1;

public class Test9 {
    public static void main(String[] args) {
        int a = 10; // 2,4,6,8,10 --> 5
        int b = 5; // 2,4 --> 2

        int sumA = 0; // 5
        int sumB = 0; // 2

        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                sumA+=1;
            }
        }
        for (int i = 1; i <= b; i++) {
            if (i % 2 == 0) {
                sumB+=1;
            }
        }
        System.out.println(sumA);
        System.out.println(sumB);

        int sum = sumA+sumB; // 7
        System.out.println(sum);
    }
}