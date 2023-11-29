package fc.java.part3.ch03;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO 객체에 원하는 이름 나이 전화번호를 저장하고 출력하시오.

        PersonVO vo = new PersonVO();
        PersonVO vo1 = new PersonVO("A",20,"010-5678-1234");
        PersonVO vo2 = new PersonVO("B",30,"010-9999-9999");

        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
        System.out.println(vo1.getName()+"\t"+vo1.getAge()+"\t"+vo1.getPhone());
        System.out.println(vo2.getName()+"\t"+vo2.getAge()+"\t"+vo2.getPhone());
    }
}
