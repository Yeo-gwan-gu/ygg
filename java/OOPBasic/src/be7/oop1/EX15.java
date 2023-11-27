package be7.oop1;

public class EX15 {
    public static void main(String[] args) {
        // 이진검색(Binary search) : 데이터를 원소의 개수의 중앙에서부터 검색
        // 조건 : 오름차순 정렬이 우선되어야 사용할 수 있다.
        int[] data = {10,20,30,40,50,60,70,80,90,100};

        int sdata=70; // 찾고자하는 수
        int low=0;
        int high=data.length-1; // 9
        int middle;
        int pos=-1;

        while (low <= high) {
            middle=(low+high)/2;
            if(data[middle] == sdata) {
                pos=middle;
                break;
            } else if (data[middle] < sdata) { // 중앙의 값 보다 찾고자하는 수가 더 클 경우
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
