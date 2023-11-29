package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    public PersonVO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public PersonVO() {
//        this.name = "홍길동";
//        this.age = 50;
//        this.phone = "010-1234-5678";
    }

    public String toString() {
        return name+"\t"+age+"\t"+phone;
    }

    public String getName() {
        return name; // this.name
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age; // this.age
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone; // this.phone
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
