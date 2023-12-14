package fc.java.Course1.part4.ch06;
import fc.java.Course1.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글입니다.");
        System.out.println(b.getTitle());
        System.out.println(b.toString()); // b 객체의 번지 출력 (fc.java.Course1.poly.Board@30f39991)
        System.out.println(b.toString()); // 재정의 --> Board{title='게시글입니다.'}

    }
}
