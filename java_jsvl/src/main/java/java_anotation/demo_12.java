package java_anotation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/demo12"})
public class demo_12 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.sendRedirect("https://google.com/");
		// chuyển hướng trang , ở trên là cách 1:
		// cách 2: 
		
		resp.setStatus(resp.SC_MOVED_PERMANENTLY);// chuyển hướng trang mãi mãi 
		resp.setHeader("Location", "https://google.com/");
		
	}
}
