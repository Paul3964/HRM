package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.impl.SalaryServiceImpl;

/**
 * Servlet implementation class SalaryServlet
 */
@WebServlet("/salary")
public class SalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static SalaryServiceImpl s = new SalaryServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/hh:mm:ss");
		String date1 = sdf.format(date);
		request.setAttribute("time", date1);
		String ss = s.getNumber();
		request.setAttribute("number", ss);
		request.getRequestDispatcher("salary.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
