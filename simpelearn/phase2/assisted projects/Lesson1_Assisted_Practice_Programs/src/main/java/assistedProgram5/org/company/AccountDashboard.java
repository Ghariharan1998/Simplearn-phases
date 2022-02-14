package assistedProgram5.org.company;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AccountDashboard")
public class AccountDashboard extends HttpServlet {
       
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
                response.getWriter().write("I am in Account Dashboard after passing through LoginFilter");
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
                doGet(request, response);
        }

}

