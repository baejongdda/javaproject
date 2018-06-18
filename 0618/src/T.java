import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class T {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost/test?serverTimezone=UTC";
		String id = "root";
		String password = "1234";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}
		return con;
	}

	public static void main(String arg[]) throws SQLException {
		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM tests");
		while (rs.next()) {
			int id = rs.getInt("test_id");
			String title = rs.getString("title");
			System.out.println(id + " " + title);
		}
	}
}