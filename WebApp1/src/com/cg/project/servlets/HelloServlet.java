package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HelloServlet() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	public void destroy() {
		
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><body bgcolor='#E6E6FA'>");
		out.println("<div><font color=red size=8>hello World from Hello Servlet</font></div>");
		out.print("</body></html>");
	}

	
/*	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("<div><font color=red size=8>hello World from Hello Servlet</font></div>");
		out.print("</body></html>");
		
	}
*/
	
}
