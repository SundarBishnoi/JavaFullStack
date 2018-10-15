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
 * Servlet implementation class SignupServlet
 */
@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
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
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String department = request.getParameter("department");
		String designation = request.getParameter("designation");
		String date = request.getParameter("date");
		String password= request.getParameter("password");
		String email = request.getParameter("email");
		String[] degrees= request.getParameterValues("degrees");

		PrintWriter out = response.getWriter();
		out.println("<html><body color:'yellow'><div align='center'>");
		out.print("<font color='green'> Welcome Associate  " +firstName+"!!</font>");
		out.println("<br>FirstName "+firstName+"<br>");
		out.println("<br>LastName "+lastName+"<br>");
		out.println("<br>Department "+department+"<br>");
		out.println("<br>DateOfBirth "+date+"<br>");
		out.println("<br>Email-ID "+email+"<br>");
		out.println("<br>Password "+password+"<br>");
		for(String str:degrees)
			out.println("<table><tr><th>Degrees:</th><td>"+str+"</td></tr></table>");
		
		out.println("</div></body></html>");
	}
}
