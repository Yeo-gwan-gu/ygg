package fc.java.Course1.part3.ch03;

import fc.java.Course1.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        // Q. 정수 6개를 저장할 배열을 생성하시오.
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 12;
        arr[3] = 13;
        arr[4] = 14;
        arr[5] = 15;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Q. 잘 설계된 학생(Student) 객체를 설계하고 데이터를 저장한 후 출력하시오.
        Student std = new Student("홍길동", "컴퓨터공학과", 37, "bit@empas.com", 20231110, "010-1234-5678");
        System.out.println(std.toString());
    }
}
