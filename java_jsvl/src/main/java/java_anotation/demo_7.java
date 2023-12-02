package java_anotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/demo7"})
public class demo_7 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pr = resp.getWriter();
		pr.println("<h1>Xin chào linh Nguyen</h1>");
		
		resp.addCookie(new Cookie("a","a"));
		resp.addHeader("a", "aaa");
		resp.sendError(200);// nội dụng trả về thành công là 200 ;404 là không tìm thấy 
	}
}
