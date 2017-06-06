package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Employee;
import entity.Staff;
import service.IQueryService;
import service.IRegisterService;
import service.impl.QueryServiceImpl;
import service.impl.RegisterServicImpl;

/**
 * Servlet implementation class Inservlet
 */
@WebServlet("/in")
public class Inservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IRegisterService irs=new RegisterServicImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	int foid=Integer.parseInt(request.getParameter("a"));
	int soid=Integer.parseInt(request.getParameter("b"));
	int toid=Integer.parseInt(request.getParameter("c"));
	int fpid=Integer.parseInt(request.getParameter("d"));
	int spid=Integer.parseInt(request.getParameter("e"));
	int number=Integer.parseInt(request.getParameter("number"));
	String name=request.getParameter("name");
	Employee employee=new Employee(number,name,foid,soid,toid,fpid,spid);
		int count=irs.update1(employee);
		if(count==1){
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
