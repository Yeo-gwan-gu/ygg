package fc.java.Course1.part3.ch03;

import fc.java.Course1.model.MemberDTO2;

public class Accessmodifier {
    public static void main(String[] args) {
        MemberDTO2 dto = new MemberDTO2();
        dto.name="홍길동";
//      dto.age = 1000; // 에러발생(접근불가)
        dto.phone="010-1234-5678";
        System.out.println(dto.name+"\t"+dto.phone);
    }
}
