import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class DAO {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/score?serverTimezone=UTC";
	private static final String USER = "score";
	private static final String PASS = "score";

	public Connection getConn() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		} // try - catch
		return con;
	} // getConn : 연결 메소드 작성

	public int insertScore(scoreDTO dto) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = getConn();
			String sql = "insert into score values(?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setInt(2, dto.getKor());
			ps.setInt(3, dto.getEng());
			ps.setInt(4, dto.getMat());
			ps.setInt(5, dto.getTot());
			ps.setInt(6, dto.getAve());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // ps try - catch
			} // ps if
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // con try - catch
			} // con if
		} // try - catch - finally
		return result;
	} // insertMember : 회원 정보를 저장하는 메소드, 성공 여부를 int형 result 를 반환한다.

	public Vector getScore() {
		Vector data = new Vector();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = getConn();
			String sql = "select * from score order by name asc";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int mat = rs.getInt("mat");
				int tot = rs.getInt("tot");
				int ave = rs.getInt("ave");
				Vector row = new Vector();
				row.add(name);
				row.add(kor);
				row.add(eng);
				row.add(mat);
				row.add(tot);
				row.add(ave);
				data.add(row);
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // rs try - catch
			} // rs if
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // ps try - catch
			} // stmt if
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // con try - catch
			} // con if
		} // try - catch - finally
		return data;
	}
}