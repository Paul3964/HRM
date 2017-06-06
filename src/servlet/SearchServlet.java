package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Pager;
import entity.Pager1;
import entity.Test;
import service.ITestService;
import service.impl.TestServiceImpl;


public class SearchServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ITestService testService = new TestServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public SearchServlet() {
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
	 * @throws IOExce2ption if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String fid = request.getParameter("ftest1");
//		System.out.println(fid);
//		String fname = testService.getFnameByfid(Integer.parseInt(fid));
//		System.out.println("试卷一级分类:"+fname);
		String key = request.getParameter("key");
//		Date year1=null;
//		Date year2=null;
//		try {
//			year1 = sdf.parse(request.getParameter("year1"));
//			year2 =sdf.parse(request.getParameter("year2"));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		Test test = null;
		if(fid==null||"".equals(fid)){
			
				test = new Test(-1, null, null, null, null, null,null, null, null, null);
			}
		else {
			
				test = new Test(Integer.parseInt(fid),null, key, null, (request.getParameter("year1")), null, testService.getFnameByfid(Integer.parseInt(fid)), null, null, (request.getParameter("year2")));
		
		}
		
		
		Dpage(request, response, test);
		
		
		
		
	}

	private void Dpage(HttpServletRequest request,
			HttpServletResponse response, Test test) throws ServletException,
			IOException {
		int pageNum = 1;
		int nums = 6;
		
		if(request.getParameter("pageNum")!=null){
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
			
		}
		if(request.getParameter("nums")!=null){
			nums = Integer.parseInt(request.getParameter("nums"));
		}
		Pager1 pager = testService.SearchtestbyCondition(pageNum,nums,test);
		request.setAttribute("pager", pager);
//		System.out.println("pager:"+pager);
//		System.out.println("condition:"+test);
		request.setAttribute("condition", test);
		request.getRequestDispatcher("data.jsp").forward(request, response);
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
