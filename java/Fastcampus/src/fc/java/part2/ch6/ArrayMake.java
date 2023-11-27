package fc.java.part2.ch6;

public class ArrayMake {
    public static void main(String[] args) {
        // Q. 정수 5개를 저장할 배열을 생성 하시오.
        int[] v = new int[5];
//        v[0] = 1;
//        v[1] = 2;
//        v[2] = 3;
//        v[3] = 4;
//        v[4] = 5;  --> 반복문 안으로 이동
        // System.out.println(v[0]+"\t"+v[1]+"\t"+v[2]+"\t"+v[3]+"\t"+v[4]);

        // 반복문
        for (int i=0; i<v.length; i++) { // [i]의 시작값; 언제까지 반복할건지(조건); i++
            v[i] = 10;
            System.out.println(v[i]);
        }

        float[] f = new float[5]; // 길이가 고정
        // Book b1, b2, b3;
        Book[] b = new Book[3]; // 책 3권을 저장할 배열을 생성
    }
}
