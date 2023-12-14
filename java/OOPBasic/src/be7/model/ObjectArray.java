package be7.model;

public class ObjectArray<T> { // ArrayList API
    private Object[] arr;
    private int cnt; // 원소의 개수

    public ObjectArray() {
//        arr = new int[10]; // new IntArray(); --> 미입력 시 기본 size 10
        this(10); // 자기 자신 안에 있는 또 다른 생성자를 호출(call)
    } // 기본 size_

    public ObjectArray(int initial) { // new IntArray();
        arr = new Object[initial];
    } // initial_

    // 배열에 데이터를 저장하는 동작 --> (add) -setter
    public void add(T data) { // arr.add(10);
        arr[cnt++] = data;
    } // add_

    // 배열에서 원하는 index 위치의 데이터를 넘겨주는 동작 --> get(위치)
    public T get(int index) { // index >= 0
        return (T)arr[index];
    } // get_

    // 배열에 저장된 원소의 개수를 넘겨주는 동작 --> size()
    public int size() {
        return this.cnt;
    } // size_

}
