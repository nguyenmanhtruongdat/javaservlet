package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;
import entity.account;

/**
 * Servlet implementation class register
 */
@WebServlet("/addAccount")
public class addAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			String username =request.getParameter("username");
			String password = request.getParameter("password");
			String role = request.getParameter("role");
			int isAdmin=0;
			int isUser=0;
			if (role.trim().equals("admin")) {
				isAdmin =1;
			}else {
				isUser=1;
			}
				DAO dao = new DAO();
				account acc = new account();
				
				
			try {
				PrintWriter out = response.getWriter();
				String passwordEcrtdao= dao.MD5(password);
				acc.setUsername(username);
				acc.setPassword(passwordEcrtdao);
				acc.setIsUser(isUser);
				acc.setIsAdmin(isAdmin);
				int result = dao.addAccount(acc);
				if (result>0) {
					out.print("<script>\r\n"
							+ "  alert(\"Đăng ký tài khoản thành công!\");\r\n"
							+"window.location.href = \"login.jsp\";"
							+ "</script>\r\n"
							+ "");
					
				}else {
					request.setAttribute("msg", "Đăng ký thất bại");
					request.getRequestDispatcher("registerAcc.jsp").forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
