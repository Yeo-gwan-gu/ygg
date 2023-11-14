public class MemberTest {
    public static void main(String[] args) {
        // Q. 명시된 한명의 헬스클럽 회원 데이터를 저장하고 출력하시오.
        // 이름 : 홍길동
        // 나이 : 30
        // 전화번호 : 010-1111-1111
        // 이메일 : fc@naver.com
        // 거주지 : 서울
        // 몸무게 : 57.6kg

        Member m = new Member();
        m.name = "홍길동";
        m.age = 30;
        m.tel = "010-1111-1111";
        m.email = "fc@naver.com";
        m.addr = "서울";
        m.weight = 57.6f;
        System.out.println(m.name+"\t"+m.age+"\t"+m.tel+"\t"+m.email+"\t"+m.addr+"\t"+ m.weight);

    }
}
