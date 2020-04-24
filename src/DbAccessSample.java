import java.sql.*;

public class DbAccessSample{

  public static void main(String args[]) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      String url = "jdbc:mysql://localhost/test?useUnicode=true&characterEncoding=utf8";
      Connection con = DriverManager.getConnection(url, "root", "");
      System.out.println("接続しました");
      con.close();
    }catch (Exception e) {
      e.printStackTrace();
    }
  }
}
