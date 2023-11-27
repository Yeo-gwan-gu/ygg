package be7.oop1;

public class Test10 {
    public static void main(String[] args) {
        char[] c={'c','a','m','p','u','s'};

        char sdata='p'; // 찾고자하는 문자
        int low=0;
        int high=c.length-1; // 9
        int middle;
        int pos=-1;

        while (low <= high) {
            middle=(low+high)/2;
            if(c[middle] == sdata) {
                pos=middle;
                break;
            } else if (c[middle] < sdata) { // 중앙의 값 보다 찾고자하는 수가 더 클 경우
                low=middle+1; // low를 middle 뒤로 올린다.
            } else { // LEFT
                high=middle-1; // high를 middle 앞으로 내린다.
            } // if~else_
        } // while_
        // 출력
        if (pos != -1) {
            System.out.println("검색성공");
            System.out.println("pos = " + pos); // 6
        } else {
            System.out.println("검색실패");
        } // 출력 if~else_
    }
}
