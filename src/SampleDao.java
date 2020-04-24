import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleDao extends DBAccess {

	public String getName(){

		String sql = "select name from id_tbl where id = ?";

		String name=null;
		ResultSet rs = null;
		try {
		  connect();
		  PreparedStatement ps = getConnection().prepareStatement(sql);
		  ps.setString(1, "123456");
		  rs = ps.executeQuery();
		  while(rs.next()){
			name = rs.getString("name");
		  }
		} catch (SQLException e) {
		  e.printStackTrace();
		} finally {
		  disconnect();
		}
		return name;
	}
}
