package be7.model;
// 자식
// 자식 지정 : 클래스명 뒤에 부모의 인터페이스를 넣어준다. --> class 자식클래스명 implements 부모 인터페이스명
// 부모가 정의한 추상메서드는 자식클래스에서 한개도 빠짐없이 구현되어야 한다.
// 객체지향(oop)의 주요특성 : 정보은닉, 상속, 다형성*
public class IntArray implements Remocon{
    private int[] arr;
    private int cnt; // 원소의 개수

    public IntArray() {
//        arr = new int[10]; // new IntArray(); --> 미입력 시 기본 size 10
        this(10); // 자기 자신 안에 있는 또 다른 생성자를 호출(call)
    } // 기본 size_

    public IntArray(int initial) { // new IntArray();
        arr = new int [initial];
    } // initial_

    // 배열에 데이터를 저장하는 동작 --> (add) -setter
    public void add(int data) { // arr.add(10);
        arr[cnt++] = data;
    } // add_

    // 배열에서 원하는 index 위치의 데이터를 넘겨주는 동작 --> get(위치)
    public int get(int index) { // index >= 0
        return arr[index];
    } // get_

    // 배열에 저장된 원소의 개수를 넘겨주는 동작 --> size()
    public int size() {
        return this.cnt;
    } // size_

}
