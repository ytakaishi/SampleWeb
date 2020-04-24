import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DbAccessSample3 extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    doPost(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      String url = "jdbc:mysql://localhost/test";
      Connection con = DriverManager. getConnection (url, "root", "");

      String sql = "select age from id_tbl where id = 123456";
      int name = 0;
      PreparedStatement ps = con.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      while(rs.next()){
        name = rs.getInt("age");
      }
      request.setAttribute("message", "ID=123456の氏名は「"+name+"」です");
      con.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

    RequestDispatcher rd = request.getRequestDispatcher("/jsp/disp.jsp");
    rd.forward(request, response);
  }
}