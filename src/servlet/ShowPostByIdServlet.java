package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class ShowPostByIdServlet
 */
@WebServlet("/sps")
public class ShowPostByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IPostService postService=new PostServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPostByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("sid"));
		Postjob postjob=postService.select(id);
		int foid=postjob.getFoid();
		int soid=postjob.getSoid();
		int toid=postjob.getToid();
		int fpid=postjob.getFpid();
		int spid=postjob.getSpid();
			Postjob postjob1=postService.selectById(id, foid, soid, toid, fpid, spid);
		    request.setAttribute("postjob",postjob1);
		    request.setAttribute("id",id);
		    RequestDispatcher rd = request.getRequestDispatcher("UpdatePost.jsp");
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
