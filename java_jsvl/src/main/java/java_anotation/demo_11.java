package java_anotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/demo11"})
public class demo_11 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pr = resp.getWriter();
		String ten =req.getParameter("ten");
		String tuoi =req.getParameter("tuoi");
		String diaChi =req.getParameter("diaChi");
		String ngheNghiep = req.getParameter("ngheNghiep");
		pr.println("ten: "+ten+"tuoi: "+tuoi+"diaChi:"+diaChi);
	}
}
