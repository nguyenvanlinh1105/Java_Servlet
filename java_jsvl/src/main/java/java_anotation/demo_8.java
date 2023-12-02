package java_anotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/demo8"},initParams = {
		@WebInitParam(name="name",value="linhnguyen")
} )
public class demo_8 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = super.getServletConfig().getInitParameter("name");
		// name được get ra ở trên chính là name khi ta cấu hình Anotation 
		
		resp.setContentType("text/html");
		PrintWriter pr = resp.getWriter();
		pr.println("Xin chao :"+name);
		pr.println(getServletConfig().getServletName());
	}
}
