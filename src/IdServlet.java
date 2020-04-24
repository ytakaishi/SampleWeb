import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class IdServlet extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse response)
        	throws ServletException, IOException {
			doPost( request, response );
		}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

		//文字コードの設定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset= UTF-8");

		SampleDao dao = new SampleDao();
		//Daoのメソッドを呼び出し戻り値をセット
		request.setAttribute("name",dao.getName());

		RequestDispatcher rd = request.getRequestDispatcher("/jsp/id.jsp");
		rd.forward(request, response);
    	}
}
