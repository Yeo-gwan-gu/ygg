package be7.oop1;

public class EX04 {
    public static void main(String[] args) { // 시작 클래스
        // 자료형
        // 변수 --> 배열

        // 기본 자료형
        int a;
        a=10;

        int[] b = new int[5];  // 1차원배열, 리스트구조
        b= new int[]{1, 2, 3, 4, 5};

        int[][] c = new int[2][3]; // 2차원 배열, 테이블구조(행X열) --> int[행][열] c;
        // c.length = 2
        // c[0].length = 3
        // c[1].length = 3

        // 2행x3열의 정수형 배열을 생성해보시오.
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                c[i][j] = 10;
                System.out.print(c[i][j]+"\t");
            }
            System.out.println(); // 줄바꿈
        }
        /* 10 10 10
           10 10 10 */


        // 사용자정의 자료형
//        Book d;
//        Book[] e;
//        Book[][] f;
    }
}
