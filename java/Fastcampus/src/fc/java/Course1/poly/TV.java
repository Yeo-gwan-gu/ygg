package fc.java.Course1.poly;

public class TV implements RemoCon{
    // chUp(), chDown(), volUp(), volDown()

    private int currch = 10;

    @Override
    public void chUp() {
        currch++;
        if(currch>RemoCon.MAXCH) {
            currch=1;
        }
        System.out.println("TV의 채널이 올라간다.");
    }

    @Override
    public void chDown() {
        currch--;
        if(currch<RemoCon.MINCH) {
            currch=99;
        }
        System.out.println("TV의 채널이 내려간다.");
    }

    @Override
    public void volUp() {
        System.out.println("TV의 볼륨이 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("TV의 볼륨이 내려간다.");
    }
    @Override
    public void internet() {
        System.out.println("TV에서는 인터넷이 동작됩니다.");
    }
}
