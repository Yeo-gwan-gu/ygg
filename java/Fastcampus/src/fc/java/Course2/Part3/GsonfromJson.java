package fc.java.Course2.Part3;

import com.google.gson.Gson;
import fc.java.Course2.model3.Member;

public class GsonfromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"bit@empas.com\"}"; // ""를 문자열로 인식하기 위해서 앞에 \추가해줘야함

//      Json -> Object(Member)
        Gson gson = new Gson();
        Member mvo = gson.fromJson(json, Member.class);
        System.out.println("mvo = " + mvo);
    }
}
