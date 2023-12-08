package be7.oop2;

import be7.model.IntArray;

public class EX26 {
    public static void main(String[] args) {

        // 사용설명서 : Object[]
        IntArray arr = new IntArray(5); // 기본크기 10 size
        arr.add(10); // 0
        arr.add(20); // 1
        arr.add(30); // 2

//        System.out.println(arr.get(0));
//        System.out.println(arr.get(1));
//        System.out.println(arr.get(2));
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        } // for_


    }
}
