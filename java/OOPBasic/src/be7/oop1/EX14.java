package be7.oop1;

public class EX14 {
    public static void main(String[] args) {
        // 7. 검색(search) --> SQL
        //   index =  0  1  2  3  4  5  6  7  8  9
        int[] data = {10,20,30,40,50,60,70,80,90,100};

        // 70의 index 값은? --> 6
        // - 순차검색 : 맨 앞부터 순서대로 검색 (성능↓) --> 데이터의 위치에 따라 성능이 들쑥날쑥함 (데이터량이 적을 때 사용)
        int sdata = 70;
        int pos=-1; // 초기값 : (-1 : 실패의 의미**)

        for (int i = 0; i < data.length; i++) {
            if (data[i] == sdata) {
               pos=i;
               break; // 반복문 탈출
            } // 순차검색 if_
        } // i_
        // 출력
        if (pos != -1) {
            System.out.println("검색성공");
            System.out.println("pos = " + pos); // 6
        } else {
            System.out.println("검색실패");
        } // 출력 if~else_
    }
}
