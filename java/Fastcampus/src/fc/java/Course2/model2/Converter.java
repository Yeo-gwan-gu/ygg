package fc.java.Course2.model2;

@FunctionalInterface
public interface Converter<F,T> {
    T converter(F from);
}
