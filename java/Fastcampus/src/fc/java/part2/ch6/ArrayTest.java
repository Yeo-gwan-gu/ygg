package fc.java.part2.ch6;

public class ArrayTest {
    public static void main(String[] args) {
        // Q. 정수 5개를 저장할 배열을 생성하시오.

        // 2줄로 초기화 하는 방법
        // int[] a;
        // a = new int[]{1,2,3,4,5};

        int[] a = new int[]{1,2,3,4,5};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        float[] b = new float[5];
        b[0] = 1.1f;
        b[1] = 2.2f;
        b[2] = 3.3f;
        b[3] = 4.4f;
        b[4] = 5.5f;
        for (int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
        // Q. 정수 5개를 아래처럼 [배열에 초기화] 하고 index 0번째와 index 3번째 값을 더하여 출력하세요.
        int[] c = {10,20,30,40,50};
        for (int i = 0; i < c.length; i++) {
            System.out.println(a[i]);
        }
        int sum=c[0]+c[3];
        System.out.println("sum = "+sum);
        System.out.println("배열의 길이 = "+a.length);

        float[] v = new float[3];
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
    }
}
