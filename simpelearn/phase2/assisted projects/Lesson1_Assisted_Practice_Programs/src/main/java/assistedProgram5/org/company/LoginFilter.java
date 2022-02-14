package assistedProgram5.org.company;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                
                String userId = request.getParameter("userid");

                if( userId != null){
                        chain.doFilter(request, response);
            }
                 
                
        }

      
        public void init(FilterConfig fConfig) throws ServletException {
                
        }

		@Override
		public boolean accept(Object entry) throws IOException {
		
			return false;
		}

}

