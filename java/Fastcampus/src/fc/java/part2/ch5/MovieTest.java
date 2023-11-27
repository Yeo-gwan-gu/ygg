package fc.java.part2.ch5;

public class MovieTest {
    public static void main(String[] args) {
        // Q. 아래 예시에 제시된 한편의 영화 데이터를 저장하고 출력 하시오.
        // 제목 : 아바타
        // 개봉일 : 2022.12.14
        // 주인공 : 제이크 설리
        // 장르 : 액션
        // 러닝타임 : 192
        // 등급 : 12세

        Movie m = new Movie();
        m.title = "아바타";
        m.day = "2022.12.14";
        m.hero = "제이크 설리";
        m.genre = "액션";
        m.time = 192;
        m.age = 12;
        System.out.println(m.time+"\t"+m.day+"\t"+m.hero+"\t"+m.genre+"\t"+m.time+"\t"+m.age);
    }
}
