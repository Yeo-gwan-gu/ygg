package be7.oop1;

public class EX05 {
    public static void main(String[] args) {
        // 가변길이 배열(메모리 데이터 베이스) -> 논리적인 사고력(자료구조, 알고리즘)
        int[][] a = new int[5][];
//        a[0] = new char[1];
//        a[1] = new char[2];
//        a[2] = new char[3];
//        a[3] = new char[4];
//        a[4] = new char[5];
        // int[][] a = new int[5][5];
        for (int i = 0; i < 5; i++) {
            a[i] = new int[i+1];
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = '*';
                System.out.print((char)a[i][j]);
            } // _j
            System.out.println();
        } // _i
    }
}
