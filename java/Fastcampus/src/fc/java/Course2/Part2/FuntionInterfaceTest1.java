package fc.java.Course2.Part2;

import fc.java.Course2.model2.MathOperation;

public class FuntionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        int result = mo.operation(1,2);
        System.out.println(result);
    }
}
