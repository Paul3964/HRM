package servlet;

import java.io.IOException;

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
 * Servlet implementation class JLRegisterServlet
 */
@WebServlet("/jls")
public class JLRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IPostService postService=new PostServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JLRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("sid"));
		Postjob postjob=postService.selectById2(id);
		request.setAttribute("postjob",postjob);
		RequestDispatcher rd = request.getRequestDispatcher("jlRegister.jsp");
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
