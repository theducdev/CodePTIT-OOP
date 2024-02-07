import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {

    public static void main(String[] args) throws ClassNotFoundException {
//        String url = "jdbc:mysql://127.0.0.1:3306/sv";
//        String user = "root";
//        String password = "123456789";
//
//        Connection connection = null;
//
//        try {
//            connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Kết nối đến MySQL thành công!");
//        } catch (SQLException e) {
//            System.out.println("Lỗi kết nối đến MySQL: " + e.getMessage());
//        } finally {
//            // Đóng kết nối trong phần finally để đảm bảo luôn được đóng dù có lỗi xảy ra hay không.
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        System.out.println("HELLo");
    }
}
