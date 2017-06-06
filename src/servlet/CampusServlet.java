package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Hrm;
import service.ICampusService;
import service.impl.CampusServiceImpl;
@WebServlet("/campus")
public class CampusServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ICampusService campusService = new CampusServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public CampusServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
		
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		request.setCharacterEncoding("utf-8");
		int eid = Integer.parseInt(request.getParameter("number"));
		String fname=request.getParameter("firstorg1");
		String sname=request.getParameter("secondorg2");
		String tname=request.getParameter("thirdorg3");
//		System.out.println("这里是campusServlet");
		String name = request.getParameter("name");
		Date filingtime = null;
		try {
			filingtime = sdf.parse(request.getParameter("filing_time"));
		} catch (ParseException e){
			e.printStackTrace();
		}
		String major=request.getParameter("major");
		int pnum = Integer.parseInt(request.getParameter("pnum"));
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String QQ =request.getParameter("QQ");
		String email =request.getParameter("email");
		Hrm hrm = new Hrm(eid, fname, sname, tname, name, filingtime, major, pnum, phone1, phone2, QQ, email);
		int result = campusService.addAllHrm(hrm);
		if(result==1)
		{
			request.getRequestDispatcher("SelectCamServlet").forward(request, response);

		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");	
		doGet(request, response);
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
