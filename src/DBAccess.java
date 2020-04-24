import java.sql.*;

public class DBAccess {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/test?useUnicode=true&characterEncoding=utf8";
	private static final String DB_USER = "root";
	private static final String DB_PWD = "";

	private Connection connection = null;

	public Connection getConnection(){
		return this.connection;
	}
	public void connect(){
		try{
		  Class.forName(DB_DRIVER);
			this.connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PWD);
		}catch(ClassNotFoundException e){
		  e.printStackTrace();
		}catch(SQLException e){
		  e.printStackTrace();
		}
	}

	public void disconnect(){
		try{
		  if(this.connection != null) {
			this.connection.close();
		  }
		}catch(SQLException e){
		  e.printStackTrace();
		}finally{
		  this.connection = null;
		}
	}
}
