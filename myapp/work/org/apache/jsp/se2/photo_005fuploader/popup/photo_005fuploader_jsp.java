/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2025-03-26 06:21:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.se2.photo_005fuploader.popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.util.*;
import java.io.*;

public final class photo_005fuploader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(7);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("com.oreilly.servlet.multipart.DefaultFileRenamePolicy");
    _jspx_imports_classes.add("com.oreilly.servlet.MultipartRequest");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* NHN Web Standard 1Team JJS 120106 */ \r\n");
      out.write("/* Common */\r\n");
      out.write("body,p,h1,h2,h3,h4,h5,h6,ul,ol,li,dl,dt,dd,table,th,td,form,fieldset,legend,input,textarea,button,select{margin:0;padding:0}\r\n");
      out.write("body,input,textarea,select,button,table{font-family:'돋움',Dotum,Helvetica,sans-serif;font-size:12px}\r\n");
      out.write("img,fieldset{border:0}\r\n");
      out.write("ul,ol{list-style:none}\r\n");
      out.write("em,address{font-style:normal}\r\n");
      out.write("a{text-decoration:none}\r\n");
      out.write("a:hover,a:active,a:focus{text-decoration:underline}\r\n");
      out.write("\r\n");
      out.write("/* Contents */\r\n");
      out.write(".blind{visibility:hidden;position:absolute;line-height:0}\r\n");
      out.write("#pop_wrap{width:383px}\r\n");
      out.write("#pop_header{height:26px;padding:14px 0 0 20px;border-bottom:1px solid #ededeb;background:#f4f4f3}\r\n");
      out.write(".pop_container{padding:11px 20px 0}\r\n");
      out.write("#pop_footer{margin:21px 20px 0;padding:10px 0 16px;border-top:1px solid #e5e5e5;text-align:center}\r\n");
      out.write("h1{color:#333;font-size:14px;letter-spacing:-1px}\r\n");
      out.write(".btn_area{word-spacing:2px}\r\n");
      out.write(".pop_container .drag_area{overflow:hidden;overflow-y:auto;position:relative;width:341px;height:129px;margin-top:4px;border:1px solid #eceff2}\r\n");
      out.write(".pop_container .drag_area .bg{display:block;position:absolute;top:0;left:0;width:341px;height:129px;background:#fdfdfd url(../../img/photoQuickPopup/bg_drag_image.png) 0 0 no-repeat}\r\n");
      out.write(".pop_container .nobg{background:none}\r\n");
      out.write(".pop_container .bar{color:#e0e0e0}\r\n");
      out.write(".pop_container .lst_type li{overflow:hidden;position:relative;padding:7px 0 6px 8px;border-bottom:1px solid #f4f4f4;vertical-align:top}\r\n");
      out.write(".pop_container :root .lst_type li{padding:6px 0 5px 8px}\r\n");
      out.write(".pop_container .lst_type li span{float:left;color:#222}\r\n");
      out.write(".pop_container .lst_type li em{float:right;margin-top:1px;padding-right:22px;color:#a1a1a1;font-size:11px}\r\n");
      out.write(".pop_container .lst_type li a{position:absolute;top:6px;right:5px}\r\n");
      out.write(".pop_container .dsc{margin-top:6px;color:#666;line-height:18px}\r\n");
      out.write(".pop_container .dsc_v1{margin-top:12px}\r\n");
      out.write(".pop_container .dsc em{color:#13b72a}\r\n");
      out.write(".pop_container2{padding:46px 60px 20px}\r\n");
      out.write(".pop_container2 .dsc{margin-top:6px;color:#666;line-height:18px}\r\n");
      out.write(".pop_container2 .dsc strong{color:#13b72a}\r\n");
      out.write(".upload{margin:0 4px 0 0;_margin:0;padding:6px 0 4px 6px;border:solid 1px #d5d5d5;color:#a1a1a1;font-size:12px;border-right-color:#efefef;border-bottom-color:#efefef;length:300px;}\r\n");
      out.write(":root  .upload{padding:6px 0 2px 6px;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function fn_imageUp() {\r\n");
      out.write("		var _formV = document.editor_upimage.Filedata;\r\n");
      out.write("		if(_formV.value == \"\" || _formV.value == null){\r\n");
      out.write("			alert(\"사진을 선택해주세요.\");\r\n");
      out.write("		}else{\r\n");
      out.write("			document.editor_upimage.submit();\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	function fn_imageUp5() {\r\n");
      out.write("		var _formV = document.editor_upimage5.Filedata;\r\n");
      out.write("		if(_formV.value == \"\" || _formV.value == null){\r\n");
      out.write("			alert(\"사진을 선택해주세요.\");\r\n");
      out.write("		}else{\r\n");
      out.write("			document.editor_upimage5.submit();\r\n");
      out.write("		}\r\n");
      out.write("	}	\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"pop_wrap\">\r\n");
      out.write("	<!-- header -->\r\n");
      out.write("    <div id=\"pop_header\">\r\n");
      out.write("        <h1>사진 첨부하기</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- //header -->\r\n");
      out.write("    <!-- container -->\r\n");
      out.write("	\r\n");
      out.write("    <!-- [D] HTML5인 경우 pop_container 클래스와 하위 HTML 적용 그밖의 경우 pop_container2 클래스와 하위 HTML 적용      -->\r\n");
      out.write("	<div id=\"pop_container2\" class=\"pop_container2\">    	\r\n");
      out.write("    	<!-- content -->\r\n");
      out.write("		<form id=\"editor_upimage\" name=\"editor_upimage\" action=\"file_uploader.jsp\" method=\"post\" enctype=\"multipart/form-data\" onSubmit=\"return false;\">\r\n");
      out.write("        <div id=\"pop_content2\">\r\n");
      out.write("			<input type=\"file\" class=\"upload\" id=\"uploadInputBox\" name=\"Filedata\">\r\n");
      out.write("            <p class=\"dsc\" id=\"info\"><strong>10MB</strong>이하의 이미지 파일만 등록할 수 있습니다.<br>(JPG, GIF, PNG, BMP)</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("		<div id=\"pop_footer\">\r\n");
      out.write("		    <div class=\"btn_area\">\r\n");
      out.write("	            <a href=\"javascript:fn_imageUp();\">\r\n");
      out.write("	            <img src=\"../../img/photoQuickPopup/btn_confirm.png\" width=\"49\" height=\"28\" alt=\"확인\"></a>\r\n");
      out.write("	            <a href=\"#\"><img src=\"../../img/photoQuickPopup/btn_cancel.png\" width=\"48\" height=\"28\" alt=\"취소\" id=\"btn_cancel\"></a>\r\n");
      out.write("	        </div>\r\n");
      out.write("    	</div>\r\n");
      out.write("        <!-- //content -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"pop_container\" class=\"pop_container\" style=\"display:none;\">\r\n");
      out.write("    	<!-- content -->\r\n");
      out.write("        <!-- <div id=\"pop_content\">\r\n");
      out.write("	        <p class=\"dsc\"><em id=\"imageCountTxt\">0장</em>/10장 <span class=\"bar\">|</span> <em id=\"totalSizeTxt\">0MB</em>/50MB</p>\r\n");
      out.write("        	[D] 첨부 이미지 여부에 따른 Class 변화 \r\n");
      out.write("            	 첨부 이미지가 있는 경우 : em에 \"bg\" 클래스 적용 //첨부 이미지가 없는 경우 : em에 \"nobg\" 클래스 적용  \r\n");
      out.write("				 \r\n");
      out.write("            <div class=\"drag_area\" id=\"drag_area\">\r\n");
      out.write("				<ul class=\"lst_type\" >\r\n");
      out.write("				</ul>\r\n");
      out.write("            	<em class=\"blind\">마우스로 드래그해서 이미지를 추가해주세요.</em><span id=\"guide_text\" class=\"bg\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("			<div style=\"display:none;\" id=\"divImageList\"></div>\r\n");
      out.write("            <p class=\"dsc dsc_v1\"><em>한 장당 10MB, 1회에 50MB까지, 10개</em>의 이미지 파일을<br>등록할 수 있습니다. (JPG, GIF, PNG, BMP)</p>\r\n");
      out.write("        </div> -->\r\n");
      out.write("		<form id=\"editor_upimage5\" name=\"editor_upimage5\" action=\"file_uploader.jsp\" method=\"post\" enctype=\"multipart/form-data\" onSubmit=\"return false;\">\r\n");
      out.write("        <div id=\"pop_content2\">\r\n");
      out.write("			<input type=\"file\" class=\"upload\" id=\"uploadInputBox\" name=\"Filedata\">\r\n");
      out.write("            <p class=\"dsc\" id=\"info\"><strong>10MB</strong>이하의 이미지 파일만 등록할 수 있습니다.<br>(JPG, GIF, PNG, BMP)</p>\r\n");
      out.write("        </div>\r\n");
      out.write("		</form>\r\n");
      out.write("		<div id=\"pop_footer\">\r\n");
      out.write("	    <div class=\"btn_area\">\r\n");
      out.write("            <a href=\"javascript:fn_imageUp5();\">\r\n");
      out.write("            <img src=\"../../img/photoQuickPopup/btn_confirm.png\" width=\"49\" height=\"28\" alt=\"확인\" id=\"btn_confirm\"></a>\r\n");
      out.write("            <a href=\"#\"><img src=\"../../img/photoQuickPopup/btn_cancel.png\" width=\"48\" height=\"28\" alt=\"취소\" id=\"btn_cancel\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("        <!-- //content -->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- //container -->\r\n");
      out.write("    <!-- footer -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- //footer -->\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"jindo.min.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"jindo.fileuploader.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"attach_photo.js\" charset=\"utf-8\"></script>\r\n");
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
