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
            String title;
            while (true) {
                System.out.print("영화"+(count+1)+"번 제목: ");
                title = scan.nextLine();
                if (title.length() > 0) {
                    break;
                } else {
                    System.out.println("영화의 제목이 입력되지 않았습니다. 다시 입력해 주세요.");
                }
            }

            if (title.equals("-1")) {
                break;
            } // -1 입력 시 break

            String major;
            while (true) {
                System.out.print("주인공: ");
                major = scan.nextLine();
                if (major.length() > 0) {
                    break;
                } else {
                    System.out.println("주인공의 이름이 입력되지 않았습니다. 다시 입력해 주세요.");
                }
            }

            int runningTime;
            while (true) {
                System.out.print("상영시간: ");
                String runningTimeStr = scan.nextLine();
                if (!runningTimeStr.isEmpty()) {
                    try {
                        runningTime = Integer.parseInt(runningTimeStr);
                        if (runningTime >= 1 && runningTime <= 360) {
                            break;
                        } else {
                            System.out.println("상영시간은 1~360 사이의 값으로 다시 입력해 주세요.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("상영시간은 숫자로 입력해 주세요.");
                    }
                } else {
                    System.out.println("상영시간이 입력되지 않았습니다. 다시 입력해 주세요.");
                }
            }

            float rating;
            while (true) {
                System.out.print("평점: ");
                String ratingStr = scan.nextLine();
                if (!ratingStr.isEmpty()) {
                    try {
                        rating = Integer.parseInt(ratingStr);
                        if (rating >= 0 && rating <= 10) {
                            break;
                        } else {
                            System.out.println("평점은 0~10 사이의 값으로 다시 입력해 주세요.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("평점은 숫자로만 입력해 주세요.");
                    }
                } else {
                    System.out.println("평점이 입력되지 않았습니다. 다시 입력해 주세요.");
                }
            }

            int genre;
            while (true) {
                System.out.print("장르(1: 드라마, 2: 액션, 3: 호러): ");
                String genreStr = scan.nextLine();
                if (!genreStr.isEmpty()) {
                    try {
                        genre = Integer.parseInt(genreStr);
                        if (genre >= 0 && genre <= 10) {
                            break;
                        } else {
                            System.out.println("장르는 1,2,3 중의 값으로 다시 입력해 주세요.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("장르는 숫자로만 입력해 주세요.");
                    }
                } else {
                    System.out.println("장르가 입력되지 않았습니다. 다시 입력해 주세요.");
                }
            }

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
//        System.out.println("검색할 장르를 입력하세요 (1: 드라마, 2: 액션, 3: 호러): ");
//        int genre = scan.nextInt();
//        scan.nextLine();


        int genre;
        while (true) {
            System.out.print("검색할 장르를 입력하세요 (1: 드라마, 2: 액션, 3: 호러): ");
            String genreStr = scan.nextLine();
            if (!genreStr.isEmpty()) {
                try {
                    genre = Integer.parseInt(genreStr);
                    if (genre > 0 && genre < 4) {
                        break;
                    } else {
                        System.out.println("장르는 1,2,3 중의 값으로 다시 입력해 주세요.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("장르은 숫자로 입력해 주세요.");
                }
            } else {
                System.out.println("장르가 입력되지 않았습니다. 다시 입력해 주세요.");
            }
        }

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
            System.out.println("잘못된 장르 번호입니다. (1: 드라마, 2: 액션, 3: 호러) 중에 다시 입력하세요.");
        }
    } // searchMovieByGenre_
}