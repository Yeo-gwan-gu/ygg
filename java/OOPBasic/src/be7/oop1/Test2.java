package be7.oop1;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {

/*
1. 자바에서 자주 사용하는 클래스가 들어있는 기본 패키지는 무엇인가.
> base
2. 자바에서 문자열을 저장하기 위해서 만들어진 자료형은 무엇인가? (클래스의 fullname을 쓰시오)
> java.lang.String;
3. 기본 자료형의 타입을 서로 변환하는 방법을 무엇이라고 하는가?
> casting
4. 여러개의 동일한 데이터를 처리하기 위해서 사용하는 자료구조는 무엇인가?
> 배열(array)
5. 배열을 사용하는 이점을 2가지 정도 기술하시오.
> 데이터 이동, 많은 데이터를 처리하기 용이함
6. 배열의 길이를 구하는 속성은 무엇인가?
> .length
7. 실수 데이터 5개를 저장하기 위한 배열을 생성하는 코드를 작성하시오.
> float[] f = new float[5];
8. 반복적인 코드를 하나의 동작으로 만들어 놓고 필요할 때 호출하여 사용하는 것을 무엇이라고 하는가?
> 멤버변수
9. 실수형 배열을 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의하시오.(메서드명 floatTotal)
>
10. 문자 '0','a', 'A'의 아스키코드 값을 각각 쓰시오.
> 0 = 48 / a = 97 / A = 65
11. '1'+'1' = 2 가 되려면 어떻게 해야되는지 생각해보세요.
>
char a = '1';
char b = '1';
int sum = (a-'0')+(b-'0');
System.out.println(sum);

[실습문제]
int[] arr = {4,3,1,2,5};
위 배열을 가지고 본인이 해볼 수 있는 다양한 프로그램을 최대 5가지 이상을 만들어 보시오.
예시)
1. 배열을 반복하여 각 요소를 출력합니다.
>
int[] arr = {4,3,1,2,5};
        for (int a : arr) {
            System.out.println("a = " + a);
        }
2. 배열을 오름차순으로 정렬합니다.
>
int[] arr = {4,3,1,2,5};
        Arrays.sort(arr);

        for (int a : arr) {
            System.out.println("a = " + a);
        }
3. 배열의 특정 요소(이 경우 '3')를 검색 중입니다. (2번째 위치에 3이 있습니다.)
>
int[] arr = {4,3,1,2,5};
        Arrays.sort(arr);
        System.out.println(arr[2]);
4. 배열에 있는 모든 요소의 합계를 계산합니다.
>
int[] arr = {4,3,1,2,5};

        int sum = 0;
        for (int s : arr) {
            sum+=s;
        }
        System.out.println("sum = " + sum);
5. Java스트림을 사용하여 배열에서 최소 및 최대 값을 찾습니다.
6. 배열을 역순으로 인쇄합니다.
7. 짝수의 합, 홀수의 합을 구해본다.
*/
    }
}
