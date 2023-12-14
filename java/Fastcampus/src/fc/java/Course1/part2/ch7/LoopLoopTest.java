package fc.java.Course1.part2.ch7;

public class LoopLoopTest {
    public static void main(String[] args) {

        int index=1;
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                System.out.println(index);
                index++;
            } // _j
        } // _i

        System.out.println();

        int[][] arr = {     // [2차원 배열]을 [이중 for문]을 활용하여 출력하기
                {1,2,3,4,5},
                {6,7,8,9,0} };

        for (int i=0; i<arr.length; i++) { // 행
            for (int j=0; j<arr[i].length; j++) { // 열
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println();

        // Q. [이중 반복문]을 이용하여 아래와 같은 구구단(9x9)을 출력하시오.

        int x = 0;
        int y = 0;

        for (int i=1; i<=9;i++){
            for (int j=2; j<=9; j++) {
                System.out.print(j+"x"+i+"="+String.format("%2d",j*i));
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
