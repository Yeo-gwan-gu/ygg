public class TestArray1 {
    public static void main(String[] args) {
        // Q. 정수 5개를 저장할 배열을 생성하고 모든 원소에 10을 저장하시오.

//        int[] arr = {10,10,10,10,10};   ---> 배열 선언+초기화

        int[] arr = new int[5];
//        arr[0] = 10;                    ---> 배열(열) 개별 초기화
//        arr[1] = 10;                    ---> 이 방식으로 하면 데이터가 많아지면 어려움
//        arr[2] = 10;
//        arr[3] = 10;
//        arr[4] = 10;

        for (int i = 0; i < arr.length; i++) {   // for문 활용하여 초기화
            arr[i] = 10;
            System.out.println(arr[i]);
        }
    }
}