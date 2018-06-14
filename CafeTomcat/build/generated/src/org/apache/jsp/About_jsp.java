package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/main.css\"> \t\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      dao.DaoUtils dao = null;
      synchronized (_jspx_page_context) {
        dao = (dao.DaoUtils) _jspx_page_context.getAttribute("dao", PageContext.PAGE_SCOPE);
        if (dao == null){
          dao = new dao.DaoUtils();
          _jspx_page_context.setAttribute("dao", dao, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("            <h1>Electronics Online Store</h1>\n");
      out.write("            <h3>Welcome to our website</h3>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"navigation-bar\">\n");
      out.write("            <a href=\"index.jsp\">Home</a><a href=\"About.jsp\">Online Store</a><a href=\"Find.jsp\">Contact</a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("        <div id=\"wrapper\" >\n");
      out.write("\n");
      out.write("        <div class=\"main col-9\">\n");
      out.write("            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${about.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("            <div class=\"about-detail\">\n");
      out.write("                <img class=\"col-6\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${about.imageUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" />\n");
      out.write("                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${about.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"rightmenu col-3\">\n");
      out.write("\n");
      out.write("            <div class=\"rightmenu-item\">\n");
      out.write("            <h3>Share this page</h3>\n");
      out.write("            <p><a href=\"#\" class=\"normal\">Share on Facebook</a></p>\n");
      out.write("            <p><a href=\"#\" class=\"normal\">Share on Twitter</a></p>\n");
      out.write("            <p><a href=\"#\" class=\"normal\">Share on Google+</a></p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("<!--            <hr>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <div class=\"footer-info\">\n");
      out.write("                    <a rel=\"nofollow\" href=\"#\">Created with SimpleSite</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-page-counter\">\n");
      out.write("                    <span class=\"footer-page-counter-item\">0</span>\n");
      out.write("                    <span class=\"footer-page-counter-item\">0</span>\n");
      out.write("                    <span class=\"footer-page-counter-item\">0</span>\n");
      out.write("                    <span class=\"footer-page-counter-item\">0</span>\n");
      out.write("                    <span class=\"footer-page-counter-item\">0</span>\n");
      out.write("                    <span class=\"footer-page-counter-item\">0</span>\n");
      out.write("                </div>\n");
      out.write("            </div>-->\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("about");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dao.getIntro(\"About\")}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
