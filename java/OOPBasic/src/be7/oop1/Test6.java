package be7.oop1;

public class Test6 {
    public static void main(String[] args) {
        // 별찍기

        /*
        *****
        ****
        ***
        **
        *
         */

        for (int j = 0; j < 5; j++) { // ***** --> 0,1,2,3,4<5 (5번 실행)
            System.out.print("*");
        }
        System.out.println(); // _

        for (int j = 0; j < 4; j++) { // **** --> 0,1,2,3<4 (4번 실행)
            System.out.print("*");
        }
        System.out.println(); // _

        for (int j = 0; j < 3; j++) { // *** --> 0,1,2<3 (3번 실행)
            System.out.print("*");
        }
        System.out.println(); // _
        for (int j = 0; j < 2; j++) { // ** --> 0,1<2 (2번 실행)
            System.out.print("*");
        }
        System.out.println(); // _
        for (int j = 0; j < 1; j++) { // * --> 0<1 (1번 실행)
            System.out.print("*");
        }

        System.out.println();
        System.out.println();
        System.out.println("1---------------------(선)");
        System.out.println();


        for (int i = 5; i > 0; i--) { // 5~0까지 j를 실행 --> 5,4,3,2,1 --

            for (int j = 0; j < i; j++) { // 0~4까지 실행 ~ 0~0까지 실행으로 점점 --> 0,1,2,3,4-0,1,2,3-0,1,2-0,1-0
                System.out.print("*");
            } // j_

            System.out.println(); // _
        } // i_

        System.out.println();
        System.out.println("2---------------------(풀이)");
        System.out.println();

        /*
        *
        **
        ***
        ****
        *****
         */

        for (int j = 0; j < 1; j++) { // * --> 0~0<1까지 실행
            System.out.print("*");
        }
        System.out.println(); // _
        for (int j = 0; j < 2; j++) { // ** --> 0~1<2까지 실행
            System.out.print("*");
        }
        System.out.println(); // _
        for (int j = 0; j < 3; j++) { // *** --> 0~2<3까지 실행
            System.out.print("*");
        }
        System.out.println(); // _
        for (int j = 0; j < 4; j++) { // **** --> 0~3<4까지 실행
            System.out.print("*");
        }
        System.out.println(); // _
        for (int j = 0; j < 5; j++) { // ***** --> 0~4<5까지 실행
            System.out.print("*");
        }

        System.out.println();
        System.out.println();
        System.out.println("3---------------------(선)");
        System.out.println();

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) { // * ~ ***** --> 0~4<5까지 실행(i)
                System.out.print("*");
            } // j_
            System.out.println(); // _
        } // i_

        System.out.println();
        System.out.println("4---------------------(풀이)");
        System.out.println();

        /*
        *****
         ****
          ***
           **
            *
         */

        for (int j = 0; j < 5; j++) { // ***** --> j<5까지 실행
                         // 공백 없음
            System.out.print("*");
        }
        System.out.println(); // _

        for (int j = 0; j < 5; j++) { // _**** --> j<5까지 실행 (단, j<1 공백 실행)
            if (j < 1) { // j<1 일때까지 공백 실행 --> _
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        } // j_
        System.out.println(); // _

        for (int j = 0; j < 5; j++) { // __*** --> j<5까지 실행(단, j<2 까지는 공백 실행)
            if(j < 2) { // j<2 일때까지 공백 실행 --> __
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        } // j_
        System.out.println(); // _

        for (int j = 0; j < 5; j++) { // ___** --> j<5까지 실행(단, j<3 까지는 공백 실행)
            if (j < 3) { // j<3 일때까지 공백 실행 --> ___
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        } // j_
        System.out.println(); // _

        for (int j = 0; j < 5; j++) { // ____* --> j<5까지 실행(단, j<4 까지는 공백 실행)
            if (j < 4) { // j<4 일때까지 공백 실행 --> ____
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        } // j_

        System.out.println();
        System.out.println();
        System.out.println("5---------------------(선)");
        System.out.println();

        // 규칙
        // 1) j=0 일때부터 j<5까지 반복되어 실행(*)
        // 2) j<0 일때는 공백이 실행되지 않음
        // 3) j<1 일때부터 j<4까지는 공백 실행

        for (int i = 0; i < 5; i++) { // '1)'
            for (int j = 0; j < 5; j++) { // '1)', '2)', '3)'
                if (j < i) {    // '2)', '3)'
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            } // j_
            System.out.println(); // _
        } // i_

        System.out.println();
        System.out.println("6---------------------(풀이)");
        System.out.println();

        /*
            *
           **
          ***
         ****
        *****
         */

        for (int j = 0; j < 5; j++) { // // ____* --> j<5까지 실행(단, j<4 공백 실행)
            if (j < 4) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        } // j_
        System.out.println(); // _

        for (int j = 0; j < 5; j++) { // ___** --> j<5까지 실행(단, j<3 공백 실행)
            if (j<3) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        } // j_
        System.out.println(); // _

        for (int j = 0; j < 5; j++) { // __*** --> j<5까지 실행(단, j<2 공백 실행)
            if (j < 2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        } // j_
        System.out.println(); // _

        for (int j = 0; j < 5; j++) { // _**** --> j<5까지 실행(단, j<1 공백 실행)
            if (j < 1) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        } // j_
        System.out.println(); // _

        for (int j = 0; j < 5; j++) { // ***** --> j<5까지 실행(공백없음)
            System.out.print("*");
        }

        System.out.println();
        System.out.println();
        System.out.println("7---------------------(선)");
        System.out.println();

        // 규칙
        // 1) j=0 부터 j<5 까지 반복되어 실행(*)
        // 2) j<4 일 때부터 j<1 일 때까지 공백 실행 --> j<4,3,2,1
        // 3) j<0 일때는 공백 실행하지 않음

        for (int i = 4; i >= 0; i--) { // i>5~0 && i=0 --> i=4,3,2,1,0
            for (int j = 0; j < 5; j++) { // j=0 ~ j<5 --> j=0,1,2,3,4
                if (j < i) { // j<4,3,2,1 --> i=4,3,2,1,0
                    System.out.print(" ");
                } else {
                    System.out.print("★");
                }
            } // j_
            System.out.println();
        } // i_

        System.out.println();
        System.out.println("8---------------------(풀이)");
        System.out.println();

    }
}