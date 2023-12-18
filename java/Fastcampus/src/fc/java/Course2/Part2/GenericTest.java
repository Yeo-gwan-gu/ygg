package fc.java.Course2.Part2;

import fc.java.Course2.model2.*;

public class GenericTest {
    public static void main(String[] args) {
        /*
        ObjectArr<String> array = new ObjectArr<>(5);
        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "Java");
        array.set(3, "Generic");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        */

        ObjectArr<Movie> bList = new ObjectArr<Movie>(5);
        bList.set(0, new Movie("괴물", "봉준호", "2006", "한국"));
    }
}
