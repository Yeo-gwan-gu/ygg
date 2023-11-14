package be7.oop1;

public class EX01 {
    public static void main(String[] args) {
        // 변수(기억 공간), 자료형, 할당(=)
        // Q. 정수 1개를 저장할 [변수를 선언] 하시오.
        int a; // 변수 선언 -> 기억 공간이 생성 된다.
        a=12;
        // a가 짝수인지 홀수인지 판단하여 출력하시오.(? -> 논리적인 사고력?)
        if(a%2==0) { // 조건문
            System.out.println("짝수입니다."); // 0
        }else{
            System.out.println("홀수입니다.");
        }
        System.out.println("a = " + a); // 12
    }
}
