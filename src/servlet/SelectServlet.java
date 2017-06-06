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
import javax.servlet.http.HttpSession;

import entity.Employee;
import entity.Organization;
import entity.Pager;
import entity.Post;
import entity.Staff;
import service.IRegisterService;
import service.impl.RegisterServicImpl;

/**
 * Servlet implementation class SelectServlet
 * 按机构职位查询时的Servlet
 */
@WebServlet("/select")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IRegisterService register=new RegisterServicImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectServlet() {
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
		String firstorg=null;
		int fid=0;
		if(request.getParameter("firstorg")!=null){
		    firstorg=request.getParameter("firstorg");
		    fid=register.selectByName1(firstorg);
		}

		String secondorg=null;
		int sid=0;
		if(request.getParameter("secondorg")!=null){
			secondorg=request.getParameter("secondorg");
		    sid=register.selectByName2(secondorg);
		}
		String thirdorg=null;
		int tid=0;
		if(request.getParameter("thirdorg")!=null){
			thirdorg=request.getParameter("thirdorg");
		    tid=register.selectByName3(thirdorg);
		}

		String firstpost=null;
		int fpid=0;
		if(request.getParameter("firstpost")!=null){
			firstpost=request.getParameter("firstpost");
		    fpid=register.selectByName4(firstpost);
		}

		String secondpost=null;
		int spid=0;
		if(request.getParameter("secondpost")!=null){
			secondpost=request.getParameter("secondpost");
		    spid=register.selectByName5(secondpost);
		}
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date stime=null;
		Date etime=null;
			try {
				stime = sdf.parse(request.getParameter("stime"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				etime =  sdf.parse(request.getParameter("etime"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession session=request.getSession();
			List<Staff> list=register.selectByorg(fid, sid, tid, fpid, spid, stime, etime);
			session.setAttribute("list", list);
			request.getRequestDispatcher("SelectResult.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}