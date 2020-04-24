import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet{
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
    PrintWriter pw = res.getWriter();
    pw.println("<html><head><title>Hello Servlet</title></head>");
    pw.println("<body>");
    pw.println("<h1>Hello World!!</h1>");
    pw.println("</body></html>");
    pw.close();
  }
}
