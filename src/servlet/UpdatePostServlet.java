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

import entity.Employee;
import entity.Postjob;
import service.IPostService;
import service.impl.PostServiceImpl;

/**
 * Servlet implementation class UpdatePostServlet
 * 修改职位发布信息
 */
@WebServlet("/ups")
public class UpdatePostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IPostService postService=new PostServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String posttype=request.getParameter("posttype");
		String detail=request.getParameter("detail");
		String demand=request.getParameter("demand");
		String register=request.getParameter("register");
		int id=Integer.parseInt(request.getParameter("id"));
		int personnumber=Integer.parseInt(request.getParameter("personnumber"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date etime=null;
		Date filing_time=null;
		String states="不可修改";
		try {
			etime = sdf.parse(request.getParameter("etime"));
			filing_time=sdf.parse(request.getParameter("filing_time"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Postjob postjob=new Postjob(posttype,personnumber,etime,register,filing_time,detail,demand,states);
		int result=postService.Update(id, postjob);
		List<Postjob> list =postService.selectById1();
		request.setAttribute("list1",list);
		if(result==1){
			RequestDispatcher rd = request.getRequestDispatcher("Postlist.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
