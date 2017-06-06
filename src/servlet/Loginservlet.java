package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import entity.User;
import service.ILoginService;
import service.impl.LoginServiceImpl;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/login")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private ILoginService login=new LoginServiceImpl();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name =request.getParameter("name");
		String password=request.getParameter("password");
		String teacher = request.getParameter("teacher");
		String principal = request.getParameter("principal");
		String finance = request.getParameter("finance");
		User user = login.executeLogin(name, password);
		if(user.getPosition().equals(teacher)){
			request.getRequestDispatcher("loginteacher.jsp").forward(request, response);
		}
		if(user.getPosition().equals(principal)){
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}
		if(user.getPosition().equals(finance)){
			request.getRequestDispatcher("loginfinance.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("login.jsp").forward(request, response);
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
