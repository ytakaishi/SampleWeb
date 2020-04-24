import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginUserServletConf extends HttpServlet {
	public void doGet(HttpServletRequest req,	HttpServletResponse res)
			throws ServletException, IOException {
		doPost(req,res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		// 文字コードの設定
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");

		// リスエストからIDとPASSを取得する
		int id = Integer.parseInt((String)req.getParameter("id"));
		String pw = req.getParameter("pass");

		// DAOをインスタンス化する
		UserDao dao = new UserDao();

		// //リクエストにDAOで取得したユーザ名称をセットする
		req.setAttribute("login_name", dao.getName(id,pw));

		RequestDispatcher rd = req.getRequestDispatcher("/jsp/loginConf.jsp");
		rd.forward(req, res);
	}
}
