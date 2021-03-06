package Controller;

import java.awt.Taskbar.State;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAO;

import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import DBConnect.DBContext;
import entity.detailsRoom;
import entity.room;
import entity.student;

/**
 * Servlet implementation class searchSV
 */
@WebServlet("/searchSV")
public class searchSV extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection conn;
    ResultSet rs;
    Statement stmt;
    ResultSet rs1;
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchSV() {
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
        PrintWriter out = response.getWriter();
        //String masv=msv.getMasv();
        String masvsearch = request.getParameter("masv");
        DBContext db = DBContext.getInstance();
        try {
            conn = db.getConnection();
            
            response.setContentType("image/jpg");
            DAO dao = new DAO();
            stmt = conn.createStatement();
            String sql = "SELECT DISTINCT thongtino.maphong, thongtino.ngayvao, thongtino.ngayra, room.tiendien FROM `studentinfor` , `thongtino`, `room` WHERE studentinfor.masv='"+masvsearch+"' and studentinfor.masv=thongtino.masv and  room.maphong=thongtino.maphong";
            rs1=stmt.executeQuery(sql);
            rs = dao.searchSV(masvsearch);
            String masv = "";
            String hoten = "";
            String anh = "";
            String ngaysinh = "";
            int gt=0;
            String gioitinh = "";
            String lop = "";
            String nganh = "";
            String truong = "";
			String maphong ="";
			String ngayvao ="";
			String ngayra ="";
			double tiendien =0;
            while (rs.next()) {
                masv = rs.getString("masv");
                anh = rs.getString("anh");
                hoten = rs.getString("hoten");
                ngaysinh = rs.getString("ngaysinh");
                gt = rs.getInt("gioitinh");
                nganh = rs.getString("nganh");
                truong = rs.getString("truong");
                lop = rs.getString("lop");
            }
            while (rs1.next()) {
            	maphong = rs1.getString(1);
                ngayvao = rs1.getString(2);
                ngayra= rs1.getString(3);
                tiendien = rs1.getDouble(4);
                }
            if (gt==1) {
				gioitinh="Nam";
			} else {
				gioitinh="N???";
			}
            List<detailsRoom> list = new ArrayList<>();
            list.add(new detailsRoom(maphong));
            request.setAttribute("listR", list);
            //request.getRequestDispatcher("admin.jsp").forward(request, response);
//            student std = new student();
//            std.setMasv(masv);
//            std.setTen(hoten);
//            std.setNgaysinh(ngaysinh);
//            std.setGioitinh(gioitinh);
//            std.setLop(lop);
//            std.setNganh(nganh);
//            std.setTruong(truong);
//            std.setCMND(cmnd);
//            std.setSdtCanhan(sdtSV);
//            std.setSdtGiadinh(sdtPH);
//            std.setDiachi(diachi);
//            std.setEmail(email);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/YYYY");  
            LocalDateTime now = LocalDateTime.now();  
			boolean stt= (masvsearch.trim().toLowerCase().equals(masv.trim().toLowerCase()));
			System.out.println(masvsearch.trim().toLowerCase());
			System.out.println(masv.trim().toLowerCase());
			System.out.println(stt);
            if (!stt) {
                out.print("<div class=\"cc\" id=\"cc\">\n"
                        + "	<div class=\"col-xs-9 col-sm-9 col-md-10 col-lg-10\" style=\"position:relative;\">\n"
                        + "		<p style=\"font-weight:normal; line-height:20px\">\n"
                        + "					<b>Kh??ng t??m th???y sinh vi??n!</b></p>\n"
                        +"<p>Vui l??ng ki???m tra l???i m?? sinh vi??n ho???c th???c hi???n ????ng k?? th??ng tin c?? nh??n <a href=\"register-infor-student.jsp\">T???i ????y</a></p>"
                        + "	</div>\n"
                        + "</div>");
            } else if(stt) {
//                o.write(imgData);
//                o.flush();
//                o.close();
                out.print("<div class=\"page_sub_header cfix row\">\n"
                        + "    <div class=\"col-xs-3 col-sm-3 col-md-2 col-lg-2\" style=\"position:relative;\">\n"
                		//+"<a href=\"#\" onclick=\"viewImg()\">Xem ???nh</a>"
                        + "				<img src=\"" + anh + "\" class=\"img-thumbnail\">\n"
                        + "		</div>\n"
                        + "	\n"
                        + "	<div class=\"col-xs-9 col-sm-9 col-md-10 col-lg-10\" style=\"position:relative;\">\n"
                        + "		<p style=\"font-weight:normal; line-height:20px\">\n"
                        + "					<b>M?? sinh vi??n:</b>" + masv + "<br>\n"
                        + "			<b>H??? v?? t??n:</b>" + hoten + "<br>\n"
                        + "			<b>Ng??y sinh </b>" + ngaysinh + "<br>\n"
                        + "			<b>Gi???i t??nh:</b>" + gioitinh + "<br>\n"
                        + "		<b>L???p: </b>"  + lop + "<br> <b> Ng??nh: </b>" + nganh + "<br></p>\n"	
                        + "	</div>\n"
                        + "</div>");  
                out.print("<fieldset>\r\n"
                		+ "	\r\n"
                		+ "			<h4>Th??ng tin ph??ng ???:</h4>\r\n"
                		+ "		<div id=\"list_debt_roomfee2\" class=\"table-responsive\">\r\n"
                		+ "			<table class=\"table table-bordered table-striped table-hover\">\r\n"
                		+ "				<thead>\r\n"
                		+ "					<tr>\r\n"
                		+ "						<th class=\"text-center\">\r\n"
                		+ "							Ph??ng\r\n"
                		+ "						</th>\r\n"
                		+ "						<th class=\"text-center\">\r\n"
                		+ "							Th??ng\r\n"
                		+ "						</th>\r\n"
                		+ "						<th class=\"text-center\">\r\n"
                		+ "							T???ng ti???n\r\n"
                		+ "						</th>\r\n"
                		+ "					</tr>\r\n"
                		+ "				</thead>\r\n"
                		+ "			\r\n"
                		+ "				<tbody>\r\n"
                		+ "									<tr>\r\n"
                		+ "						<td>\r\n"
                		+"<h3 style=\"font-size:revert\"><a href=\"#\" id=\"room\" data-toggle=\"modal\" data-target=\"#modalRoomInfor\" onclick=\"showRoomDetail()\">"+maphong+"</a></h3>"
                		+ "						</td>\r\n"
                		+ "						<td>\r\n"
                		+ "							"+dtf.format(now)+"					</td>\r\n"
                		+ "						<td>\r\n"
                		+ "							"+tiendien+"&nbsp;???						</td>\r\n"
                		+ "					</tr>\r\n"
                		+ "								</tbody>\r\n"
                		+ "			</table>\r\n"
                		+ "		</div>\r\n"
                		+ "	\r\n"
                		+ "	\r\n"
                		+ "			\r\n"
                		+ "		<!-- <div class=\"table-responsive\">\r\n"
                		+ "			<table class=\"table table-bordered table-striped table-hover\">\r\n"
                		+ "				<thead>\r\n"
                		+ "					<tr>\r\n"
                		+ "						<th class=\"text-center\" colspan=\"3\">\r\n"
                		+ "							T???ng c???ng\r\n"
                		+ "						</th>\r\n"
                		+ "						<th class=\"text-center\">\r\n"
                		+ "							0&nbsp;???						</th>\r\n"
                		+ "						<th class=\"text-center\">\r\n"
                		+ "							0&nbsp;???						</th>\r\n"
                		+ "						<th class=\"text-center\">\r\n"
                		+ "							0&nbsp;???						</th>\r\n"
                		+ "					</tr>\r\n"
                		+ "				</thead>\r\n"
                		+ "			</table>\r\n"
                		+ "		</div> -->\r\n"
                		+ "		\r\n"
                		+ "	</fieldset>");
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
