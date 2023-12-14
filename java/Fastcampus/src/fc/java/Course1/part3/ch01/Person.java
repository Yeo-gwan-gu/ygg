package fc.java.Course1.part3.ch01;
// object = 상태정보(멤버변수) + 행위정보(멤버메서드)
public class Person {
    // 상태정보(멤버변수)
    public String name;
    public int age;
    public String phone;

    // 기본 생성자 메서드 (기본적으로 생략되어 있다.)
    public Person() {

    }

    // 행위정보(멤버메서드)
    public void play() {
        System.out.println("운동을 한다.");
    } // play_
    public void eat() {
        System.out.println("음식을 먹다.");
    } // eat_
    public void walk() {
        System.out.println("걷다.");
    } // walk_

} // Person_
