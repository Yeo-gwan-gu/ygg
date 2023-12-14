package fc.java.Course1.part4.ch01;

// 일반사원(VO)
public class RempVO extends Employee{
    public RempVO() {
    }
    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        // 초기화 (자식이 부모의 기억공간에 초기화를 하는 경우)
//        this.name = name;
//        this.age = age;
//        this.phone = phone;
//        this.empDate = empDate;
//        this.dept = dept;
//        this.marriage = marriage;
        super(name, age, phone, empDate, dept, marriage);
    }


}
