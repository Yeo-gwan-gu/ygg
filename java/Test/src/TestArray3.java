public class TestArray3 {
    public static void main(String[] args) {
        // Q. 정수 5개를 아래처럼 배열에 초기화하고 index 0번째와 index 3번째 값을 더하여 출력하시오.

        int[] a = {10,20,30,40,50};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // 10 20 30 40 50 (줄바꿈 되어있음)
        }

        int sum = a[0]+a[3];
        System.out.println("sum = " + sum); // sum = 50
//      System.out.println(a[0]+a[3]);

    }
}
