package fc.java.Course2.Part3;

import com.google.gson.Gson;
import fc.java.Course2.model3.Person;

public class GsonMemberAddfromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"bit@empas.com\",\"address\":{\"city\":\"서울\",\"country\":\"대한민국\"}}";
        
        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);
        System.out.println("person = " + person);
    }
}
