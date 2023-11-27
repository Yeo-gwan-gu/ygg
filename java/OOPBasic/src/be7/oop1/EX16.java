package be7.oop1;

public class EX16 {
    public static void main(String[] args) {
        // 8. 정렬(sort) --> 오름차순, 내림차순  --> 석차, 순위(rank)
        // 선택정렬, 버블, 쉘, 퀵, 머지, 힙...
        int[] a={4,3,1,2,5};

        System.out.println("=정렬 전=");
        for (int data : a) {
            System.out.print(data+"\t");
        } // 배열출력 for문_

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) { // 오름차순
                    int tmp;
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
            } // if_
        } // j_
    } // i_
        System.out.println();
        System.out.println("=정렬 후=");
        for (int data : a) {
            System.out.print(data+"\t");
        } // 배열출력 for문_

  }
}
