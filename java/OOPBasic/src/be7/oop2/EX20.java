package be7.oop2;

import be7.model.BookDTO;

public class EX20 {
    public static void main(String[] args) {
        // Q. 책 3권을 저장할 [변수를 선언] 하시오.
        BookDTO[] b = new BookDTO[3]; // 객체배열
        b[0] = new BookDTO("자바",15000,"A",150);
        b[1] = new BookDTO("오라클",20000,"B",300);
        b[2] = new BookDTO("클린코드",30000,"C",500);

        for (BookDTO book : b) {
            System.out.println(book);
        }

        // Q. 책의 가격을 기준으로 내림차순 [정렬]하여 출력하시오.
        for (int i = 0; i < b.length; i++) {
            for (int j = i+1; j < b.length; j++) {
                if (b[i].getPrice() < b[j].getPrice()) {
                    BookDTO tmp;
                    tmp=b[i];
                    b[i]=b[j];
                    b[j]=tmp;
                } // if_
            } // j_
        } // i_
        System.out.println();

        for (BookDTO book : b) {
            System.out.println(book);
        }
    }
}
