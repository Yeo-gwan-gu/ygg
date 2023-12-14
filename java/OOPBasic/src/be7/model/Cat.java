package be7.model;

public class Cat extends Animal { // 단일상속(java는 다중상속을 지원하지 않는다.)

    public Cat() {
        super(); // new Animal(); --> 생략 되어 있음.
    }

    public void night() {
        System.out.println("밤에 눈에서 빛이 난다.");
    }

    @Override
    public void eat() {
        System.out.println("고양이처럼 먹다.");
    }
}
