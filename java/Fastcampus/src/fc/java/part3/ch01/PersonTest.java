package fc.java.part3.ch01;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한 [사람]의 데이터를 저장할 [변수를 선언] 하시오.
        // 모델링 된 Person클래스를 이용하여 [객체를 메모리에 생성] 하시오.
        // [인스턴스]를 만드는 과정

//      fc.java.part3.ch01.Person p; --> 해당 클래스가 같은 디렉토리 안에 없을 경우 패키지의 풀네임을 명시해야 한다.
        Person p = new Person();
        p.name = "홍길동";
        p.age = 30;
        p.phone = "010-1234-5678";
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();

        Person p1 = new Person();
        p.name = "나길동";
        p.age = 25;
        p.phone = "010-5678-1234";
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();
    }
}
