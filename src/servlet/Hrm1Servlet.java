package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.hrm1;
import service.IAddThingService;
import service.impl.AddThingServiceImpl;

/**
 * Servlet implementation class Hrm1Servlet
 */
@WebServlet("/Hrm1Servlet")
public class Hrm1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IAddThingService addthingService=new AddThingServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hrm1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		int tid =Integer.parseInt(request.getParameter("thirdorg3"));
		 String address = null;
		 switch (tid) {
			case 1:
				address = "XX街道";
				break;
			case 2:
				address = "XX小区";
				break;
			case 3:
				address = "XX开发区";
				break;
			case 4:
				address = "XX写字楼";
				break;
		}
		 int fid =Integer.parseInt(request.getParameter("ftest"));
		 String ftestname = null;
		 switch (fid) {
			case 1:
				ftestname = "理科";
				break;
			case 2:
				ftestname = "文科";
				break;
			case 3:
				ftestname = "专业知识类";
				break;
		}
		 int sid =Integer.parseInt(request.getParameter("stest"));
		 String stestname = null;
		 switch (sid) {
			case 1:
				stestname = "高数";
				break;
			case 2:
				stestname = "英语听力";
				break;
			case 3:
				stestname = "计算机专业";
				break;
			case 4:
				stestname = "机械专业";
				break;
			case 5:
				stestname = "线性代数";
				break;
			case 6:
				stestname = "英语阅读";
				break;
		}
		 String aimcourse = request.getParameter("aimcourse");
		 int aimnum = Integer.parseInt(request.getParameter("aimnum"));
		 int actnum = Integer.parseInt(request.getParameter("actnum"));
		 String createtime=null;
		 String stoptime=null;
		 createtime = request.getParameter("createtime");
		 stoptime=request.getParameter("stoptime");
			
		 
		 hrm1 hrms = new hrm1(0, aimcourse, aimnum, actnum, createtime, stoptime, address, ftestname, stestname);
		 int result = 0;
		 result =addthingService.addalldecisons(hrms);
		 if(result == 1 ){
			 request.getRequestDispatcher("searchdecision.jsp").forward(request, response);
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
