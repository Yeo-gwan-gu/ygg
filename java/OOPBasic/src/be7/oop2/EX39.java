package be7.oop2;

import be7.model.BookDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX39 {
    public static void main(String[] args) {
//      키보드로부터 책 데이터를 입력 받아서 ArrayList
        Scanner scan = new Scanner(System.in);
        List<BookDTO> list = new ArrayList<>(); // upcasting (ArrayList -> List)

        while (true) {
            System.out.print("책 제목 : ");
            String title = scan.nextLine();

            if (title.equalsIgnoreCase("EXIT")) {
                break;
            } // "EXIT" or "exit" 입력 시 탈출

            System.out.print("책 가격 : ");
            int price = scan.nextInt();
            scan.nextLine(); // 버퍼비우기

            System.out.print("책 저자 : ");
            String name = scan.nextLine();

            System.out.print("책 페이지수 : ");
            int page = scan.nextInt();
            scan.nextLine(); // 버퍼비우기

//      묶고(DTO) --> 담고(ArrayList)
//      1. 묶기
            BookDTO dto = new BookDTO(title, price, name, page);

//      2. 담기
//          List<BookDTO> list = new ArrayList<>(); // upcasting (ArrayList -> List)
            list.add(dto);

        } // while_end

//      3. 출력
//      책 제목을 기준으로 오름차순 정렬하여 출력
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {

//              기준.compareTo(비교대상) > 0
                if (list.get(i).getTitle().compareTo(list.get(j).getTitle()) > 0) {
//                  자리바꿈
                    BookDTO tmp;
                    tmp=list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);

                } // if_end
            }
        } // for_end

        for(BookDTO book : list) {
            System.out.println(book);
        }

    }
}
