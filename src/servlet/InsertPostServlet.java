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

import entity.Postjob;
import service.IPostService;
import service.IRegisterService;
import service.impl.PostServiceImpl;
import service.impl.RegisterServicImpl;

/**
 * Servlet implementation class InsertPostServlet
 * 增加职位发布信息
 */
@WebServlet("/ips")
public class InsertPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IPostService postService=new PostServiceImpl();
    private IRegisterService registerService=new RegisterServicImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int foid=Integer.parseInt(request.getParameter("firstorg1"));
		int soid=Integer.parseInt(request.getParameter("secondorg2"));
		int toid=Integer.parseInt(request.getParameter("thirdorg3"));
		String posttype=request.getParameter("posttype");
		int fpid=Integer.parseInt(request.getParameter("sort1"));
		int spid=Integer.parseInt(request.getParameter("jname2"));
		int personnumber=Integer.parseInt(request.getParameter("personnumber"));
		String register=request.getParameter("register");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date etime=null;
		Date filing_time=null;
			try {
				etime = sdf.parse(request.getParameter("etime"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				filing_time =  sdf1.parse(request.getParameter("filing_time"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String detail=request.getParameter("detail");
		String demand=request.getParameter("demand");
		Postjob postjob=new Postjob(foid,soid,toid,posttype,fpid,spid,personnumber,etime,register,filing_time,detail,demand);
	    int result=postService.insertPost(postjob);
	    if(result==1){
	    response.sendRedirect("post");
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
