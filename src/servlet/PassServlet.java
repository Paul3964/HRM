package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Pager;
import entity.Salary;
import service.ISalaryService;
import service.impl.SalaryServiceImpl;

/**
 * Servlet implementation class ReviewServlet
 */
@WebServlet("/review")
public class PassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static ISalaryService is = new SalaryServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pageNum = 1;
		int nums = 10;
		if(request.getParameter("pageNum")!=null){
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
		}
		if(request.getParameter("nums")!=null){
			nums = Integer.parseInt(request.getParameter("nums"));
		}
		 Pager pager  =is.getAllsalary(pageNum, nums);
		request.setAttribute("pager", pager);
		request.getRequestDispatcher("review.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
