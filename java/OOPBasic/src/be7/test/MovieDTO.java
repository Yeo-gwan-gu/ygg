package be7.test;

public class MovieDTO {
    private String title; // 제목
    private String major; // 주인공
    private int runningTime; // 상영시간
    private float rating; // 평점
    private int genre; // 장르

    public MovieDTO() {

    }

    public MovieDTO(String title, String major, int runningTime, float rating, int genre) {
        this.title = title;
        this.major = major;
        this.runningTime = runningTime;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return
                "영화: " + title + "\t" +
                        "주인공: " + major + "\t" +
                        "러닝타임: " + runningTime + "\t" +
                        "평점: " + rating + "\t" +
                        "장르: " + genre
                ;
    }
}
