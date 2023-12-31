package java_anotation;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/demo5"})
public class demo_5 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getContentType());
		System.out.println("Method is: "+req.getMethod());
		req.getContextPath();
		
		// Header trả về theo dạng key và value / không dùng được set , map chỉ dùng dược Enumeration 
		Enumeration <String > keys = req.getHeaderNames();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key + ": "+req.getHeader(key));
		}
	}
}
