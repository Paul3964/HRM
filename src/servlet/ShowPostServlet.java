package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Postjob;
import service.IPostService;
import service.impl.PostServiceImpl;

/**
 * Servlet implementation class ShowPostServlet
 * 显示可修改的职位发布信息
 */
@WebServlet("/post")
public class ShowPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IPostService postService=new PostServiceImpl(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 List<Postjob> list=postService.selectById();
		    request.setAttribute("list", list);
		    	RequestDispatcher rd = request.getRequestDispatcher("showpostjob.jsp");
				rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
