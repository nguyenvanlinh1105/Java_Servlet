package java_Servlet_12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns= {"/demo12"})
public class demo_12 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pr = resp.getWriter();
		pr.println("xin chao linh nguyen");
		
		// tạo cookie/ javax.http < truyền vào key và value>
		Cookie cookie = new Cookie("name","linhnguyen");
		// set thời gian song cho cookie như sau sử dụng setMaxAge và truyền vào thời gian sống, được tính bằng s
		cookie.setMaxAge(5);
		resp.addCookie(cookie);
		Cookie cookie1 = new Cookie("age","30");
		cookie1.setMaxAge(10);
		resp.addCookie(cookie1);
		}
}
