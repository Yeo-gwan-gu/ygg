package fc.java.Course2.Part1;

import fc.java.Course2.model2.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args) {
        // Q. 정수 3개를 배열에 저장하고 출력하시오
        IntArray list = new IntArray();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0)); // 1
        System.out.println(list.get(1)); // 2
        System.out.println(list.get(2)); // 3

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");
        }
    }
}
