package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;
import DBConnect.DBContext;

/**
 * Servlet implementation class getAllInfor
 */
@WebServlet("/getAllInfor")
public class getAllInfor extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection conn;
    ResultSet rs;
    ResultSet rs1;
    Statement stmt;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        //String masv=msv.getMasv();
        String masvsearch = request.getParameter("masv");  
        String cmndSearch=request.getParameter("cmnd");
        DBContext db = DBContext.getInstance();
        try {
            conn = db.getConnection();
            
            response.setContentType("image/jpg");
            DAO dao = new DAO();
            stmt = conn.createStatement();

			String sql = "SELECT `masv`, `hoten`, DATE_FORMAT(ngaysinh,'%d/%m/%Y') AS ngaysinh, `gioitinh`, `lop`, `nganh`, `khoa`, `truong`, `CMND`, `sdtSV`, `sdtPH`, `email`, `diachi`, `anh` FROM `studentinfor` WHERE masv='"+masvsearch+"'";
            rs1=stmt.executeQuery(sql);
            rs = dao.searchSV(masvsearch);
            String masv = "";
            String hoten = "";
            String anh = "";
            String ngaysinh = "";
            int gt =0;
            String gioitinh="";
            String lop = "";
            String nganh = "";
            String khoa="";
            String truong = "";
            String cmnd="";
            String sdtSV="";
            String sdtPH="";
            String email ="";
            String diachi="";

            while (rs.next()) {
                masv = rs.getString("masv");
                hoten = rs.getString("hoten");
                ngaysinh = rs.getString("ngaysinh").replace('/', '-');
                gt = rs.getInt("gioitinh");
                lop = rs.getString("lop");
                nganh = rs.getString("nganh");
                khoa=rs.getString("khoa");
                truong = rs.getString("truong");
                cmnd = rs.getString("cmnd");
                sdtSV= rs.getString("sdtSV");
                sdtPH=rs.getString("sdtPH");
                email = rs.getString("email");
                diachi = rs.getString("diachi");
                anh = rs.getString("anh");
            }
            String checkedNam="";
            String checkedNu="";
            if (gt==1) {
            	gioitinh="Nam";
            	checkedNam="checked";
			}else {
				gioitinh="N???";
				checkedNu="checked";
			}

            boolean stt= (masvsearch.trim().toLowerCase().equals(masv.trim().toLowerCase()));
            if (!stt) {
                out.print("<div class=\"cc\" id=\"cc\">\n"
                        + "	<div class=\"col-xs-9 col-sm-9 col-md-10 col-lg-10\" style=\"position:relative;\">\n"
                        + "		<p style=\"font-weight:normal; line-height:20px\">\n"
                        + "					<b>Kh??ng t??m th???y sinh vi??n!</b></p>\n"
                        +"<p>Vui l??ng ki???m tra l???i m?? th??ng tin ho???c th???c hi???n ????ng k?? th??ng tin c?? nh??n <a href=\"register-infor-student.jsp\">T???i ????y</a></p>"
                        + "	</div>\n"
                        + "</div>");
            } else if(stt) {
            	out.print("<div class=\"center\" style=\"margin: 10 auto; width: 100%\">\r\n"
            			+ "		<form action=\"./updateExec\" method=\"post\"\r\n"
            			+ "			enctype=\"multipart/form-data\">\r\n"
            			+ "			<div class=\"container\">\r\n"
//            			+ "				<div class=\"text-center mt-5\">\r\n"
//            			+ "					<hr>\r\n"
//            			+ "				</div>\r\n"
            			+ "\r\n"
            			+ "				<div class=\"row\">\r\n"
            			+ "					<div class=\"col-lg-12 mx-auto\">\r\n"
            			+ "						<div class=\"card mt-2 mx-auto p-4\" style=\"border: none\">\r\n"
            			+ "							<div class=\"card-body\">\r\n"
            			+ "								<div class=\"container\">\r\n"
            			+ "									<div class=\"controls\">\r\n"
            			+ "										<h5>I. Th??ng tin c?? nh??n</h5>\r\n"
            			+ "										<hr style=\"border: 1px dotted gray\">\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"masv\">M?? sinh vi??n <span><span>*</span></span>\r\n"
            			+ "													</label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" readonly name=\"masv\" value=\""+masv+"\" class=\"form-control\"\r\n"
            			+ "														id=\"masv\" required />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"hoten\">H??? t??n <span><span>*</span></span>\r\n"
            			+ "													</label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" id=\"hoten\" value=\""+hoten+"\" class=\"form-control\"\r\n"
            			+ "														name=\"hoten\" required />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"img\">???nh <span><span>*</span></span>\r\n"
            			+ "													</label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													 <img id=\"anhthe\" src=\""+anh+"\" alt=\"\" style=\"width:113px; height:auto\"> &nbsp\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"ngaysinh\">Ng??y sinh <span>*</span>\r\n"
            			+ "													</label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+"<input type=\"date\" name=\"dob\" min=\"1997-01-01\" max=\"2030-12-31\" value=\""+ngaysinh+"\" required=\"required\" class=\"form-control\" id=\"ngaysinh\">"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"gioitinh\">Gi???i t??nh <span>*</span>\r\n"
            			+ "													</label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+"<div class=\"form-group\" style=\"display: flex;\">\r\n"
            			+ "														<label for=\"nam\">Nam </label> <input type=\"radio\" id=\"nam\" name=\"gioitinh\" value=\"1\" "+checkedNam+" required=\"required\" class=\"form-control\">\r\n"
            			+ "														<label for=\"nu\">N??? </label> <input type=\"radio\" id=\"nu\" name=\"gioitinh\" value=\"0\" "+checkedNu+" required=\"required\" class=\"form-control\">\r\n"
            			+ "												</div>"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<h5>II. Th??ng tin tr?????ng h???c</h5>\r\n"
            			+ "										<hr style=\"border: 1px dotted gray\">\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"lop\">L???p <span>*</span></label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" name=\"lop\" id=\"lop\" value=\""+lop+"\" class=\"form-control\"\r\n"
            			+ "														required=\"required\" />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"nganh\">Ng??nh <span>*</span></label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" name=\"nganh\" value=\""+nganh+"\" class=\"form-control\"\r\n"
            			+ "														id=\"nganh\" required=\"required\" />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"khoa\">Khoa <span>*</span></label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" name=\"khoa\" value=\""+khoa+"\" class=\"form-control\"\r\n"
            			+ "														id=\"khoa\" required=\"required\" />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<h5>III. Th??ng tin li??n h???</h5>\r\n"
            			+ "										<hr style=\"border: 1px dotted gray\">\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"cmnd\">CMND/CCCD <span>*</span></label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" name=\"cmnd\" value=\""+cmnd+"\" class=\"form-control\"\r\n"
            			+ "														id=\"cmnd\" required=\"required\" />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"truong\">Tr?????ng <span>*</span></label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" name=\"truong\" value=\""+truong+"\" class=\"form-control\"\r\n"
            			+ "														id=\"truong\" required=\"required\" />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"sdt\">S??? ??i???n tho???i c?? nh??n <span>*</span>\r\n"
            			+ "													</label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" name=\"sdtSV\" value=\""+sdtSV+"\" class=\"form-control\"\r\n"
            			+ "														id=\"sdt\" required=\"required\" />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"sdt\">S??? ??i???n tho???i gia ????nh <span>*</span>\r\n"
            			+ "													</label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" name=\"sdtPH\" value=\""+sdtPH+"\" class=\"form-control\"\r\n"
            			+ "														id=\"sdt\" required=\"required\" />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"email\">Email <span>*</span></label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"email\" name=\"email\" value=\""+email+"\" class=\"form-control\"\r\n"
            			+ "														id=\"email\" required=\"required\" />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<label for=\"diachi\">?????a ch??? <span>*</span></label>\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<div class=\"form-group\">\r\n"
            			+ "													<input type=\"text\" name=\"diachi\" value=\""+diachi+"\" class=\"form-control\"\r\n"
            			+ "														id=\"diachi\" required=\"required\" />\r\n"
            			+ "												</div>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "										<h5>X??c nh???n c???p nh???t</h5>\r\n"
            			+ "										<hr style=\"border: 1px dotted gray\">\r\n"
            			+ "										<div class=\"row\">\r\n"
            			+ "											<div class=\"col-md-2\"></div>\r\n"
            			+ "											<div class=\"col-md-10\">\r\n"
            			+ "												<button type=\"submit\" class=\"btn btn-success\">\r\n"
            			+ "													<i class=\"fa-solid fa-circle-check\"></i> C???p nh???t\r\n"
            			+ "												<button type=\"reset\" class=\"btn btn-default\">\r\n"
            			+ "													<i class=\"fa-solid fa-rotate-right\"></i> Vi???t l???i\r\n"
            			+ "												</button>\r\n"
            			+ "											</div>\r\n"
            			+ "										</div>\r\n"
            			+ "									</div>\r\n"
            			+ "								</div>\r\n"
            			+ "							</div>\r\n"
            			+ "						</div>\r\n"
            			+ "						<!-- /.8 -->\r\n"
            			+ "					</div>\r\n"
            			+ "					<!-- /.row-->\r\n"
            			+ "				</div>\r\n"
            			+ "			</div>\r\n"
            			+ "		</form>\r\n"
            			+ "	</div>");
            }
        }catch (Exception e) {
			// TODO: handle exception
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
