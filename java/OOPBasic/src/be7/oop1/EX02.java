package be7.oop1;

public class EX02 {
    static int b; // 멤버변수(초기화를 하지 않으면 타입의 기본값으로 초기화됨 -> int=0)

    // static이 붙어 있는 메서드는 static이 없으면 서로 연결되지 않음

    public static void main(String[] args) {   // 메서드
        // 하나의 데이터를 처리하는 방법과 여러 개의 데이터를 처리하는 방법

        int a = 10; // 선언+초기화  // 지역변수(반드시 초기화 해야함)
        System.out.println(a);
        System.out.println(b); // 0

        // Q. 정수 데이터 5개를 저장하고 그 합을 계산해서 출력한다면 어떻게 될까요?

//        int a1 = 10;
//        int a2 = 10;
//        int a3 = 10;
//        int a4 = 10;
//        int a5 = 10;
//        int total = a1+a2+a3+a4+a5;
//        System.out.println(total);
        // ㄴ> 문제점 : 데이터 이동 시, 데이터 수가 많아질 때...
        // 구조=덩어리=객체(Object)

        int[] ar = new int[5]; // 배열 생성 -> 반복문(for, while)
        ar[0]=10; // 원소 저장
        ar[1]=20;
        ar[2]=30;
        ar[3]=40;
        ar[4]=50;
//        System.out.println(ar[0]+"\t"+ar[1]+"\t"+ar[2]+"\t"+ar[3]+"\t"+ar[4]);

        for (int i = 0; i < ar.length; i++) { // i++ -> i=i+1
            System.out.println("ar = "+ar[i]);
        }
//      int sum = ar[0]+ar[1]+ar[2]+ar[3]+ar[4]; --> 반복문을 쓰지 않고 합계를 구할 경우 // 누적
//      System.out.println(sum); --> 150
        int sum = 0;
//        sum = sum+ar[0];
//        sum = sum+ar[1];
//        sum = sum+ar[2];
//        sum = sum+ar[3];
//        sum = sum+ar[4];
//        System.out.println("sum = " + sum);

        for (int i = 0; i < ar.length; i++) { // 방법 1
//            sum = sum + ar[i]; // 아래와 동일
            sum +=ar[i];
        }
        System.out.println("sum = " + sum);


        int hap = 0;                          // 방법 2 (향상된 for문 --> foreach)
        for ( int su : ar ) {
//            hap = hap+su; // 아래와 동일
            hap +=su;
        }
        System.out.println("hap = "+hap);
    }
}
