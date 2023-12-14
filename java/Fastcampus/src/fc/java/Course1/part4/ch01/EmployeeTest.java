package fc.java.Course1.part4.ch01;

public class EmployeeTest {
    public static void main(String[] args) {
        // Q. 일반사원 한명의 객체를 생성하고 데이터를 저장 후 출력 하시오.
        RempVO vo = new RempVO("홍길동", 50, "010-1234-5678", "2020-01-01", "홍보부", true);
//        vo.name="홍길동";
//        vo.age=33;
//        vo.phone="010-1234-5678";
//        vo.empDate="2020.01.01";
//        vo.dept="홍보부";
//        vo.marriage=true;

        System.out.println(vo.toString());
    }
}
