import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DbAccessSample2 extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    doPost(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      String url = "jdbc:mysql://localhost/test";
      Connection con = DriverManager.getConnection(url, "root", "");
      request.setAttribute("message", "DB Access OK!");
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    RequestDispatcher rd = request.getRequestDispatcher("/jsp/disp.jsp");
    rd.forward(request, response);
  }
}
