package com.coforge.training.shopstop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				//set the content type of Web Page
				response.setContentType("text/html");
				
				//write the message on the web page
				PrintWriter out=response.getWriter();
				
				Date d1=new Date();
				
				String user=request.getParameter("userName");
				String pass=request.getParameter("userPassword");
				
				if(user.equals("prateek") && pass.equals("1234"))
						{
							out.println("<h1>Login Successful-Shop Stop</h1>");
							out.println("Login time : "+d1);
							out.println("<h3> Enjoy Shopping....!!</h3>");
						}
				else
				{
					out.println("<h3>Login Failed!!</h3>");
				}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
