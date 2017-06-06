package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.plan;
import service.IAddThingService;
import service.impl.AddThingServiceImpl;

/**
 * Servlet implementation class AddThingServlet
 */
@WebServlet("/AddThing")
public class AddThingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IAddThingService addthingService=new AddThingServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddThingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String planname=request.getParameter("planname");
		String personname=request.getParameter("personname");
		float estimatedcost=Float.parseFloat(request.getParameter("estimatedcost"));
		int actualshou=Integer.parseInt(request.getParameter("actualshou"));
		int aimshou=Integer.parseInt(request.getParameter("aimshou"));
		int aimcheng=Integer.parseInt(request.getParameter("aimcheng"));
		int actualcheng=Integer.parseInt(request.getParameter("actualcheng"));
		double aimshou1=(double) aimshou;
		double actualshou1=(double) actualshou;
		double actualcheng1=(double) actualcheng;
		double percentcompl1=actualshou1/aimshou1;
		double percentconv1=actualcheng1/actualshou1;
		String starttime=request.getParameter("starttime");
		String endtime=request.getParameter("endtime");
		String percentcompl=percentcompl1+"";
		String percentconv=percentconv1+"";
		int count=0;
		count=addthingService.addting(planname, personname, estimatedcost, actualshou, aimshou, percentcompl, aimcheng, actualcheng, percentconv, starttime, endtime);
		if(count==1){
			response.setContentType("text/html;charset=utf-8");
			request.getRequestDispatcher("Plan").forward(request, response);
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
