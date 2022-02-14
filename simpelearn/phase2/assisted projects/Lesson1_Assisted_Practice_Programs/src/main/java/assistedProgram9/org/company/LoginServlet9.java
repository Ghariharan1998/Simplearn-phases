package assistedProgram9.org.company;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet9")
public class LoginServlet9 extends HttpServlet {
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // TODO Auto-generated method stub
         
          String userId = request.getParameter("userid");
          HttpSession session=request.getSession();  
      session.setAttribute("userid",  userId);
                   
      response.sendRedirect("dashboard");  
         
 }


 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // TODO Auto-generated method stub
         doGet(request, response);
 }

}

