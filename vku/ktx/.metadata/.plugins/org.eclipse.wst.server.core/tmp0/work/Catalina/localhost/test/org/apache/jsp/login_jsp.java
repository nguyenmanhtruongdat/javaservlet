/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2022-07-07 18:39:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\r\n");
      out.write("<title>????ng nh???p h??? th???ng</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=stylesheet href=\"css/aos.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"./favicons/favicon.ico\">\r\n");
      out.write("<link rel=\"./faviconsapple-touch-icon\" sizes=\"180x180\"\r\n");
      out.write("	href=\"./favicons/apple-touch-icon.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\"\r\n");
      out.write("	href=\"./favicons/favicon-32x32.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\"\r\n");
      out.write("	href=\"./favicons/favicon-16x16.png\">\r\n");
      out.write("<style>\r\n");
      out.write("/* LOGIN FORM */\r\n");
      out.write("html {\r\n");
      out.write("	color: #000000;\r\n");
      out.write("	font-size: 12px;\r\n");
      out.write("	font-family: \"Helvetica Neue\", Arial, sans-serif;\r\n");
      out.write("	background-color: #f9f9f9\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, code,\r\n");
      out.write("	form, fieldset, legend, input, textarea, p, blockquote, th, td {\r\n");
      out.write("	margin: 0px;\r\n");
      out.write("	padding: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("	height: 100vh;\r\n");
      out.write("	mix-blend-mode: normal;\r\n");
      out.write("	background-position: 50% 0%;\r\n");
      out.write("	background-attachment: scroll;\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("	background-image: url(images/background.jpg);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form .vku_logo {\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".vku_logo img {\r\n");
      out.write("	width: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".imgcontainer {\r\n");
      out.write("	margin: 15px 0;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img.logo {\r\n");
      out.write("	width: 30%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_page {\r\n");
      out.write("	width: 400px;\r\n");
      out.write("	padding: 10% 0 0;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.login {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.login {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.login:hover, button.login:hover {\r\n");
      out.write("	opacity: 0.8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fa-solid {\r\n");
      out.write("	margin: 5px 5px 0 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form {\r\n");
      out.write("	/*  width: 500px;\r\n");
      out.write("  margin: 30px auto;*/\r\n");
      out.write("	z-index: 1;\r\n");
      out.write("	max-width: 400px;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	background: #ffffff;\r\n");
      out.write("	-moz-border-radius: 5px;\r\n");
      out.write("	-webkit-border-radius: 5px;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	box-shadow: 0px 0px 4px rgba(0, 0, 0, 0.7);\r\n");
      out.write("	-webkit-box-shadow: 0 0 4px rgba(0, 0, 0, 0.7);\r\n");
      out.write("	-moz-box-shadow: 0 0px 4px rgba(0, 0, 0, 0.7);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form div.error {\r\n");
      out.write("	margin: 20px 30px;\r\n");
      out.write("	margin: 10px 15px;\r\n");
      out.write("	background: red;\r\n");
      out.write("	color: white;\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form .header {\r\n");
      out.write("	background: url(../img/login_bg_header.png) #A90092;\r\n");
      out.write("	padding: 9px 9px 7px 9px;\r\n");
      out.write("	border-bottom: 1px solid #cccccc;\r\n");
      out.write("	border-top-left-radius: 5px;\r\n");
      out.write("	-moz-border-radius-topleft: 5px;\r\n");
      out.write("	-webkit-border-top-left-radius: 5px;\r\n");
      out.write("	border-top-right-radius: 5px;\r\n");
      out.write("	-moz-border-radius-topright: 5px;\r\n");
      out.write("	-webkit-border-top-right-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form .header h2 {\r\n");
      out.write("	color: #444444;\r\n");
      out.write("	color: #FFFFFF;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	margin-bottom: 3px;\r\n");
      out.write("	/*  text-shadow: 1px 1px 0 rgba(255, 255, 255, 0.5);*/\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form .header p {\r\n");
      out.write("	color: #444444;\r\n");
      out.write("	color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form .txt-fld {\r\n");
      out.write("	width: 360px;\r\n");
      out.write("	padding: 15px 20px;\r\n");
      out.write("	border-bottom: 1px solid #eeeeee;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form .btn-fld {\r\n");
      out.write("	width: 250px;\r\n");
      out.write("	overflow: hidden;\r\n");
      out.write("	padding: 12px 20px 12px 130px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form .txt-fld label {\r\n");
      out.write("	display: block;\r\n");
      out.write("	float: left;\r\n");
      out.write("	width: 100px;\r\n");
      out.write("	padding-top: 5px;\r\n");
      out.write("	color: #222;\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form .txt-fld input {\r\n");
      out.write("	width: 248px;\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("	border-radius: 4px;\r\n");
      out.write("	-moz-border-radius: 4px;\r\n");
      out.write("	-webkit-border-radius: 4px;\r\n");
      out.write("	color: #222222;\r\n");
      out.write("	background: #f7f7f7;\r\n");
      out.write("	outline: none;\r\n");
      out.write("	border-top: 1px solid #cccccc;\r\n");
      out.write("	border-left: 1px solid #cccccc;\r\n");
      out.write("	border-right: 1px solid #e7e6e6;\r\n");
      out.write("	border-bottom: 1px solid #e7e6e6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login_form .btn-fld button {\r\n");
      out.write("	float: right;\r\n");
      out.write("	background: #3f9d4a;\r\n");
      out.write("	border: none;\r\n");
      out.write("	width: auto;\r\n");
      out.write("	overflow: visible;\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("	color: #ffffff;\r\n");
      out.write("	padding: 7px 10px;\r\n");
      out.write("	border-radius: 4px;\r\n");
      out.write("	-webkit-border-radius: 4px;\r\n");
      out.write("	-moz-border-radius: 4px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	text-shadow: 0 1px 0 rgba(0, 0, 0, 0.4);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span {\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	margin-bottom: 5px;\r\n");
      out.write("	color: black !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	height: 33px !important;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	height: 45px;\r\n");
      out.write("	border: none;\r\n");
      out.write("	background-size: 300% 100%;\r\n");
      out.write("	border-radius: 0px;\r\n");
      out.write("	moz-transition: all .4s ease-in-out;\r\n");
      out.write("	-o-transition: all .4s ease-in-out;\r\n");
      out.write("	-webkit-transition: all .4s ease-in-out;\r\n");
      out.write("	transition: all .4s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:hover {\r\n");
      out.write("	background-position: 100% 0;\r\n");
      out.write("	moz-transition: all .4s ease-in-out;\r\n");
      out.write("	-o-transition: all .4s ease-in-out;\r\n");
      out.write("	-webkit-transition: all .4s ease-in-out;\r\n");
      out.write("	transition: all .4s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:focus {\r\n");
      out.write("	outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("	background-image: linear-gradient(to right, #25aae1, #40e495, #30dd8a, #2bb673);\r\n");
      out.write("	box-shadow: 0 4px 15px 0 rgba(49, 196, 190, 0.75);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".preloading {\r\n");
      out.write("	position: fixed;\r\n");
      out.write("	top: 0;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 100%;\r\n");
      out.write("	background: #ffffff no-repeat center center !important;\r\n");
      out.write("	background-size: 10%;\r\n");
      out.write("	z-index: 9999;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* END LOGIN FORM */\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"preloading\">\r\n");
      out.write("		<img src=\"gif/pre-loader.gif\" alt=\"\"\r\n");
      out.write("			style=\"width: 80px !important; height: auto;\">\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"login_page\">\r\n");
      out.write("		<div class=\"login_form animate\">\r\n");
      out.write("			<div class=\"header\" style=\"text-align: center\">\r\n");
      out.write("				<h2>H??? TH???NG QU???N L?? K?? T??C X??</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("			<p class=\"text-danger\" id=\"danger\" style=\"text-align: center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("			<div class=\"imgcontainer\">\r\n");
      out.write("				<img src=\"images/vku.png\" alt=\"VKU\" class=\"logo\" />\r\n");
      out.write("			</div>\r\n");
      out.write("			<form action=\"./login\" method=\"post\"\r\n");
      out.write("				style=\"justify-content: center; align-items: center; text-align: center; height: 200px\">\r\n");
      out.write("				<input name=\"login\" value=\"ok\" type=\"hidden\" />\r\n");
      out.write("\r\n");
      out.write("				<div class=\"container-fluid\">\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<div class=\"input-group\">\r\n");
      out.write("							<span class=\"input-group-addon\"><i\r\n");
      out.write("								class=\"fa-solid fa-user\"></i></span> <input type=\"text\"\r\n");
      out.write("								class=\"form-control\" placeholder=\"T??n ????ng nh???p\" id=\"login_user\"\r\n");
      out.write("								name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" autocomplete=\"off\"\r\n");
      out.write("								autofocus=\"1\" required />\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<div class=\"input-group\">\r\n");
      out.write("							<span class=\"input-group-addon\"><i class=\"fa-solid fa-key\"></i></span>\r\n");
      out.write("							<input type=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"\r\n");
      out.write("								placeholder=\"M???t kh???u\" id=\"login_pass\" name=\"password\" required />\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- <div class=\"input-group\">\r\n");
      out.write("							<input type=\"checkbox\" class=\"form-control\"\r\n");
      out.write("								placeholder=\"M???t kh???u\" id=\"login_pass\" name=\"password\" required style=\"    box-sizing: border-box;width: 15px !important;font-size: 5px;margin-left: -230px;margin-top: 10px;\"/>Nh??? m???t kh???u\r\n");
      out.write("						</div> -->\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<button type=\"submit\" class=\"login btn btn-success\">????ng\r\n");
      out.write("							nh???p</button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<span>Ho???c</span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<a class=\"login btn btn-success\" href=\"registerAcc.jsp\"\r\n");
      out.write("							style=\"text-decoration: none; color: white !important;\">????ng\r\n");
      out.write("							k??</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
