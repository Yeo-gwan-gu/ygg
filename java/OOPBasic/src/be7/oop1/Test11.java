package be7.oop1;

public class Test11 {
    public static void main(String[] args) {
        char[] a={'1','3','4','1','2','5','1','3','4','1'};

        int[] cnt = new  int[10]; // 초기값을 모두 0

        for (int i = 0; i < a.length; i++) {
            cnt[a[i]-'0']++;
        }

        for (int i = 0; i < cnt.length; i++) {
            System.out.print(i+"의 cnt : "+cnt[i]+"개 : ");
            for (int j = 0; j < cnt[i]; j++) { // 해당 문자의 개수만큼 * 찍기
                System.out.print("*");
            } // j_
            System.out.println(); // _
        } // i_
    }
}
