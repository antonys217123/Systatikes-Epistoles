package gr.hua.SystatikesEpistoles;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/systatikesepistoles?useSSL=false";
        String user = "root";
        String pass = "pass123";

        try {
            System.out.println("Connecting to database: " + jdbcUrl);
            Connection con = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection success");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
