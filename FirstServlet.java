package org.loan.servlets;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		  response.setContentType("text/html");  
		  PrintWriter out = response.getWriter();  
		 // String un = request.getParameter("user");
		  String p=request.getParameter("userpass"); 
		 // Cookie ck = new Cookie("auth", un);
		  //ck.setMaxAge(600);
		          
		    if( p.equals("mrkmarkrd")){  
		        //RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
		        //rd.forward(request,response); 
		    	//response.addCookie(ck);
		    	response.sendRedirect("member.jsp");
		    }  
		    else{  
		    	//out.println("Either user name or password is wrong.");
		       // RequestDispatcher rd=request.getRequestDispatcher("index.html");  
		       // rd.include(request,response);
		        response.sendRedirect("error.jsp");
		    	
		    	
		    	
		    }  
		          
		    out.close();  
		    }  
	 
	}


