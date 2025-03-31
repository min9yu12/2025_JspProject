/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2025-03-24 02:50:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch16;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import ch16.PollItemBean;
import ch16.PollListBean;
import ch16.MUtil;

public final class pollForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(6);
    _jspx_imports_classes.add("java.util.Vector");
    _jspx_imports_classes.add("ch16.PollListBean");
    _jspx_imports_classes.add("ch16.PollItemBean");
    _jspx_imports_classes.add("ch16.MUtil");
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

      out.write("<!-- pollForm.jsp -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      ch16.PollMgr mgr = null;
      mgr = (ch16.PollMgr) _jspx_page_context.getAttribute("mgr", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (mgr == null){
        mgr = new ch16.PollMgr();
        _jspx_page_context.setAttribute("mgr", mgr, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');

		int num = 0;
		if(request.getParameter("num")!=null){
			num = MUtil.parseInt(request, "num");
		}
		PollListBean plBean = mgr.getPoll(num);
		Vector<String> vItem = mgr.getItemList(num);
		String question = plBean.getQuestion();
		int type = plBean.getType();
		int active = plBean.getActive();
		int sumCount = mgr.sumCount(num);//총투표수 

      out.write("\r\n");
      out.write("<form action=\"pollFormProc.jsp\"> \r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan=\"2\" width=\"300\">\r\n");
      out.write("			Q : ");
      out.print(question);
      out.write(" <font color=\"blue\">\r\n");
      out.write("			(");
      out.print(MUtil.intFormat(sumCount));
      out.write(")</font>\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan=\"2\">\r\n");
      out.write("		");

				for(int i=0;i<vItem.size();i++){
					String item = vItem.get(i);
		
      out.write("\r\n");
      out.write("		");
if(type==1){ 
      out.write("\r\n");
      out.write("			<input type=\"checkbox\" name=\"itemnum\" value=\"");
      out.print(i);
      out.write("\">\r\n");
      out.write("		");
}else if(type==0){ 
      out.write("\r\n");
      out.write("			<input type=\"radio\" name=\"itemnum\" value=\"");
      out.print(i);
      out.write("\">\r\n");
      out.write("		");
}//--if-else 
      out.write("\r\n");
      out.write("		");
      out.print(item);
      out.write("<br>\r\n");
      out.write("		");
}//--for
      out.write("\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td width=\"150\">\r\n");
      out.write("		");
if(active==1){ 
      out.write("\r\n");
      out.write("			<input type=\"submit\" value=\"투표\">\r\n");
      out.write("		");
}else{ 
      out.write("\r\n");
      out.write("			투표종료\r\n");
      out.write("		");
} 
      out.write("\r\n");
      out.write("		</td>\r\n");
      out.write("		<td>\r\n");
      out.write("			<input type=\"button\" value=\"결과\" \r\n");
      out.write("			onclick=\"javascript:window.open('pollView.jsp?num=");
      out.print(num);
      out.write("'\r\n");
      out.write("			,'pollView','width=500, height=350')\">\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("</table>	\r\n");
      out.write("<input type=\"hidden\" name=\"num\" value=\"");
      out.print(num);
      out.write("\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
