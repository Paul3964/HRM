package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Salary;
import service.impl.SalaryServiceImpl;

/**
 * Servlet implementation class SaveSalaryServlet
 */
@WebServlet("/savesalary")
public class SaveSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private SalaryServiceImpl ssi = new SalaryServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveSalaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String number = request.getParameter("number");
			String post = request.getParameter("post");
			String count = request.getParameter("count");
			String markes = request.getParameter("markes");
			String registrant = request.getParameter("registrant");
			String time = request.getParameter("time");
			String standard = request.getParameter("standard");
			String travel = request.getParameter("travel");
			String message = request.getParameter("message");
			String difirt = request.getParameter("difirt");
			String lunch = request.getParameter("lunch");
			String common = request.getParameter("lunch");
			String traffic = request.getParameter("traffic");
			String car = request.getParameter("car");
			Salary s = null;
			try {
				s = new Salary(Integer.parseInt(number),post,Float.parseFloat(count),markes,registrant,time,Float.parseFloat(standard),Float.parseFloat(travel),Float.parseFloat(message),Float.parseFloat(difirt),Float.parseFloat(common),Float.parseFloat(lunch),Float.parseFloat(traffic),Float.parseFloat(car));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			int result =  ssi.saveSalary(s);
			if(result==1){
				response.sendRedirect("main.jsp");
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
