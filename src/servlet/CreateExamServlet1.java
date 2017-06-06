package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Post;
import entity.Question;
import service.ITestService;
import service.impl.TestServiceImpl;

public class CreateExamServlet1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ITestService testService = new TestServiceImpl();
	
	/**
	 * Constructor of the object.
	 */
	public CreateExamServlet1() {
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
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		
//		int id = Integer.parseInt(request.getParameter("id"));
//		String fpost = request.getParameter("fpost");
//		String spost = request.getParameter("spost");
//		String resigner = request.getParameter("resigner");
////		Date time = null;
////		try {
////			time = sdf.parse(request.getParameter("time"));
////		} catch (ParseException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		String time = request.getParameter("time");
//		int atime =Integer.parseInt(request.getParameter("atime"));
//		Question question = new Question(id, fpost, spost, resigner, time, atime);
//		int result = testService.SaveQuestion(question);
////		if(result == 1){
////			System.out.println("添加基本试卷信息成功");
////		}
//		
//		String posts[] = request.getParameterValues("titile");
////		System.out.println("市场类："+posts);
//		String postn[] = request.getParameterValues("postn");
////		System.out.println("市场类："+posts);
////		System.out.println(postn);
//		int result1 = testService.selectQuestionMart(posts,postn,id);
////		if(result1==1){
////			System.out.println("市场类试卷生成成功");
////		}
//		
//		String postI[] = request.getParameterValues("name1");
////		System.out.println("综合类："+postI);
//		String postIn[] = request.getParameterValues("postIn");
////		System.out.println("综合类："+postI);
//		System.out.println(postIn);
//		int result2 = testService.selectQuestionSyn(postI,postIn,id);
////		if(result2==1){
////			System.out.println("综合类试卷生成成功");
////		}
//		
//		String postII[] = request.getParameterValues("name2");
////		System.out.println("基础知识类："+postII);
//		String postIIn[] = request.getParameterValues("postIIn");
////		System.out.println("基础知识类："+postII);
////		System.out.println(postIIn);
//		int result3 = testService.selectQuestionKnow(postII,postIIn,id);
////		if(result3==1){
////			System.out.println("基础知识类试卷生成成功");
////		}
//		if(result==1&&result1==1&&result2==1&&result3==1){
			request.getRequestDispatcher("ID.jsp").forward(request, response);
//		}
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
