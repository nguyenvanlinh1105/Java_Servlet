package java_anotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/demo10"})
public class demo_10 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pr= resp.getWriter();
//		pr.println("Linh Nguyen");
		String  ten = req.getParameter("ten");// lấy gia trị client trả đây lên server
//		pr.println("xin chao "+ten);
		
		String khoaHoc= req.getParameter("khoaHoc");
		String tuoi = req.getParameter("tuoi");
		pr.println("xin chao "+ten+" Day la khoa hoc "+khoaHoc+"----tuoi cua ban la "+tuoi);
	}
}
