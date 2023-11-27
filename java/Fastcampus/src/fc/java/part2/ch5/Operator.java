package fc.java.part2.ch5;

public class Operator {
    public static void main(String[] args) {
// Q. 국어(kor) 77점, 영어(eng) 87점을 합한 총점과, 두 과목의 평균을 구하시오

        int kor, eng;
        kor = 77;
        eng = 87;

        int h = (kor+eng);
        int g = ((kor+eng)/2);

        System.out.println("총점 : " + h);
        System.out.println("평균 : " + g);
    }
}
