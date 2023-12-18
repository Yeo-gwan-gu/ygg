package fc.java.Course2.Part2;

import fc.java.Course2.model2.MathOperation;

public class MathOperationImpl implements MathOperation {
    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
