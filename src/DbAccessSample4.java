import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DbAccessSample4 extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    doPost(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      String url = "jdbc:mysql://localhost/test?useUnicode=true&"
      		+ "characterEncoding=utf8";
      Connection con = DriverManager. getConnection (url, "root", "");

      String sql = "insert into id_tbl values(?, ?, ?, ?)";
      int id[] = {456789, 567890, 678901};
      String password[] = {"pass4", "pass5", "pass6"};
      String name[] = {"原田　次郎", "本田　四郎", "齋藤　六郎"};
      int age[] = {31, 32, 33};
      PreparedStatement ps = con.prepareStatement(sql);

      for (int i = 0; i < id.length; i++){
        ps.setInt(1, id[i]);
        ps.setString(2, password[i]);
        ps.setString(3, name[i]);
        ps.setInt(4, age[i]);
        ps.executeUpdate();
      }
      request.setAttribute("message", "3件追加しました");
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    RequestDispatcher rd = request.getRequestDispatcher("/jsp/disp.jsp");
    rd.forward(request, response);
  }
}
