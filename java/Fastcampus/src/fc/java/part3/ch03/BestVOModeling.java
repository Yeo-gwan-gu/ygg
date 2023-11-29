package fc.java.part3.ch03;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        // Q. 형태로 잘 설계된 영화(MovieVO) 객체를 설계하고 데이터를 저장한 후 출력하시오.

        MovieVO movie = new MovieVO("아바타",20221214,"제이크설리", "액션",192.0f,12);
        System.out.println(movie.toString());
        System.out.println();
        System.out.println(movie.getTitle());
        System.out.println(movie.getDay());
        System.out.println(movie.getMajor());
        System.out.println(movie.getPart());
        System.out.println(movie.getTime());
        System.out.println(movie.getLevel());
    }
}
