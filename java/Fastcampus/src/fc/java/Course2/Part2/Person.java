package fc.java.Course2.Part2;

public class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
//      생성자 참조
        PersonFactiory personFactiory1 = Person::new;
        Person person1 = personFactiory1.create("John Doe", 30);

//      람다 표현식을 사용하는 방법
        PersonFactiory personFactiory2 = (name, age) -> new Person(name, age);
        Person person2 = personFactiory2.create("John Doe", 30);

//      익명 내부 클래스를 사용한 예제(이전 방법)
        PersonFactiory personFactiory3 = new PersonFactiory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };
        Person person3 = personFactiory3.create("John Doe", 30);

    }
}

interface PersonFactiory {
    Person create(String name, int age);
}
