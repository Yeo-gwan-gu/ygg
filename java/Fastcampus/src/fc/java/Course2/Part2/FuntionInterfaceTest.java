package fc.java.Course2.Part2;

import fc.java.Course2.model2.MathOperation;

public class FuntionInterfaceTest implements MathOperation {
    public static void main(String[] args) {
        MathOperation mo = new FuntionInterfaceTest();
        int result = mo.operation(1,2);
        System.out.println(result);
    }

    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
