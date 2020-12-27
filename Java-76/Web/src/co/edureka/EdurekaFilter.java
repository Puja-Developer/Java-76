package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/welcome")
//@WebFilter("/*")
public class EdurekaFilter implements Filter {
	
	public void init(FilterConfig fConfig) throws ServletException {}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		/*
		String uid = request.getParameter("txtUid");
		String pwd = request.getParameter("txtPwd");
		
		if(uid.equals("admin") && pwd.equals("123"))
			chain.doFilter(request, response);
		else {
			PrintWriter out = response.getWriter();
			out.println("<p style=color:red;text-align:center;font-size:20px>Invalid Username/ Password</p>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);			
		}
		*/
		PrintWriter out = response.getWriter();
		out.println("<p style=text-align:center;font-size:40px;margin:100px>Site Under Maintenance!!<br>We will be back @ 01.00AM<br>Sorry for the inconvenience caused!!</p>");
	}
	
	public void destroy() {	}
}
