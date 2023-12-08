package be7.model;
// 부모(Remocon) : 불완전한 부모

public interface Remocon { // 리모콘 (동작 정의만 한다, 구현을 하면 X)
    public abstract void add(int data); // 정의 (추상메서드) (abstract는 생략)
    public int get(int index); // 정의 (추상메서드) (abstract는 생략)
    public int size(); // 정의 (추상메서드) (abstract는 생략)



}

