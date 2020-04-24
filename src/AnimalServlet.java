import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;

public class AnimalServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{

		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset= UTF-8");

		//リクエストから値を取得
		String animal = req.getParameter("animal");

		//セッションの取得
		HttpSession session = req.getSession(true);

		//セッションからオブジェクト取得
		ArrayList<String>list= (ArrayList<String>)session.getAttribute("animallist");

		//リストに値が入っていない場合、リストを初期化
		if (list == null){
			list = new ArrayList<String>();
		}

		//リストにリクエストの値を設定
		list.add(animal);

		//セッションにリストを設定
		session.setAttribute("animallist", list);

		PrintWriter pw = res.getWriter();
		pw.println("<html><head><title>");
		pw.println("SessionSample");
		pw.println("</title></head>");
		pw.println("<body bgcolor=\"#FFFFFF\" text=\"#000000\">");
		pw.println("<p style=\"font-size:18px;color:red;\">" + "今まで選択した動物</p>");

		//リストの値を1件づつ出力
		for (int i = 0; i < list.size(); i++){
			pw.println(list.get(i) +"<br>");
		}

		pw.println("<br><br><a href=\"/SampleWeb/html/animal.html\">");
       	        pw.println("戻る</a> ");
		pw.println("</body></html>");
	}
}