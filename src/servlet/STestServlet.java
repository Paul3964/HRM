package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.SeriesTest;
import service.ITestService;
import service.impl.TestServiceImpl;

public class STestServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ITestService testService = new TestServiceImpl();
	
	/**
	 * Constructor of the object.
	 */
	public STestServlet() {
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
		
		String pid = request.getParameter("pid");
//		String pid= "1";
//		System.out.println("第二级ID的值："+pid);
		String callBack = request.getParameter("callBack");
		List<SeriesTest> list = testService.getAllStest(Integer.parseInt(pid));
		StringBuffer sb = new StringBuffer(callBack+"([");
		for(SeriesTest seriesTest:list){
				sb.append("{\"sname\":\""+seriesTest.getName()+"\",\"sid\":"+"\""+seriesTest.getId()+"\"},");
		}
		sb.append("])");
		PrintWriter pw = response.getWriter();
		pw.write(sb.toString());
//		System.out.println("hehe");
		pw.flush();
		pw.close();

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
