package fc.java.Course2.Part1;

public class HelloWorldString {
    public static void main(String[] args) {
        String str1 = new String("Hello World"); // Heap Memory --> 생성자를 통한 생성마다 새로운 메모리 공간 생성
        System.out.println(str1);
        String str2 = "Hello World"; // Literal pool Memory --> 재활용 메모리 공간
        System.out.println(str2);
    }
}
