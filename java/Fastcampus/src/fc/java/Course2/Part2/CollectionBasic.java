package fc.java.Course2.Part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
//      ArrayList에 10, 20, 30, 40, 50 -> 5개의 정수(int)를 저장하고 출력 하시오.
//      ArrayList -> Object[] <--X-- int
//      ArrayList -> Object[] <--X-- Integer(Wrapper)
//      ArrayList -> Object[] <--(Auto-boxing)--int
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

//      출력
        for (int a : list) {
            System.out.print(a+"\t");
        }

    }
}
