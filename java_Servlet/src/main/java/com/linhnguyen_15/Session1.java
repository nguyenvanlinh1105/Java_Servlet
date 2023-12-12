package com.linhnguyen_15;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/session1"})
public class Session1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession =req.getSession();// hàm này sẽ tạo mới một session hoặc là đọc lại một session nếu trên server đã có một session 
		resp.setContentType("text/html");
		httpSession.setAttribute("name", "linhnguyen");
		httpSession.setAttribute("age",new Integer( 30));
		PrintWriter pr  = resp.getWriter();
		
		pr.println("Xin chao trung tam java - session");
	}

}
