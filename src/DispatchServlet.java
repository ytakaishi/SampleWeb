import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DispatchServlet extends HttpServlet {
  public void doGet( HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/dispatch.jsp");
      dispatcher.forward(request, response);
  }
}
