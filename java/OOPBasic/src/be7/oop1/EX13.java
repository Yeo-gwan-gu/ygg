package be7.oop1;

public class EX13 {
    public static void main(String[] args) {
        // 6. 빈도수 구하기 (range : 1~5)
        int[] a = {1,3,4,1,2,5,1,3,4,1};
        // 1의 cnt : 4개 --> c[0] : 0(초기값)
        // 2의 cnt : 1개 --> c[1] : 0(초기값)
        // 3의 cnt : 2개 --> c[2] : 0(초기값)
        // 4의 cnt : 2개 --> c[3] : 0(초기값)
        // 5의 cnt : 1개 --> c[4] : 0(초기값)

        int[] cnt = new  int[5]; // 초기값을 모두 0
        for (int i = 0; i < a.length; i++) {
            cnt[a[i]-1]++; // cnt[1]-1]=cnt[0]=1  !!핵심
        }

        for (int i = 0; i < cnt.length; i++) {
            System.out.print(i+"의 cnt : "+cnt[i]+"개 : ");
            for (int j = 0; j < cnt[i]; j++) { // 해당 정수의 개수만큼 * 찍기
                System.out.print("*");
            } // j_
            System.out.println(); // _
        } // i_

    }
}
