package java_Servlet_12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns= {"/demo12_1"})
public class demo_12_1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pr = resp.getWriter();
		
		// get cookie từ demo_12
		Cookie[] cookies= req.getCookies();
		for(Cookie c :cookies ) {
			pr.println(c.getName()+": "+c.getValue()+"<br/>");
			
			// cách xóa cookie  như sau 
			if(c.getName().equals("age")) {
				c.setMaxAge(0);
			}
		}
		
		
	}
}
