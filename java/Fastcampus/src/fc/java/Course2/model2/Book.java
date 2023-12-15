package fc.java.Course2.model2;

public class Book {
//  잘 설계된 VO, DTO

//  멤버변수, 상태정보, 속성(property)
    private String title; // 제목
    private int price; // 가격
    private String company; // 출판사
    private String author; // 저자

//  디폴트 생성자
    public Book() {
    }

//  생성자 메서드의 중복 정의(OverLoading)
    public Book(String title, int price, String company, String author) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.author = author;
    }

//  getter, setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//  Object -> toSting() 재정의(Override)
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
