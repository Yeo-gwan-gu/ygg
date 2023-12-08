package be7.model;
// 책(Object) --> 상태정보(멤버변수) / 제목, 가격, 저자, 페이지수 ... = 속성, 멤버변수, 상태정보
public class BookDTO { // DTO --> 어떻게 설계하는 것이 잘 설계하는 것인가?
    // 1. 모든 멤버를 정보은닉 시킨다. (private)
    // 데이터를 넣고 빼야하니 접근제한자를 넣어줘야함 --> 단, 상태정보는 중요하기에 정보은닉이 필요 (private) **중요**
    private String title;
    private int price;
    private String name;
    private int page;

    // 2. 생략된 메서드(디폴트 생성자 메서드)를 명시적으로 만든다.
    // 객체를 생성해준다 (내부적으로 이루어진다.)
    public BookDTO() {
//        this.title="자바";
//        this.price=30000;
//        this.name="김길동";
//        this.page=500;
    }

    public BookDTO(String title, int price, String name, int page) {
        this.title=title;
        this.price=price;
        this.name=name;
        this.page=page;
    }

    // 3. setter method(데이터 넣기) / getter method(값 얻어오기) 만들기
    // setter, getter 를 자동으로 만드는 방법
    // 마우스 우클릭 -> 생성(Generate) -> getter and setter -> 필요한 파일 전체 선택 -> OK
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) { // DI (의존성 주입)
        this.title = title;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", page=" + page +
                '}';
    }
}
