package servlet;

import java.io.IOException;
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
 * Servlet implementation class SalarySerachServlet
 */
@WebServlet("/serach")
public class SalarySerachServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static ISalaryService is = new SalaryServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalarySerachServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number = request.getParameter("number");
		String post = request.getParameter("post");
		String markes = request.getParameter("markes");
		String registrant = request.getParameter("registrant");
		//封装的条件
		Salary s = null;
		if(number==null||"".equals(number)){//规定id为-1代表没有传递id值
			s= new Salary(-1, post, markes, registrant);
		}else{
			s = new Salary(Integer.parseInt(number), post, markes, registrant);
		}
		
		
		//根据当前页  以及 每页显示多少条刷新数据
		int pageNum = 1;//默认从第一页开始 每页10条数据
		int nums = 10;
		
		//
		if(request.getParameter("pageNum")!=null){
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
		}
		
		if(request.getParameter("nums")!=null){
			nums = Integer.parseInt(request.getParameter("nums"));
		}
		
		Pager pager = is.search(pageNum, nums, s);
		request.setAttribute("pager", pager);
		request.setAttribute("condition", s);
		request.getRequestDispatcher("serach.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
