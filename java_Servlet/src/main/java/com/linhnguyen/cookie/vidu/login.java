package com.linhnguyen.cookie.vidu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/demo13"})
public class login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pr = resp.getWriter();
		pr.println("<form action='/java_Servlet/demo13' method='post'>");
		pr.println("username: <input type='text' name='username'>");
		pr.println("password: <input type='password' name='password'>");
		pr.println("<input type ='submit' value'login'>");
		pr.println("</form>");
		
		pr.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("linhnguyen")&&password.equals("123456")) {
			Cookie cookie = new Cookie("username",username);
			cookie.setMaxAge(60);
			resp.addCookie(cookie);
			resp.sendRedirect("/java_Servlet/welcome");
		}else {
			resp.sendRedirect("/java_Servlet/demo13");
		}
		
	}
}
