package fc.java.Course2.model2;

public class MySQLDriver implements Connection{

    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용하여 MySQL DB를 접속을 시도한다.");
    }
}
