import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InputServlet extends HttpServlet{
  public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
    req.setCharacterEncoding("UTF-8");
    res.setContentType("text/html;charset=UTF-8");

    String name = req.getParameter("name");
    String age = req.getParameter("age");
    String koibito = req.getParameter("koibito");
    String hobby[];
    if(req.getParameterValues("hobby") != null){
      hobby = req.getParameterValues("hobby");
    } else {
      hobby = new String[1];
      hobby[0] = "無趣味";
    }
    PrintWriter pw = res.getWriter();
    pw.println("<html><head><title>自己紹介ページ表示"
     + "</title></head><body>");

    pw.println("<p style=\"font-size:18px;color:red;\">プロフィール"
     + "</p>");

    if(name.length() > 0){
      pw.println("氏名は" + name + "です<BR>");
    } else {
      pw.println("氏名は空白です<BR>");
    }
    pw.println("年齢は" + age + "です<BR>");

    if (koibito.equals("0")){
      pw.println("恋人はいません<BR>");
    } else {
      pw.println("恋人はいます<BR>");
    }
    pw.println("趣味は");
    int cnt = 0;
    for(int i = 0; i < hobby.length; i++){
      if(hobby[i] != null){
        if(cnt >= 1){
          pw.println("と");
        }
        pw.println(hobby[i]);
        cnt++;
      }
    }
    pw.println("です");
    pw.println("<br><br><a href=\"/SampleWeb/html/profile.html\">");
    pw.println("戻る</a> ");
    pw.println("</body></html>");
  }
}
