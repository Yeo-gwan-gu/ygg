package fc.java.part3.ch03;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        // Q. Setter, Getter 메서드를 통해 PersonVO 객체에 이름, 나이, 전화번호를 저장하고 출력하시오.

        PersonVO vo = new PersonVO();
        vo.setName("홍길동");
        vo.setAge(2000);
        vo.setPhone("010-1234-5678");

        System.out.println(vo.getName()); // "홍길동"
        System.out.println(vo.getAge()); // 2000
        System.out.println(vo.getPhone()); // "010-1234-5678"
    }
}
