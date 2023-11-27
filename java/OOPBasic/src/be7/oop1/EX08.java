package be7.oop1;

public class EX08 {
    public static void main(String[] args) {
        // 구구단

        for (int j = 2; j < 10; j++) {
            if((j*1)<10) {
                System.out.print(j + "X" + 1 + "=0" + (j*1) + "\t");
            } else {
                System.out.print(j + "X" + 1 + "=" + (j*1) + "\t");
            }
        }
        System.out.println();

        for (int j = 2; j < 10; j++) {
            if((j*2)<10) {
                System.out.print(j + "X" + 2 + "=0" + (j*2) + "\t");
            } else {
                System.out.print(j + "X" + 2 + "=" + (j*2) + "\t");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                if ((j*i) < 10) {
                    System.out.print(j + "X" + i + "=0" + (j*i) + "\t");
                } else {
                    System.out.print(j + "X" + i + "=" + (j*i) + "\t");
                }
            }
            System.out.println();
        }
    }
}
