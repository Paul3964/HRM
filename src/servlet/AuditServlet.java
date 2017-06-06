package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ISalaryService;
import service.impl.SalaryServiceImpl;

/**
 * Servlet implementation class AuditServlet
 */
@WebServlet("/audit")
public class AuditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static ISalaryService is = new SalaryServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String id = request.getParameter("number");
		 int check = is.checkSalary(Integer.parseInt(id));
		 String message = request.getParameter("message");
		 int count = is.insertSalary(Integer.parseInt(id), message);
		 if(check==1&&count==1){
			 response.sendRedirect("main.jsp");
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
