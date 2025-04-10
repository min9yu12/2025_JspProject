/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2025-03-17 08:43:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.guestbook;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import guestbook.GuestBookBean;
import guestbook.MUtil;

public final class updateGuestBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("guestbook.GuestBookBean");
    _jspx_imports_classes.add("guestbook.MUtil");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write("<!-- updateGuestBook.jsp -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      guestbook.JoinBean login = null;
      synchronized (session) {
        login = (guestbook.JoinBean) _jspx_page_context.getAttribute("login", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (login == null){
          login = new guestbook.JoinBean();
          _jspx_page_context.setAttribute("login", login, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      guestbook.GuestBookMgr mgr = null;
      mgr = (guestbook.GuestBookMgr) _jspx_page_context.getAttribute("mgr", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (mgr == null){
        mgr = new guestbook.GuestBookMgr();
        _jspx_page_context.setAttribute("mgr", mgr, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');

		int num = 0;
		GuestBookBean bean = null;
		if(request.getParameter("num")!=null){
			num = MUtil.parseInt(request, "num");
			bean = mgr.getGuestBook(num);
		}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>GuestBook</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div align=\"center\">\r\n");
      out.write("		<table width=\"500\" cellspacing=\"0\" cellpadding=\"3\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td bgcolor=\"#F5F5F5\"><font size=\"4\"><b>글수정하기</b></font></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<form method=\"post\" action=\"updateGuestBookProc.jsp?num=");
      out.print(num);
      out.write("\">\r\n");
      out.write("			<table width=\"520\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>\r\n");
      out.write("						<table>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td height=\"40\" align=\"center\">\r\n");
      out.write("									<img src=\"img/face.bmp\" border=\"0\" alt=\"성명\"> \r\n");
      out.write("									<input name=\"name\" size=\"9\" value=\"");
      out.print(login.getName());
      out.write("\" readonly> \r\n");
      out.write("									<img src=\"img/email.bmp\" border=\"0\" alt=\"메일\"> \r\n");
      out.write("									<input name=\"email\" size=\"20\" value=\"");
      out.print(login.getEmail());
      out.write("\"> \r\n");
      out.write("									<img src=\"img/hp.bmp\" border=\"0\" alt=\"홈페이지\"> \r\n");
      out.write("									<input title=\"홈페이지도 있으면 알려주시어요\" name=\"hp\" size=\"20\" value=\"");
      out.print(login.getHp());
      out.write("\">\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td align=\"center\">\r\n");
      out.write("									<textarea name=\"contents\" cols=\"60\" \r\n");
      out.write("									rows=\"6\">");
      out.print(bean.getContents());
      out.write("</textarea>\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td width=\"500\" height=\"30\" colspan=\"3\" align=\"center\">\r\n");
      out.write("								<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\">\r\n");
      out.write("								<input type=\"hidden\" name=\"ip\" value=\"");
      out.print(request.getRemoteAddr());
      out.write("\">\r\n");
      out.write("								<input type=\"submit\" value=\"글수정\"> \r\n");
      out.write("								<input type=\"reset\" value=\"고치기\"> \r\n");
      out.write("								<input type=\"checkbox\" name=\"secret\" value=\"1\"\r\n");
      out.write("									");
      out.print(bean.getSecret().equals("1")?"checked":"" );
      out.write("> 비밀글\r\n");
      out.write("								</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</table>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
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
