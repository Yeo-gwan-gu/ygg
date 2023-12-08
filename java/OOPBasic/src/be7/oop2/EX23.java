package be7.oop2;

import be7.model.BookDTO;

import java.util.Scanner;

public class EX23 {
    public static void main(String[] args) {
        // Q. 키보드로부터 책 정보를 입력 받아서 출력하시오.
        Scanner scan = new Scanner(System.in);
        System.out.print("책 제목 : ");
        String title = scan.nextLine();

        System.out.print("책 가격 : ");
        int price = scan.nextInt(); // 숫자를 읽고 엔터에 버퍼가 남아 있음
        scan.nextLine();            // 엔터를 한번 읽어 주어야함

        System.out.print("책 저자 : ");
        String name = scan.nextLine();

        System.out.print("책 페이지수 : ");
        int page = scan.nextInt();
        scan.close();

        BookDTO book = new BookDTO(title, price, name, page);
        System.out.println(book.toString());
    }
}
