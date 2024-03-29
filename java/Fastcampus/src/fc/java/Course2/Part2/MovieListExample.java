package fc.java.Course2.Part2;

import fc.java.Course2.model2.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>(); // Movie[]
        list.add(new Movie("괴물", "봉준호", "2006", "한국"));
        list.add(new Movie("기생충", "봉준호", "2019", "한국"));
        list.add(new Movie("완벽한타인", "이재규", "2018", "한국"));

        for (Movie str : list) {
            System.out.println(str);
        }

        System.out.println("+----------------+------+------+---------+");
        System.out.println("|영화제목         |감독         |개봉년도|국가     |");
        System.out.println("+----------------+------+------+---------+");
        for(Movie m : list) {
            System.out.printf("|%-16s|%-8s|%4s|%-6s|\n", m.getTitle(),m.getDirector(),m.getYear(),m.getCountry());
        }
        System.out.println("+----------------+------+------+---------+");

//      순차검색->이진검색(*)
        String searchTitle = "기생충";
        for (Movie m : list) {
            if (m.getTitle().equals(searchTitle)) {
                System.out.println("제목 : " + m.getTitle());
                System.out.println("감독 : " + m.getDirector());
                System.out.println("개봉년도 : " + m.getYear());
                System.out.println("국가 : " + m.getCountry());
            }
        }
    }
}
