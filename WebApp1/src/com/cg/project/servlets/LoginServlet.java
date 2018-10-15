package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String associateId= request.getParameter("associateId");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor='Black'><div align='center'>");
		
		if(associateId.equals("12345")&&password.equals("sasasa"))
			out.print("<font color='green'> Welcome Associate" +associateId+"</font>");
		else
			out.print("<font color='red'>AssociateId or password is Wrong</font>");
		out.println("</div></body></html>");
	}

}
