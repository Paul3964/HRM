package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Employee;
import entity.Post;
import entity.orgpost;
import service.IRegisterService;
import service.impl.RegisterServicImpl;

/**
 * Servlet implementation class ShowEmployeeServlet
 * 查询后修改员工表的Servlet
 */
@WebServlet("/sse")
public class ShowEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IRegisterService register=new RegisterServicImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowEmployeeServlet() {
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
		String file_number=request.getParameter("did");
		HttpSession session=request.getSession();
		Employee employee=register.selectById(Integer.parseInt(file_number));
		orgpost op=register.selectOrgPost(Integer.parseInt(file_number));
		System.out.println(op.getSecondpost());
		List<Post> list=register.selectNameById(op.getSecondpost());
		request.setAttribute("employee", employee);
		request.setAttribute("op", op);
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}