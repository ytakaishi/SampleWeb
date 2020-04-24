import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao extends DBAccess{

	public String getName(int id,String pass){

		//SQL文を作成する
		String sql = "select name from id_tbl where id = ? and password = ?";

		//変数の宣言と初期化を行う
		String name = null;
		ResultSet rs = null;

		try {

			//Connectionオブジェクトを取得する
			connect();
			//ステートメントを作成する
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setInt(1,id);
			ps.setString(2,pass);
			rs = ps.executeQuery();
			//SQLを発行し、ユーザ名称を変数へ設定する
			while(rs.next()){
				name=rs.getString("name");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		//ユーザ名称を返す
		return name;
	}
}
