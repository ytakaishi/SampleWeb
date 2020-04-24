import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DispatchServlet2 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		String data = new String("TEST DATA");
		request.setAttribute("data",data);
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/jsp/dispatch2.jsp");
		dispatcher.forward(request, response);
	}
}