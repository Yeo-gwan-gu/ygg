package fc.java.model;

public class AllStatic {
    private AllStatic() { // private 생성자 생성
    }

    public static int hap(int a, int b) { // 총합
        int v = a+b;
        return v;
    }

    public static int max(int a, int b) { // 최대값
        return a > b ? a : b;
    }

    public static int min(int a, int b) { // 최소값
        return a < b ? a : b;
    }
}