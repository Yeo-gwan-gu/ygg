package be7.oop1;

public class EX10 {
    public static void main(String[] args) {
    // 메서드 호출(method Call)
    int[] a = makeArray();

    // Q. 배열의 모든 원소의 총합을 구하시오.
        int sum=0;
        for (int data: a) {
            sum+=data;
        }
        System.out.println(sum); // 10+20+30+40+50 = 150

    }
    // 정수형 배열에 5개의 정수를 저장하고, 배열을 리턴하는 메서드를 정의(makeArray)

    public static int[] makeArray() {
        int[] a = {10,20,30,40,50}; // 생성+초기화
        return a;

    } // makeArray_
}
