package be7.test;
import java.util.Scanner;

public class MovieOperations {
    private MovieDTO[] movies; // 영화 정보 배열
    private int count; // 입력된 영화의 수

    public MovieOperations(int maxSize) {
        movies = new MovieDTO[maxSize];
        count = 0;
    }

    // 영화 정보 입력
    public void inputMovie(Scanner scan) {
        System.out.println("영화 데이터를 입력하세요.");
        System.out.println("제목에 '-1'을 입력하면 입력을 종료합니다.");

        while (true) {
            System.out.print("영화"+(count+1)+"번 제목: ");
            String title = scan.nextLine();

            if (title.equals("-1")) {
                break;
            } // -1 입력 시 break

            System.out.print("주인공: ");
            String major = scan.nextLine();

            System.out.print("상영시간: ");
            int runningTime = scan.nextInt();

            System.out.print("평점: ");
            float rating = scan.nextFloat();

            System.out.print("장르(1: 드라마, 2: 액션, 3: 호러): ");
            int genre = scan.nextInt();
            scan.nextLine();

            MovieDTO movie = new MovieDTO();
            movie.setTitle(title);
            movie.setMajor(major);
            movie.setRunningTime(runningTime);
            movie.setRating(rating);
            movie.setGenre(genre);

            movies[count] = movie;
            count++;

            System.out.println("영화 정보가 입력되었습니다.\n");
        }
    } // 영화정보 입력_

    // 영화정보 출력
    public void printMovies() {
        if (count == 0) {
            System.out.println("입력된 영화 정보가 없습니다.");
            return;
        }

        System.out.println("영화 정보를 출력합니다.");

        // 평점 기준 내림차순
        for (int i = 0; i < count-1; i++) {
            for (int j = i+1; j < count; j++) {
                if (movies[i].getRating() < movies[j].getRating()) {
                    MovieDTO tmp = movies[i];
                    movies[i] = movies[j];
                    movies[j] = tmp;
                }
            }
        } // 내림차순_

        // 정렬된 영화 정보 출력
        for (int i = 0; i < count; i++) {
            System.out.println(movies[i]);
        } // 정렬된 영화 정보 출력_
    } // 영화정보 출력_

    // 장르별 영화 검색
    public void searchMovieByGenre(Scanner scan) {
        System.out.println("검색할 장르를 입력하세요 (1: 드라마, 2: 액션, 3: 호러): ");
        int genre = scan.nextInt();
        scan.nextLine();

        System.out.println(genre+"장르의 영화를 검색합니다.");

        boolean found = false; // 검색결과 유무 확인을 위한 변수


        for (int i = 0; i < count-1; i++) {
            for (int j = i+1; j < count; j++) {
                if (movies[i].getRating() < movies[j].getRating()) {
                    MovieDTO tmp = movies[i];
                    movies[i] = movies[j];
                    movies[j] = tmp;
                }
            }
        } // 내림차순_

        for (int i = 0; i < count; i++) {
            if(movies[i].getGenre() == genre) {
                System.out.println(movies[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("잘못된 장르 번호입니다. 다시 입력하세요.");
        }
    } // searchMovieByGenre_
}
