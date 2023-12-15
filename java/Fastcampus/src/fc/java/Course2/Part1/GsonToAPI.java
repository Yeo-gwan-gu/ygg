package fc.java.Course2.Part1;

import com.google.gson.Gson;
import fc.java.Course2.model2.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json); // {"name" : "John", "age" : 30};
    }
}