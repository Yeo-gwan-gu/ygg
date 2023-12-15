package fc.java.Course2.model2;

import java.util.Arrays;

public class IntArray {
    private final int DEFAULT_CARACITY = 5; // final : 상수 (변할 수 없는 값으로 초기화 / 수정 불가)
    private int[] elements; // 배열
    private int size = 0; // 원소 개수

//  생성 동작
    public IntArray() {
        elements = new int[DEFAULT_CARACITY]; // 5개 크기 배열
    }

//  저장 동작
    public void add(int element) {
//      크기를 2배로 늘리는 작업
        if (size == elements.length) {
            ensureCapacity();
        }
//      크기 체크
        elements[size++] = element;
    }

//  크기를 2배로 늘리는 메서드
    public void ensureCapacity() {
        int newCapacity = elements.length * 2;
        Arrays.copyOf(elements, newCapacity); // 복사
    }

//  얻는 동작
    public int get(int index) { // -1 ~ 5
        // index 체크 if
        if (index < 0 || index > 5) {
            throw new IndexOutOfBoundsException("범위초과");
        }
        return elements[index];
    }

//  원소의 개수를 넘겨주는 동작
    public int size() {
        return size;
    }
}
