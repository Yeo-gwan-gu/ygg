package fc.java.Course1.poly;

public class Board {
    private String title;

//    public Board(String title) {
//        this.title = title;
//    }

    @Override
    public String toString() {
        System.out.println(super.toString()); // 상위클래스의 메서드 호출
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
