package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Salary;
import service.ISalaryService;
import service.impl.SalaryServiceImpl;

/**
 * Servlet implementation class ReviewSalary
 */
@WebServlet("/reviewsalary")
public class ReviewSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ISalaryService is = new SalaryServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewSalaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("did");
		List<Salary> lists = is.getAllSalary(Integer.parseInt(id));
		request.setAttribute("review", lists);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/hh:mm:ss");
		String time = sdf.format(date);
		request.setAttribute("time", time);
		request.getRequestDispatcher("reviewSalary.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
