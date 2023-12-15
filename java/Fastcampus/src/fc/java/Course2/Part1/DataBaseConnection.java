package fc.java.Course2.Part1;

import fc.java.Course2.model2.*;

public class DataBaseConnection {
    public static void main(String[] args) {
        // oracle DB 접속
        Connection conn = new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "username1", "12345");

        // MySQL DB 접속
        conn = new MySQLDriver();
        conn.getConnection("jdbc:mysql://localhost:3306/test", "username2", "12345");

        // MSSQL DB 접속
        conn = new MSSQL();
        conn.getConnection("jdbc:sqlserver://localhost:1433,DatabaseName=mem", "username3", "12345");
    }
}
