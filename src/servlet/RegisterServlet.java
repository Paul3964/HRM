package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Employee;
import entity.Organization;
import entity.Post;
import service.IRegisterService;
import service.impl.RegisterServicImpl;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{


	private static final long serialVersionUID = 1L;
	private IRegisterService registerService = new RegisterServicImpl();
	
	public RegisterServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		request.setCharacterEncoding("utf-8");
		int eid = Integer.parseInt(request.getParameter("number"));
		int fname=Integer.parseInt(request.getParameter("firstorg1"));
		int sname=Integer.parseInt(request.getParameter("secondorg2"));
		int tname=Integer.parseInt(request.getParameter("thirdorg3"));
		int fpost =Integer.parseInt(request.getParameter("sort1"));
		int spost=Integer.parseInt(request.getParameter("jname2"));
		int tpost = Integer.parseInt(request.getParameter("titile3"));
		
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String Email = request.getParameter("Email");
		String phone = request.getParameter("phone");
		String QQ = request.getParameter("QQ");
		String mobile = request.getParameter("mobile");
		String address = request.getParameter("address");
		String registrant = request.getParameter("registrant");
		String postcode = request.getParameter("postcode");
		String nationality = request.getParameter("nationality");
		String birthplace = request.getParameter("birthplace");
		String nation = request.getParameter("nation");
		String resume = request.getParameter("resume");
		String family = request.getParameter("family");
		String salary_standard = request.getParameter("salary_standard");
		String account = request.getParameter("account");
		String notes = request.getParameter("notes");
		Date birthday = null;
		Date filing_time = null;
		try {
			birthday = sdf.parse(request.getParameter("birthday"));
			filing_time = sdf.parse(request.getParameter("filing_time"));
		} catch (ParseException e){
			e.printStackTrace();
		}
		Employee employee = new Employee(eid, name, gender, Email, phone, QQ, mobile, address, registrant, postcode, nationality, birthplace, birthday, nation, resume, family, salary_standard, filing_time, account, notes,fname,sname,tname,fpost,spost,tpost);
		int result= registerService.saveEmployee(employee);
		if(result==1){
			request.getRequestDispatcher("DateServlet").forward(request, response);
		}
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");	
		doGet(request, response);
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
