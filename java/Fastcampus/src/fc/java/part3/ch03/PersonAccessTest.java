package fc.java.part3.ch03;

import fc.java.part3.ch01.Person;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Q. Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하시오.
        Person p = new Person();
        p.name="홍길동";
        p.age=1000; // ?
        p.phone="010-1234-5678";
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);



    } // main_

} // PersonAccessTest_
