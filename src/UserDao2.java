import java.sql.*;

public class UserDao2 extends DBAccess {

	public void input(int id, String name, int age) {

		String sql = "insert into id_tbl(id,password,name,age) values (?,?,?,?)";

		try {
			connect();
			// ステートメントの作成
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, "pass");
			ps.setString(3, name);
			ps.setInt(4, age);
			// SQLの実行
			// 結果の取得
			int rs = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}
}
