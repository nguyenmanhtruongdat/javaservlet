package Controller;

import java.awt.Taskbar.State;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;

import java.sql.Statement;

import java.sql.ResultSet;
import DBConnect.DBContext;
import entity.student;

/**
 * Servlet implementation class searchSV
 */
@WebServlet("/showRegister")
public class showRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection conn;
    ResultSet rs;
    Statement stmt;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        //String masv=msv.getMasv();
        String masvsearch = request.getParameter("masv");
        try {
            DBContext db = DBContext.getInstance();
            conn = db.getConnection();
            PrintWriter out = response.getWriter();
            DAO dao = new DAO();
            stmt = conn.createStatement();
            String sql = "select * from studentinfor where masv='" + masvsearch + "'";
            rs = stmt.executeQuery(sql);
            String masv = "";
            String hoten = "";
            String anh = "";
            String ngaysinh = "";
            int gt=0;
            String gioitinh = "";
            String lop = "";
            String nganh = "";
            String truong = "";
            String cmnd = "";
            String sdtSV = "";
            String sdtPH = "";
            String email = "";
            String diachi = "";
            while (rs.next()) {
                masv = rs.getString("masv");
                anh = rs.getString("anh");
                hoten = rs.getString("hoten");
                ngaysinh = rs.getString("ngaysinh");
                gt = rs.getInt("gioitinh");
                lop = rs.getString("lop");
                nganh = rs.getString("nganh");
                truong = rs.getString("truong");
                cmnd = rs.getString("CMND");
                sdtSV = rs.getString("sdtSV");
                email = rs.getString("email");
                diachi = rs.getString("diachi");
            }
            student std = new student();
            std.setMasv(masv);
            std.setTen(hoten);
            std.setNgaysinh(ngaysinh);
            std.setGioitinh(gt);
            std.setLop(lop);
            std.setNganh(nganh);
            std.setTruong(truong);
            std.setCMND(cmnd);
            std.setSdtCanhan(sdtSV);
            std.setSdtGiadinh(sdtPH);
            std.setDiachi(diachi);
            std.setEmail(email);
boolean stt= (masvsearch.trim().toLowerCase().equals(masv.trim().toLowerCase()));
			if (gt==1) {
				gioitinh="Nam";
			} else {
				gioitinh="N???";
			}
            if (!stt) {
                out.print("<div class=\"cc\" id=\"cc\">\n"
                        + "	<div class=\"col-xs-9 col-sm-9 col-md-10 col-lg-10\" style=\"position:relative;\">\n"
                        + "		<p style=\"font-weight:normal; line-height:20px\">\n"
                        + "					<b>Kh??ng t??m th???y sinh vi??n!</b></p>\n"
                        +"<p>Vui l??ng ki???m tra l???i m?? sinh vi??n ho???c th???c hi???n ????ng k?? th??ng tin c?? nh??n <a href=\"register-infor-student.jsp\">T???i ????y</a></p>"
                        + "	</div>\n"
                        + "</div>");
            } else if(stt) {
                out.print("<div class=\"page_sub_header cfix row\">\n"
                        + "    <div class=\"col-xs-3 col-sm-3 col-md-2 col-lg-2\" style=\"position:relative;\">\n"
                        + "				<img src=\"" + anh + "\" class=\"img-thumbnail\">\n"
                        + "		</div>\n"
                        + "	\n"
                        + "	<div class=\"col-xs-9 col-sm-9 col-md-10 col-lg-10\" style=\"position:relative;\">\n"
                        + "		<p style=\"font-weight:normal; line-height:20px\">\n"
                        + "					<b>M?? sinh vi??n:</b>" + masv + "<br>\n"
                        + "			<b>H??? v?? t??n:</b>" + hoten + "<br>\n"
                        + "			<b>Ng??y sinh </b>" + ngaysinh + "<br>\n"
                        + "			<b>Gi???i t??nh:</b>" + gioitinh + "<br>\n"
                        + "		L???p:" + lop + "<br>Ng??nh:" + nganh + "<br></p>\n"
                        + "	</div>\n"
                        + "</div>");
                
                out.print("<div class=\"center\" style=\"margin: 10 auto; width: 100%\">\r\n"
                		+ "  <form action=\"./registerRoom\" method=\"post\">\r\n"
                		+ "    <div class=\"container\">\r\n"
                		+ "      <div class=\"row\">\r\n"
                		+ "        <div class=\"col-lg-12 mx-auto\">\r\n"
                		+ "          <div class=\"card mt-2 mx-auto p-4\" style=\"border: none\">\r\n"
                		+ "            <div class=\"card-body\">\r\n"
                		+ "              <div class=\"container\">\r\n"
                		+ "                <div class=\"controls\">\r\n"
                		+ "                  <h5>I. Th??ng tin ????ng k??</h5>\r\n"
                		+ "				<hr style=\"border: 1px dotted gray\">\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"hocki\">H???c k???: <span>*</span></label>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <select\r\n"
                		+ "                          id=\"hocki\"\r\n"
                		+ "                          name=\"hocki\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                          required=\"required\"\r\n"
                		+ "                        >\r\n"
                		+ "                          <option value=\"N??m h???c 2021-2022: H???c k??? 2\" selected>\r\n"
                		+ "                            N??m h???c 2021-2022: H???c k??? 2\r\n"
                		+ "                          </option>\r\n"
                		+ "                          <option value=\"N??m h???c 2022-2023: H???c k??? 1\">N??m h???c 2022-2023: H???c k??? 1</option>\r\n"
                		+ "                        </select>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"masv\">M?? sinh vi??n: <span>*</span></label>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <input\r\n"
                		+ "                          type=\"text\"\r\n"
                		+ "                          name=\"masv\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                          id=\"masv\"\r\n"
                		+ "                           value=\""+masv+"\""
                		+ "                           readonly"
                		+ "                        />\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"phong\">Ph??ng mong mu???n <span></span></label>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <input\r\n"
                		+ "                          placeholder=\"Ph??ng mong mu???n ???\"\r\n"
                		+ "                          type=\"text\"\r\n"
                		+ "                          name=\"phong\"\r\n"
                		+ "                          id=\"phong\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+"							 required=\"required\""		
                		+ "                        />\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"ngaybatdau\"\r\n"
                		+ "                          >Th???i gian v??o: <span><span>*</span></span></label\r\n"
                		+ "                        >\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "													<input type=\"date\" name=\"ngaybatdau\"\r\n"
                		+ "														placeholder=\"dd-mm-yyyy\" value=\"\"\r\n"
                		+ "		min=\"1997-01-01\" max=\"2030-12-31\" class=\"form-control\"\r\n"
                		+ "														id=\"ngaybatdau\" required=\"required\" />\r\n"
                		+ "												</div>"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"ngayketthuc\"\r\n"
                		+ "                          >Th???i gian ra: <span><span>*</span></span></label\r\n"
                		+ "                        >\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "													<input type=\"date\" name=\"ngayketthuc\"\r\n"
                		+ "														placeholder=\"dd-mm-yyyy\" class=\"form-control\"\r\n"
                		+ "														id=\"ngayketthuc\" required=\\\"required\\\" />\r\n"
                		+ "												</div>"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"loaiphong\">Lo???i ph??ng <span>*</span></label>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <select\r\n"
                		+ "                          id=\"loaiphong\"\r\n"
                		+ "                          name=\"loaiphong\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                          required=\"required\"\r\n"
                		+ "                        >\r\n"
                		+ "                          <option value=\"\" selected disabled>\r\n"
                		+ "                            --Ch???n lo???i ph??ng\r\n"
                		+ "                          </option>\r\n"
                		+ "                          <option value=\"Ph??ng th?????ng (8 gi?????ng)\" class=\"form-control\" id=\"loaiphong\">\r\n"
                		+ "                            Ph??ng th?????ng (8 gi?????ng)\r\n"
                		+ "                          </option>\r\n"
                		+ "                          <option value=\"Ph??ng d???ch v??? (3 gi?????ng)\" class=\"form-control\" id=\"loaiphong\">\r\n"
                		+ "                            Ph??ng d???ch v??? (3 gi?????ng)\r\n"
                		+ "                          </option>\r\n"
                		+ "                          <option value=\"Ph??ng CBGV\" class=\"form-control\" id=\"loaiphong\">\r\n"
                		+ "                            Ph??ng CBGV\r\n"
                		+ "                          </option>\r\n"
                		+ "                        </select>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"phongcu\">Ph??ng ???? ???: <span></span></label>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <input\r\n"
                		+ "                          placeholder=\"Ph??ng ???? ??? h???c k??? tr?????c (n???u c??)\"\r\n"
                		+ "                          type=\"text\"\r\n"
                		+ "                          name=\"phongcu\"\r\n"
                		+ "                          id=\"phongcu\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                        />\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"dienuutien\"\r\n"
                		+ "                          >Di???n ??u ti??n: <span></span></label\r\n"
                		+ "                        >\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <input\r\n"
                		+ "                          type=\"text\"\r\n"
                		+ "                          name=\"dienuutien\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                          placeholder=\"Di???n ??u ti??n (n???u c??): Con th????ng/b???nh binh, Th??? khoa ?????u v??o, H???c sinh gi???i c??c c???p,...\"\r\n"
                		+ "                          id=\"dienuutien\"\r\n"
                		+ "                        />\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <label for=\"banocung\"\r\n"
                		+ "                          >Ch???n b???n ??? c??ng: <span></span></label\r\n"
                		+ "                        >\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <input\r\n"
                		+ "                          placeholder=\"Nh???p m?? sinh vi??n b???n ??? c??ng\"\r\n"
                		+ "                          type=\"text\"\r\n"
                		+ "                          name=\"banocung\"\r\n"
                		+ "                          class=\"form-control\"\r\n"
                		+ "                          id=\"banocung\"\r\n"
                		+ "                        />\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\"></div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <button type =\"button\" id=\"checkpayment\" onclick=\"showPayment()\" class=\"btn btn-danger\">\r\n"
                		+ "                          <i class=\"fa-solid fa-coins\"></i> Ki???m tra c??c kho???n\r\n"
                		+ "                          thanh to??n\r\n"
                		+ "                        </button>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <h5>II. C??c kho???n ph???i thanh to??n</h5>\r\n"
                		+ "										<hr style=\"border: 1px dotted gray\">\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-12\">\r\n"
                		+ "                      <div class=\"form-group\">\r\n"
                		+ "                        <table class=\"table\">\r\n"
                		+ "                          <thead class=\"thead-dark\">\r\n"
                		+ "                            <tr>\r\n"
                		+ "                              <th scope=\"col\">Kho???n ph??</th>\r\n"
                		+ "                              <th scope=\"col\">????n gi??</th>\r\n"
                		+ "                              <th scope=\"col\" rowspan=\"3\">Th???i gian ???</th>"
                		+ "                              <th scope=\"col\">Th??nh ti???n</th>\r\n"
                		+ "                              <th scope=\"col\">???? thanh to??n</th>\r\n"
                		+ "                              <th scope=\"col\">C??n l???i</th>\r\n"
                		+ "                            </tr>\r\n"
                		+ "                          </thead>\r\n"
                		+ "                          <tbody id=\"payment\">\r\n"
                		+ "                          </tbody>\r\n"
                		+ "                        </table>\r\n"
                		+ "                      </div>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                  <h5>III. X??c nh???n</h5>\r\n"
                		+ "										<hr style=\"border: 1px dotted gray\">\r\n"
                		+ "                  <div class=\"row\">\r\n"
                		+ "                    <div class=\"col-md-2\"></div>\r\n"
                		+ "                    <div class=\"col-md-10\">\r\n"
                		+ "                      <button type=\"submit\" class=\"btn btn-success\">\r\n"
                		+ "                        <i class=\"fa-solid fa-circle-check\"></i> ????ng k??\r\n"
                		+ "                      </button>\r\n"
                		+ "                      <button type=\"reset\" class=\"btn btn-default\">\r\n"
                		+ "                        <i class=\"fa-solid fa-rotate-right\"></i> Vi???t l???i\r\n"
                		+ "                      </button>\r\n"
                		+ "                    </div>\r\n"
                		+ "                  </div>\r\n"
                		+ "                </div>\r\n"
                		+ "              </div>\r\n"
                		+ "            </div>\r\n"
                		+ "          </div>\r\n"
                		+ "          <!-- /.8 -->\r\n"
                		+ "        </div>\r\n"
                		+ "        <!-- /.row-->\r\n"
                		+ "      </div>\r\n"
                		+ "    </div>\r\n"
                		+ "  </form>\r\n"
                		+ "</div>\r\n"
                		+"<script>\r\n"
                		+ "$(function () {\r\n"
                		+ "    $(\"#datepicker1\").datepicker({\r\n"
                		+ "        dateFormat: \"dd/mm/yy\",\r\n"
                		+ "      });\r\n"
                		+ "    $(\"#datepicker2\").datepicker({\r\n"
                		+ "      dateFormat: \"dd/mm/yy\",\r\n"
                		+ "    });\r\n"
                		+ "  };\r\n"
                		+ "\r\n"
                		+ " </script>"
                		+ "");
                
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
