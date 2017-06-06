package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Post;
import service.IFirstOrganizationService;
import service.impl.FirstOrganizationServiceImpl;

public class SecondPortServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IFirstOrganizationService firstOrganizationService =new FirstOrganizationServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public SecondPortServlet() {
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
//		String pid="1";
		String pid = request.getParameter("pid");
		String callBack = request.getParameter("callBack");
//		System.out.println(callBack);
		List<Post> lists = firstOrganizationService.getAllspost(Integer.parseInt(pid));
		
//		System.out.println(lists);
		StringBuffer sb = new StringBuffer(callBack+"([");
		for(Post post:lists){
				sb.append("{\"name\":\""+post.getTitile()+"\",\"id\":"+"\""+post.getId()+"\"},");
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
