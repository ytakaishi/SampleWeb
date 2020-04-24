import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginUserServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)
			throws ServletException, IOException {
		doPost(req,res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		// 文字コードの設定
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset= UTF-8");

		// login.jspへ画面遷移する
		RequestDispatcher rd = req.getRequestDispatcher("/jsp/login.jsp");
		rd.forward(req, res);
	}
}
