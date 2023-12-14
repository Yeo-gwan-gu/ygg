package be7.model;
// 규약/규칙 -> 기능정의
public interface SuperRemoCon {
    public int MAX_CH = 100;
    public int MIN_CH = 1;
    public void chUp();
    public void chDown();
    public void volUp();
    public void volDown();
    public void internet(); // TV(인터넷이 됩니다.), Radio(기능이 없습니다.)
}
