package fc.java.Course2.Part2;

import fc.java.Course2.model2.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
//      (int x, int y) -> {return x+y;} : 람다식을 사용하여 add 메서드 구현
//      람다식 : 코드를 간결, 확장, 구현이 쉽다...
        MathOperation add = (x,y) -> x+y;
//      MathOperation add = (int x, int y) -> {return x+y;};

//      add 메서드를 사용하여 10과 20 더하기
        int result = add.operation(10,20);
        System.out.println(result);
    }
}
