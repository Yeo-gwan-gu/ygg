package be7.oop1;

public class Test7 {
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) { // i는 j를 i가 5보다 작을 때까지 0,1,2,3,4를 반복 실행한다.
                                      // 단, j는 i가 1올라갈 때마다 1씩 감소한다.

            for (int j = 0; j < i; j++) { // j는 0,1,2,3,4를 반복 실행한다.
                System.out.print("*");
            } // j_
            System.out.println(); // _
        } // i_

        /*
        [*****] --> [0,1,2,3,4]
        [****]  --> [0,1,2,3]
        [***]   --> [0,1,2]
        [**]    --> [0,1]
        [*]     --> [0]
         */

        /*
        1) "*" 5번 ***** --> j를 5번을 채울때까지 실행(0,1,2,3,4) --> j=0; j<5; (x-0) --> i=5
        2) "*" 4번 ****  --> j를 4번을 채울때까지 실행(0,1,2,3)   --> j=0; j<4; (x-1) --> i=4
        3) "*" 3번 ***   --> j를 3번을 채울때까지 실행(0,1,2)     --> j=0; j<3; (x-2) --> i=3
        4) "*" 2번 **    --> j를 2번을 채울때까지 실행(0,1)       --> j=0; j<2; (x-3) --> i=2
        5) "*" 1번 *     --> j를 1번을 채울때까지 실행(0)         --> j=0; j<1; (x-4) --> i=1
        */

        System.out.println();
        System.out.println("--------------");
        System.out.println();

        for (int i = 5; i > 0; i--) { // i는 j를 i가 5보다 작을 때까지 0,1,2,3,4를 반복 실행한다.
            // 단, j는 i가 1올라갈 때마다 1씩 감소한다.

            for (int j = 0; j < i; j++) { // j는 0,1,2,3,4를 반복 실행한다.
                System.out.print("i["+i+"]"+" "+"j["+j+"]"+"\t");
            } // j_
            System.out.println(); // _
        } // i_

        System.out.println();
        System.out.println("--------------");
        System.out.println();

        /*
        *        0
        **       01
        ***      012
        ****     0123
        *****    01234
         */

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            } // j_
            System.out.println(); // _
        } // i_

        System.out.println();
        System.out.println("--------------");
        System.out.println();


        /*
        __*__  -->  0,1,[2],3,4  -->  1<j<3
        _***_  -->  0,[1,2,3],4  -->  0<j<4
        *****  -->  [0,1,2,3,4]  -->  -1<j<5
        _***_  -->  0,[1,2,3],4  -->  0<j<4
        __*__  -->  0,1,[2],3,4  -->  1<j<3
         */



            for (int j = 0; j < 5; j++) {
                if (j>1 && j<3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } // if
            } // j_

            System.out.println(); // _
            System.out.println("-----첫째줄");
            System.out.println(); // _

        for (int j = 0; j < 5; j++) {
            if (j>0 && j<4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            } // if
        } // j_

        System.out.println(); // _
        System.out.println("-----첫째줄");
        System.out.println(); // _

        for (int j = 0; j < 5; j++) {
            if (j>=0 && j<=4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            } // if
        } // j_

        System.out.println(); // _
        System.out.println("-----셋째줄");
        System.out.println(); // _

        for (int j = 0; j < 5; j++) {
            if (j>1 && j<3) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            } // if
        } // j_
        System.out.println();
        for (int j = 0; j < 5; j++) {
            if (j>0 && j<4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            } // if
        } // j_
        System.out.println();
        for (int j = 0; j < 5; j++) {
            if (j>=0 && j<=4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            } // if
        } // j_
        System.out.println();
        for (int j = 0; j < 5; j++) {
            if (j>0 && j<4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            } // if
        } // j_
        System.out.println();
        for (int j = 0; j < 5; j++) {
            if (j>1 && j<3) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            } // if
        } // j_

        System.out.println();
        System.out.println("------");
        System.out.println();

        /*
        __*__  -->  0,1,[2],3,4  -->  1<j<3   --> 2<=j<=2
        _***_  -->  0,[1,2,3],4  -->  0<j<4   --> 1<=j<=3
        *****  -->  [0,1,2,3,4]  -->  -1<j<5  --> 0<=j<=4
        _***_  -->  0,[1,2,3],4  -->  0<j<4   --> 1<=j<=3
        __*__  -->  0,1,[2],3,4  -->  1<j<3   --> 2<=j<=2
        */

        for (int i = 0; i < 3; i++) {
            // 윗줄
            for (int j = 0; j < 5; j++) {
                if (j>=(2-i) && j<=(2+i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } // if
            } // j_
            System.out.println();
        } // i_
            // 아랫줄
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j>=(i+1) && j<=(3-i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } // if
            } // j_
            System.out.println(); // _
        } // i_


    }
}
