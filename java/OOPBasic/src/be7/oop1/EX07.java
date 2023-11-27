package be7.oop1;

public class EX07 {
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) { // i = 5,4,3,2,1 > 0
                System.out.print("★");
            }
            System.out.println();
        }

        System.out.println();


        for (int j = 0; j < 5; j++) {
            if (j < 4) {
                System.out.print(" ");
            } else {
                System.out.print("★"); // j=0_,1_,2_,3_ < 4 공백
            } // else_
        } // j_

        System.out.println();

        for (int j = 0; j < 5; j++) {
            if (j < 3) {
                System.out.print(" ");
            } else {
                System.out.print("★"); // j=0_,1_,2_ < 3 공백
            } // else_
        } // j_
        System.out.println();

        System.out.println();

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("★");
                }
            }
            System.out.println();
        }

        System.out.println();


        for (int j = 0; j < 5; j++) {
            if (j >= 0) {
                System.out.print("★"); // j=0,1,2,3,4 --> 공백 없음
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            if (j > 0) {
                System.out.print("★"); // j=0_,1,2,3,4 --> 0일 때 공백
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j >= i) { // 0 --> 1,2,3,4
                        System.out.print("★"); // j=0,1,2,3,4
                    } else {
                        System.out.print(" "); // X
                    }
                } // j_
                System.out.println();
            } // i_
        }
    }