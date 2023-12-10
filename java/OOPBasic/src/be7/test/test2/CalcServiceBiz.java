package be7.test.test2;

public class CalcServiceBiz implements ICalcService {

    @Override
    public NumberDTO add(NumberDTO number) {
        double result = number.getNum1() + number.getNum2();
        number.setResult(result);
        return number;
    }

    @Override
    public NumberDTO sub(NumberDTO number) {
        double result = number.getNum1() - number.getNum2();
        number.setResult(result);
        return number;
    }

    @Override
    public NumberDTO mul(NumberDTO number) {
        double result = number.getNum1() * number.getNum2();
        number.setResult(result);
        return number;
    }

    @Override
    public NumberDTO div(NumberDTO number) {
        double result = number.getNum1() / number.getNum2();
        number.setResult(result);
        return number;
    }
    @Override
    public NumberDTO na(NumberDTO number) {
        double result = number.getNum1() % number.getNum2();
        number.setResult(result);
        return number;
    }
}
