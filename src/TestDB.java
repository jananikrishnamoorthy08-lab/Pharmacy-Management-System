import dao.ConnectionProvider;
import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        Connection con = ConnectionProvider.getcon();
        if (con != null) {
            System.out.println(" Connected successfully to MySQL!");
        } else {
            System.out.println(" Connection failed!");
        }
    }
}
