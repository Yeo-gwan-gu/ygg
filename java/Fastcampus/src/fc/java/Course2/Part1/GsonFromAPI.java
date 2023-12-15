package fc.java.Course2.Part1;

import com.google.gson.Gson;
import fc.java.Course2.model2.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\" : \"John\", \"age\" : 30}"; // \넣어야 에러나지 않음(내부 "") --> JSON -> Person
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);
        System.out.println(p.getName()); // John
        System.out.println(p.getAge()); // 30
        System.out.println(p.toString()); // Person{name='John', age=30}
    }
}
