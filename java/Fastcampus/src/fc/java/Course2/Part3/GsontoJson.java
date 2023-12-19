package fc.java.Course2.Part3;

import com.google.gson.Gson;
import fc.java.Course2.model3.Member;

public class GsontoJson {
    public static void main(String[] args) {
        Member mvo = new Member("홍길동", 30, "bit@empas.com");
//      JSON -> {"name":"홍길동","age":30,"email":"bit@empas.com"}

//      Object(Member) -> JSON
        Gson gson = new Gson();
        String json = gson.toJson(mvo);
        System.out.println("json = " + json); // {"name":"홍길동","age":30,"email":"bit@empas.com"}
    }
}
