//public String title;
//public String day;
//public String hero;
//public String genre;
//public int time;
//public int age;
// 제목 : 아바타
// 개봉일 : 2022.12.14
// 주인공 : 제이크 설리
// 장르 : 액션
// 러닝타임 : 192
// 등급 : 12세

package fc.java.part2.ch6;

public class ObjectArrayExam {
    public static void main(String[] args) {
        // Q. 영화 3편을 저장할 배열을 생성하고 영화 3편의 데이터를 저장하고 출력하시오.
        Movie[] m = new Movie[3];
        m[0] = new Movie();
        m[0].title = "아바타";
        m[0].day = "2022.12.14";
        m[0].hero = "제이크 설리";
        m[0].genre = "액션";
        m[0].age = 12;

        m[1] = new Movie();
        m[1].title = "아이언맨";
        m[1].day = "2008.04.30";
        m[1].hero = "로버트 다우니 주니어";
        m[1].genre = "SF/액션";
        m[1].age = 12;

        m[2] = new Movie();
        m[2].title = "스파이더맨";
        m[2].day = "2021.12.15";
        m[2].hero = "톰 홀랜드";
        m[2].genre = "SF/액션";
        m[2].age = 12;

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].title+"\t"+m[i].day+"\t"+m[i].hero+"\t"+m[i].genre+"\t"+m[i].age);
        }

    }
}
