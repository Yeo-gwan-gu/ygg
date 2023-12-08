package be7.oop2;

import be7.model.MyCalc;

public class EX21 {
    public static void main(String[] args) {
        // class : 모델을 만드는 도구
        // Model : 특정한 역할을 가지고 있는 객체
        // Model의 종류
        // 1. DTO(Data Transfer Object) : 이질적인 데이터를 담아서 이동하는 역할
        // 2. DAO(Data Access Object) : DTO객체를 가지고 데이터베이스에 CRUD를 하는 역할
        // CRUD : Create(저장), Read(검색), Update(수정), Delete(삭제)
        // 3. Utility(helper) : 도움을 주는 객체
        int a=10;
        int b=20;
//        객체생성
//        MyCalc m = new MyCalc();
//        System.out.println("m.mul(a,b) = " + m.mul(a,b));
//        System.out.println("m.add(a,b) = " + m.add(a,b));
//        System.out.println("m.sub(a,b) = " + m.sub(a,b));
//        System.out.println("m.div(a,b) = " + m.div(a,b));

        // static 멤버들은 해당 클래스를 사용하는 시점에서 자동으로 메모리에 로딩이 된다. (new -> x)
        // 생성자를 private로 만들면 객체를 생성할 수 없다.
        System.out.println(MyCalc.add(a,b));
        System.out.println(MyCalc.sub(a,b));
        System.out.println(MyCalc.mul(a,b));
        System.out.println(MyCalc.div(a,b));

//        Math math = new Math();
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));



    }
}
