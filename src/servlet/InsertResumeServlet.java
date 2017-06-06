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

import entity.Resume;
import service.IPostService;
import service.impl.PostServiceImpl;

/**
 * Servlet implementation class InsertResumeServlet
 */
@WebServlet("/irs")
public class InsertResumeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IPostService postService=new PostServiceImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertResumeServlet() {
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
		String posttype=request.getParameter("posttype");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String Email=request.getParameter("Email");
		int phone=Integer.parseInt(request.getParameter("phone"));
		int telephone=Integer.parseInt(request.getParameter("telephone"));
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		String address=request.getParameter("address");
		int postcode=Integer.parseInt(request.getParameter("postcode"));
		String nationality=request.getParameter("nationality");
		String birthplace=request.getParameter("birthplace");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday=null;
		Date time=null;
		try {
			birthday = sdf.parse(request.getParameter("birthday"));
			time=sdf.parse(request.getParameter("time"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String nation=request.getParameter("nation");
		String religion=request.getParameter("religion");
		String status=request.getParameter("status");
		int IDcard=Integer.parseInt(request.getParameter("IDcard"));
		int age=Integer.parseInt(request.getParameter("age"));
		String school=request.getParameter("school");
		String education=request.getParameter("education");
	    String years=request.getParameter("years");
	    String profession=request.getParameter("profession");
	    String salary=request.getParameter("salary");
	    String resume=request.getParameter("resume");
	    String remark=request.getParameter("remark");
	    Resume rs=new Resume(firstpost,secondpost,posttype,name,gender,Email,phone,telephone,mobile,address,postcode,nationality,birthplace,birthday,nation,religion,status,IDcard,age,school,education,years,profession,salary,time,resume,remark);
        int count=postService.insertResume(rs);
        if(count==1){
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
