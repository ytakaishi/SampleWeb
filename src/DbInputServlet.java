import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DbInputServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/jsp/input.jsp");
		rd.forward(request, response);

		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 文字コードの設定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset= UTF-8");

		HttpSession session = request.getSession(true);
		//JSP側で確認ボタンが押されたら・・・
		if (request.getParameter("submit").equals("確認")) {

			int id = Integer.parseInt((String)request.getParameter("id"));
			String name = request.getParameter("name");
			int age = Integer.parseInt((String)request.getParameter("age"));
			//JSPへ推移した際に、画面を指定する為にtop1をセットする
			request.setAttribute("top1", "確認画面へ");
			session.setAttribute("id", id);
			session.setAttribute("name", name);
			session.setAttribute("age", age);
		}
		//JSP側で登録ボタンが押されたら・・・
		if (request.getParameter("submit").equals("登録")) {

//JSPへ推移した際に、画面を指定する為にtop2をセットする
			request.setAttribute("top2", "登録画面へ");
			int id = (Integer) session.getAttribute("id");
			String name = (String) session.getAttribute("name");
			int age = (Integer) session.getAttribute("age");

			UserDao2 dao = new UserDao2();
			//Daoの登録メソッドを使用し、DBへ登録する
			dao.input(id, name, age);
		}

		RequestDispatcher rd = request.getRequestDispatcher("/jsp/input.jsp");
		rd.forward(request, response);

	}

}
