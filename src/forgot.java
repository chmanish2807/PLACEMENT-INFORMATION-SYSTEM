import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class forgot extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	PrintWriter out =response.getWriter();
    		String username=request.getParameter("name");
    		if(Validate.forgot(username)) {
    		RequestDispatcher rd=request.getRequestDispatcher("repassword.jsp");
            rd.forward(request, response);
    		}
        		else {
        			response.sendRedirect("forgot.jsp");
        		}
   		 }
    		
    }
