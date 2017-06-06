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

import entity.Employee;
import entity.Organization;
import entity.Post;
import service.IRegisterService;
import service.impl.RegisterServicImpl;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IRegisterService register=new RegisterServicImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
		int file_number=Integer.parseInt(request.getParameter("file_number"));
		String thirdpost = request.getParameter("thirdpost");
		int tid=register.selectByName6(thirdpost);
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday=null;
		Date filing_time=null;
		try {
			birthday = sdf.parse(request.getParameter("birthday"));
			filing_time=sdf.parse(request.getParameter("filing_time"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String nation = request.getParameter("nation");
		String resume = request.getParameter("resume");
		String family = request.getParameter("family");
		String salary_standard = request.getParameter("salary_standard");
		String account = request.getParameter("account");
		String notes = request.getParameter("notes");
		Employee employee=new Employee(file_number,name,gender,Email,phone,QQ,mobile,
			address, registrant,postcode,nationality,birthplace,birthday,
			nation,resume,family,salary_standard,filing_time,account,notes,tid);
		int count=register.update(employee);
		if(count==1){
			RequestDispatcher rd = request.getRequestDispatcher("data");
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
