package fc.java.part3.ch03;

import fc.java.model.PersonVO;

public class TostringTest {
    public static void main(String[] args) {
        // Q. Setter, Getter 메서드를 통해 PersonVO 객체에 이름, 나이, 전화번호를 저장하고 출력하시오.

        PersonVO p = new PersonVO("나길동",30,"010-9999-9999");
        System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getPhone());

        System.out.println(p.toString());
        System.out.println(p); // p.toString()
    }
}
