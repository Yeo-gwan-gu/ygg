package be7.oop1;

public class EX03 {
    public static void main(String[] args) {
        // 한개의 자료형 -> 여러 개의 자료형 : 배열(array)

        int[] arr = {10,20,30,40,50}; // 배열 생성+초기화

        // Q. 모든 원소의 합을 구하시오.

//        int sum = 0; --> 별도 메서드 생성
//        for (int su : arr) {
//            sum+=su;
//        }

        int sum = arrTotal(arr); // 메서드 호출(Call)
        System.out.println("sum = " + sum); // 150
    }

    // 배열의 모든 원소의 총합을 구하여 리턴하는 동작을 만드시오. (메인메서드 외부에 만들어야함)
    public static int arrTotal(int[] arr) { // 리턴타입 메서드이름() --> 메서드=동작(함수)
        int sum = 0;         // 처리
        for (int su : arr) {
            sum+=su;
        }
        return sum;
    }
}