package assistedPractice8.org.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet8")
public class LoginServlet8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	                // TODO Auto-generated method stub
	                 PrintWriter out = response.getWriter();
	                 out.println("<html><body>");
	                    
	                 String userId = request.getParameter("userid");
	                 //creating a new hidden form field
	                out.println("<form action='dashboard' method='post'>");
	                out.println("<input type='hidden' name='userid' id='userid' value='"+userId+"'>");
	                out.println("<input type='submit' value='submit' >");
	                out.println("</form>");
	                out.println("<script>document.forms[0].submit();</script>");
	              
	                
	        }

	        /**
	         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	         */
	        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	                // TODO Auto-generated method stub
	                doGet(request, response);
	        }

	}



