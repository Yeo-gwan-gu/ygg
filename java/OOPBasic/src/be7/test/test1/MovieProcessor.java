package be7.test.test1;
import java.util.Scanner;

public class MovieProcessor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        MovieOperations oper= new MovieOperations(100);
        System.out.println("======== 장르별 영화 검색 프로그램("+"4조-살려조"+") ========");
        System.out.println("1.영화입력(I)" + "\t" + "2.영화출력(P)" + "\t" + "3.영화검색(S)" + "\t" + "4.종료(E)");
        System.out.println("☑︎ 'E' 또는 '-1'을 입력할 경우 프로그램이 바로 종료됩니다.");
        System.out.println("=============================================");
        System.out.print("메뉴입력: ");

        while (true) {
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

            System.out.println("======== 장르별 영화 검색 프로그램("+menu.toUpperCase()+") ========");
            System.out.println("1.영화입력(I)" + "\t" + "2.영화출력(P)" + "\t" + "3.영화검색(S)" + "\t" + "4.종료(E)");
            System.out.println("☑︎ 'E' 또는 '-1'을 입력할 경우 프로그램이 바로 종료됩니다.");
            System.out.println("=============================================");
            System.out.print("메뉴입력: ");

        } // while_
        scan.close();
    }
}