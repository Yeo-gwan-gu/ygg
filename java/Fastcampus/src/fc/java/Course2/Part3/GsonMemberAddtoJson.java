package fc.java.Course2.Part3;

import com.google.gson.Gson;
import fc.java.Course2.model3.*;

public class GsonMemberAddtoJson {
    public static void main(String[] args) {
        Address address = new Address("서울","대한민국");
        Person person = new Person("홍길동", 30, "bit@empas.com", address);
        
//      Person -> JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("json = " + json);
    }
}
