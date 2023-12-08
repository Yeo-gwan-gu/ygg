package be7.test.test2;

public class NumberDTO {
    private int num1;
    private int num2;
    private double result;

    public NumberDTO(int num1, int num2, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    public NumberDTO() {

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "NumberDTO{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", result=" + result +
                '}';
    }
}
