package fc.java.part4.ch01;

public class Employee { // extends Object 는 기본적으로 생략되어 있음.(Object --> 최상위 클래스)
    private String name; // protected는 같은 패키지 안에서만 사용 가능
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;

    public Employee() {
//        super(); --> 상위클래스의 생성자를 호출 (기본적으로 생략되어 있음)
    }

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.empDate=empDate;
        this.dept=dept;
        this.marriage=marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
