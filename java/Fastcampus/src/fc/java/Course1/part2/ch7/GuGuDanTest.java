package fc.java.Course1.part2.ch7;

public class GuGuDanTest {
    public static void main(String[] args) {
        // Q. [이중 for문]을 이용하여 구구단(9x9)을 출력하시오.
        for (int i = 2; i <= 9; i++) {
            System.out.print(i+"단"+"\t\t");
        }

        System.out.println(); // 줄바꿈

        // 1) 2x1=2    3x1=3    4x1=4    ~9x1=9 -> 변동되는 부분=i, 고정인 부분=j
//        for (int i = 1; i <= 1; i++) { // 변동되는 부분
//            for (int j = 2; j <= 9; j++) { // 고정되는 부분
//                System.out.print(j+"X"+i+"="+(j*i)+"\t");
//            }
//        }
//
//        System.out.println(); // 줄바꿈
//
//        // 2) 2X2=4    3X2=6    4X2=6    ~9X2=18
//        for (int i = 2; i <= 2; i++) {
//            for (int j = 2; j <= 9; j++) {
//                System.out.print(j+"X"+i+"="+(j*i)+"\t");
//            }
//        }

        // '1)'과 '2)'의 차이와 고정적인 규칙을 찾는다. -> j 부분 고정, i부분 변동(반복)규칙
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j+"X"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }

    }
}
