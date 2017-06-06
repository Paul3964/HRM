package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Resume;
import service.IPostService;
import service.impl.PostServiceImpl;

/**
 * Servlet implementation class ShowResumeServlet
 */
@WebServlet("/sr")
public class ShowResumeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IPostService postService=new PostServiceImpl(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowResumeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstpost=request.getParameter("firstpost");
		String secondpost=request.getParameter("secondpost");
		String keyword=request.getParameter("keyword");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date stime=null;
		Date etime=null;
			try {
				stime = sdf.parse(request.getParameter("etime"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				etime=  sdf.parse(request.getParameter("etime"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<Resume> list=postService.selectResume(firstpost, secondpost, keyword, stime, etime);
			request.setAttribute("list",list);
			RequestDispatcher rd = request.getRequestDispatcher("showResume.jsp");
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
