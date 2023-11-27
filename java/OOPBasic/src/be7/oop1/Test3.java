package be7.oop1;

public class Test3 {
    public static void main(String[] args) {
        // Q. 실수형 배열울 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의해보시오(메서드명 floatTotal)
        float[] ff = {1.1f,2.2f,3.3f,4.4f,5.5f};

        float sum = floatTotal(ff);
        System.out.println(sum);
    }
    public static float floatTotal(float[] ff) {
        float sum =0;
        for (float su : ff) {
            sum+=su;
        }
        return sum;
    }
}
