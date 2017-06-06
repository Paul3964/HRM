package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Post;
import entity.PostI;
import entity.PostII;
import service.ITestService;
import service.impl.TestServiceImpl;
@WebServlet("/create")
public class CreateExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ITestService testService = new TestServiceImpl();
	/**
	 * Constructor of the object.
	 */
	public CreateExamServlet() {
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
//		int id = Integer.parseInt(request.getParameter("id"));
//		int id2 = Integer.parseInt(request.getParameter("id2"));
//		String a = request.getParameter("a");
//		String b = request.getParameter("b");
//		System.out.println("id:"+id);
//		System.err.println("a:"+a);
		List<Post> posts = testService.getAllMart();
		List<PostI> postI = testService.getAllSyn();
		List<PostII> postII = testService.getAllKnow();
		request.setAttribute("posts", posts);
		request.setAttribute("postI", postI);
		request.setAttribute("postII", postII);
		request.getRequestDispatcher("CreateExam.jsp").forward(request, response);
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
