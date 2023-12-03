package be7.test;
import java.util.Scanner;

public class MovieProcessor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        MovieOperations oper= new MovieOperations(100);

        while (true) {
            System.out.println("======== 장르별 영화 검색 프로그램(그룹 이름) ========");
            System.out.println("1.영화입력(I)" + "\t" + "2.영화출력(P)" + "\t" + "3.영화검색(S)" + "\t" + "4.종료(E)");
            System.out.println("=============================================");
            System.out.print("메뉴입력: ");
            String menu = scan.nextLine();

            if (menu.equalsIgnoreCase("I")) {
                oper.inputMovie(scan);
            } else if (menu.equalsIgnoreCase("P")) {
                oper.printMovies();
            } else if (menu.equalsIgnoreCase("S")) {
                oper.searchMovieByGenre(scan);
            } else if (menu.equalsIgnoreCase("E") || menu.equalsIgnoreCase("-1")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴 입력입니다. 다시 입력해 주세요.");
            }
            System.out.println();
        } // while_

        scan.close();
    }
}
