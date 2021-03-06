package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import DAO.DAO;
import entity.detailsRoom;
import entity.student;

/**
 * Servlet implementation class updateExec
 */
@WebServlet("/updateLiverInfor")
public class updateLiverInfor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SAVE_DIR="images/sinhvien";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateLiverInfor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		DAO dao = new DAO();
		detailsRoom d = new detailsRoom();
        String masv= request.getParameter("masv");
        String phong = request.getParameter("phong");
        String thoigianvao = request.getParameter("ngaybatdau");
        String thoigianra = request.getParameter("ngayketthuc");
        try {
        	d.setMaphong(phong);
        	d.setNgayvao(thoigianvao);
        	d.setNgayra(thoigianra);
        	d.setMasv(masv);
            int result = dao.updateLiverInfor(d);
	            if (result>0) {
	            	out.print("<script>\r\n"
	            			+ "  alert(\"C???p nh???t th??ng tin th??nh c??ng!\");\r\n"
	            			+ "  window.location.href = \"editLiver.jsp\";\r\n"
	            			+ "</script>");
//					response.sendRedirect("index.jsp");
				}else {
					out.print("<script>\r\n"
							+ "  alert(\"C???p nh???t th??ng tin th???t b???i, vui l??ng ki???m tra l???i!\");\r\n"
							+ "  window.location.href = \"editLiver.jsp\";\r\n"
							+ "</script>");
				}
	        } catch (Exception e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	        }
	}

	private String extractFilename(Part part) {
		String disk = part.getHeader("content-disposition");
		String[] items = disk.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length()-1);
			}
		}
		return "";
	}
	
}
