package be7.oop1;

public class Test12 {
    public static void main(String[] args) {
        int a = 300;
        int b = 500;

//      int sum=inthap(a,b);  --> Method Area에 같은 메서드 명이 존재하면 충돌이 일어날 수 있어 명확하게 명시 해주는게 좋다.
        int sum = Test12.inthap(a,b);
//      데이터타입 변수명 = 클래스명.메서드명(매개변수);
        System.out.println("sum = " + sum);
    }
    public static int inthap(int x, int y) {
        int sum=x+y;
        return sum;
    }
}
