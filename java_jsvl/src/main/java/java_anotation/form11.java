package java_anotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/html11")
public class form11 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pr = resp.getWriter();
		pr.println("<form action='/java_jsvl/demo11' method='post'>");
		pr.println("ten: <input type = 'text' name ='ten'>");
		pr.println("tuoi: <input type = 'text' name ='tuoi'>");
		pr.println("diaChi: <input type = 'text' name ='diaChi'>");
		pr.println("ngheNghiep: <input type='text' name='ngheNghiep'>");
		pr.println("<input type='submit' value='submit'>");
	}
}
