import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletWorld extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res)

			throws ServletException, IOException{

			PrintWriter pw = res.getWriter();
			pw.println("<html><head><title>Hello Servlet World</title></head>");
			pw.println("<body>");
			pw.println("<H1>Hello Servlet World!!</H1>");
			pw.println("</body></html>");
			pw.close();
    }
}
