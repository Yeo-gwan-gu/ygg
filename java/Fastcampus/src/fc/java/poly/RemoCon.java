package fc.java.poly;

public abstract class RemoCon {
    // chUp(), chDown(), volUp(), volDown()
    public abstract void chUp();
    public abstract void chDown();
    public abstract void volUp();
    public abstract void volDown();

    public void internet() {
        System.out.println("인터넷이 구동된다.");
    }
}
