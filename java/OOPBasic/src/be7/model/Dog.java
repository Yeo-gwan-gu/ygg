package be7.model;

public class Dog extends Animal {
    public Dog() {
        super(); // new Animal(); --> 생략 되어 있음.
    }
    @Override // 재정의(@어노테이션)
    public void eat() {
        System.out.println("개처럼 먹다.");
    }
}
