package com.linhnguyen_15;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/session2"})
public class Session2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pr = resp.getWriter();
		String name ="";
		
		HttpSession httpSession = req.getSession();
		
		// ham getAttribute se tra ve mot obj nen chung ta phai khai bao 
		Object obj = httpSession.getAttribute("name");
		if(obj!=null) {
			name = String.valueOf(obj);
		}else {
			resp.sendRedirect("/java_Servlet/session1");
		}
		//int age = Integer.valueOf((String) httpSession.getAttribute("age"));
		int age = (int) httpSession.getAttribute("age");
		pr.println("xin chao: "+name+"<br/>");
		pr.println("Ho ten cua ban la: "+name+ " va tuoi la: "+age);
		}
}
