package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Pager;
import entity.Pager2;
import service.IPlanService;
import service.impl.PlanServiceImpl;

/**
 * Servlet implementation class PlanServlet
 */
@WebServlet("/Plan")
public class PlanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IPlanService planService=new PlanServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pageNum = 1;
		int nums = 10;
		
		//
		if(request.getParameter("pageNum")!=null){
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
		}
		
		if(request.getParameter("nums")!=null){
			nums = Integer.parseInt(request.getParameter("nums"));
		}
		Pager2 pager=planService.getAllout(pageNum, nums);
		response.setContentType("text/html;charset=utf-8");
		request.setAttribute("pager", pager);
		request.getRequestDispatcher("plan.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
