package fc.java.Course1.part3.ch03;

import fc.java.Course1.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; // st1 : object
        Student st2; // st2 : object
        Student st3; // st3 : object

        // st1 : Instance
        st1 = new Student("홍길동", "컴퓨터공학과", 37, "bit@empas.com", 20231110, "010-1234-5678");
        // st2 : Instance
        st2 = new Student("김길동", "컴퓨터공학과", 37, "bit@empas.com", 20231110, "010-1234-5678");
        // st3 : Instance
        st3 = new Student("나길동", "컴퓨터공학과", 37, "bit@empas.com", 20231110, "010-1234-5678");

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
