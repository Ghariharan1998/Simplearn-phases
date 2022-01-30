package assistedPrgram6.org.company;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class Dashboard
*/
@WebServlet("/DashBoard")
public class DashBoard extends HttpServlet {
        private static final long serialVersionUID = 1L;
  
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
        
                Cookie cookie = null;
            Cookie[] cookies = null;
            boolean found = false;
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            cookies = request.getCookies();
            if (cookies != null) {
                    for (int i = 0; i < cookies.length; i++) {
                    cookie = cookies[i];
                    if (cookie.getName().contentEquals("userid") && cookie.getValue() != null) {
                        out.println("UserId read from cookie:" + cookie.getValue() + "<br>");
                        found = true;
                    }
                 }
            }
            if (!found) {
                out.println("No UserId was found in cookie.<br>");
            }
            out.println("</body></html>");

        }

        
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}

