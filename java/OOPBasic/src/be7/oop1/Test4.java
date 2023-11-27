package be7.oop1;

import java.util.*;

public class Test4 {

    public static void main(String[] args) {
        Integer[] arr = {4,3,2,5,1};
        Character[] cha = {'a', 'b', 'c', 'd', 'e'};
        String[] str = {"AA", "BB", "CC", "DD", "EE"};

        Arrays.sort(arr); // 오름차순(int)
        Arrays.sort(cha); // 오름차순(cha)
        Arrays.sort(str); // 오름차순(str)

        System.out.print("int[] = ");
        for (int i : arr) {
            System.out.print(i+"\t"); // int[] = 1 2 3 4 5
        }
        System.out.println();

        System.out.print("char[] = ");
        for (char i : cha) {
            System.out.print(i+"\t"); // char[] = a b c d e
        }
        System.out.println();

        System.out.print("String[] = ");
        for (String i : str) {
            System.out.print(i+"\t"); // String[] = AA BB CC DD EE
        }
        System.out.println();

        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder()); // error -> 기본 자료형은 사용할 수 없음. (int -> Integer로 변환 필요)
        System.out.print("Integer[] = ");
        for (int i : arr) {
            System.out.print(i+"\t"); // Integer[] = 5 4 3 2 1
        }
        System.out.println();

        Arrays.sort(cha, Collections.reverseOrder()); // error -> 기본 자료형은 사용할 수 없음. (char -> Character로 변환 필요)
        System.out.print("Character[] = ");
        for (char i : cha) {
            System.out.print(i+"\t"); // Character[] = e d c b a
        }
        System.out.println();

        Arrays.sort(str, Collections.reverseOrder());
        System.out.print("String[] = ");
        for (String i : str) {
            System.out.print(i+"\t"); // String[] = EE DD CC BB AA
        }
        System.out.println();



    }
}
