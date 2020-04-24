import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KukuServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

		PrintWriter pw = res.getWriter();

		pw.println("<html><head><title>kuku</title></head>");
		pw.println("<body>");

		for(int i=1; i<=9; i++){
			for(int j=1; j<=9; j++){
				int ans = i*j;
				pw.println(i + " * " + j + " = " + ans + "<br>");
			}
		}

		pw.println("</body></html>");
		pw.close();
	}
}
