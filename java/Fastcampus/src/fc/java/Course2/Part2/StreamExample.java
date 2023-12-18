package fc.java.Course2.Part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//      자바에서 제공된 함수형 인터페이스를 사용한 짝수 여부 판별
        Predicate<Integer> isEven = n -> n % 2 == 0;

//      Stream API를 사용해 짝수만 필터링, 정렬, 제곱하고 합계를 계산
        int sumOfSquares = numbers.stream()
                .filter(isEven)
                .sorted()
                .map(n -> n*n)
                .reduce(0, Integer::sum);

        System.out.println("짝수의 제곱의 합 : " + sumOfSquares);
    }
    /*
    1) numbers 리스트를 스트림으로 변환한다.
    2) `filter()` 메서드를 사용하여 짝수만 필터링 한다. (여기서 함수형 인터페이스인 `Predicate`를 사용한다.)
    3) `sorted()` 메서드를 사용하여 정렬한다.
    4) `map()` 메서드를 사용하여 각 숫자를 제곱한다. (\*주어진 함수를 스트림의 모든 원소에 적용한 결과로 새로운 스트림을 생성)
    5) `reduce()`메서드를 사용하여 합계를 계산한다. (\*스트림의 요소를 결합하여 하나의 결과 값을 생성)
    6) 출력

    해당 예제는 함수형 인터페이스 Predicate<T> 를 사용하여 짝수 여부를 판별하는 람다 표현식을 정의하고, (\*booolean test(T t));
    Stream API를 사용하여 여러 작업을 연속적으로 수행한다..
    이렇게 하면 간결하고도 가독성이 높은 코드를 작성할 수 있다.
     */
}
