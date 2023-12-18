package fc.java.Course2.Part2;

public class ObjectArr<T> {
    private T[] array;
    private int size;

    public ObjectArr(int size) {
//      제네릭 배열을 생성하는 배열을 생성한 후 형변환을 해야 한다.
        array = (T[])new Object[size];
    } // ObjectArray_
    public void set(int index, T value) {
        array[index] = value;
        size++;
    } // set_
    public T get(int index) {
        return array[index];
    } // T get_
    public int size() {
        return size;
    } // size_

}
