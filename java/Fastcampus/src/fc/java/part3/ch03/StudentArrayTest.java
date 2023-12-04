package fc.java.part3.ch03;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        // Q. 객체배열을 이용하여 4명의 학생(Student) 데이터를 저장하고 출력하시오.
        Student[] std = new Student[4];
        std[0] = new Student("김김김", "컴퓨터공학과",20, "abc@naver.com", 20231110, "010-1234-5678");
        std[1] = new Student("이이이", "컴퓨터공학과",21, "abcd@naver.com", 20231111, "010-1234-5679");
        std[2] = new Student("박박박", "컴퓨터공학과",22, "abcde@naver.com", 20231113, "010-1234-5670");
        std[3] = new Student("오오오", "컴퓨터공학과",23, "abcdef@naver.com", 20231118, "010-1234-5671");
        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].toString());
        }

        for (Student s : std) {
            System.out.println(s.toString());
        }
    }
}
