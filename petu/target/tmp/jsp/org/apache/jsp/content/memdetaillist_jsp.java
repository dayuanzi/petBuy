package org.apache.jsp.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memdetaillist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ss_div_id_href_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ss_a_targets_href;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ss_head_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ss_div_id_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ss_a_targets_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ss_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_ss_div_id_href_nobody.release();
    _jspx_tagPool_ss_a_targets_href.release();
    _jspx_tagPool_ss_head_nobody.release();
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      if (_jspx_meth_ss_head_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      if (_jspx_meth_s_property_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_s_property_1(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_s_property_2(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_s_property_3(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_s_property_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_ss_a_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_ss_a_1(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_ss_a_2(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_ss_a_3(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_ss_div_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_ss_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ss:head
    org.apache.struts2.dojo.views.jsp.ui.HeadTag _jspx_th_ss_head_0 = (org.apache.struts2.dojo.views.jsp.ui.HeadTag) _jspx_tagPool_ss_head_nobody.get(org.apache.struts2.dojo.views.jsp.ui.HeadTag.class);
    _jspx_th_ss_head_0.setPageContext(_jspx_page_context);
    _jspx_th_ss_head_0.setParent(null);
    int _jspx_eval_ss_head_0 = _jspx_th_ss_head_0.doStartTag();
    if (_jspx_th_ss_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ss_head_nobody.reuse(_jspx_th_ss_head_0);
      return true;
    }
    _jspx_tagPool_ss_head_nobody.reuse(_jspx_th_ss_head_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent(null);
    _jspx_th_s_property_0.setValue("cattery.name");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent(null);
    _jspx_th_s_property_1.setValue("cattery.cattpetrank.cattpetrank");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent(null);
    _jspx_th_s_property_2.setValue("cattery.experience");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_property_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent(null);
    _jspx_th_s_property_3.setValue("cattery.mainvariety");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_property_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent(null);
    _jspx_th_s_property_4.setValue("cattery.region.region");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_ss_a_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ss:a
    org.apache.struts2.dojo.views.jsp.ui.AnchorTag _jspx_th_ss_a_0 = (org.apache.struts2.dojo.views.jsp.ui.AnchorTag) _jspx_tagPool_ss_a_targets_href.get(org.apache.struts2.dojo.views.jsp.ui.AnchorTag.class);
    _jspx_th_ss_a_0.setPageContext(_jspx_page_context);
    _jspx_th_ss_a_0.setParent(null);
    _jspx_th_ss_a_0.setHref("MemFollowedAction.do?userid=1&pageNumber=1");
    _jspx_th_ss_a_0.setTargets("divCatList");
    int _jspx_eval_ss_a_0 = _jspx_th_ss_a_0.doStartTag();
    if (_jspx_eval_ss_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ss_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ss_a_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ss_a_0.doInitBody();
      }
      do {
        out.write("我的猫舍");
        int evalDoAfterBody = _jspx_th_ss_a_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ss_a_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_ss_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ss_a_targets_href.reuse(_jspx_th_ss_a_0);
      return true;
    }
    _jspx_tagPool_ss_a_targets_href.reuse(_jspx_th_ss_a_0);
    return false;
  }

  private boolean _jspx_meth_ss_a_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ss:a
    org.apache.struts2.dojo.views.jsp.ui.AnchorTag _jspx_th_ss_a_1 = (org.apache.struts2.dojo.views.jsp.ui.AnchorTag) _jspx_tagPool_ss_a_targets_href.get(org.apache.struts2.dojo.views.jsp.ui.AnchorTag.class);
    _jspx_th_ss_a_1.setPageContext(_jspx_page_context);
    _jspx_th_ss_a_1.setParent(null);
    _jspx_th_ss_a_1.setHref("MemCartAction.do?userid=1&pageNumber=1");
    _jspx_th_ss_a_1.setTargets("divCatList");
    int _jspx_eval_ss_a_1 = _jspx_th_ss_a_1.doStartTag();
    if (_jspx_eval_ss_a_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ss_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ss_a_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ss_a_1.doInitBody();
      }
      do {
        out.write("我的购物车");
        int evalDoAfterBody = _jspx_th_ss_a_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ss_a_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_ss_a_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ss_a_targets_href.reuse(_jspx_th_ss_a_1);
      return true;
    }
    _jspx_tagPool_ss_a_targets_href.reuse(_jspx_th_ss_a_1);
    return false;
  }

  private boolean _jspx_meth_ss_a_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ss:a
    org.apache.struts2.dojo.views.jsp.ui.AnchorTag _jspx_th_ss_a_2 = (org.apache.struts2.dojo.views.jsp.ui.AnchorTag) _jspx_tagPool_ss_a_targets_href.get(org.apache.struts2.dojo.views.jsp.ui.AnchorTag.class);
    _jspx_th_ss_a_2.setPageContext(_jspx_page_context);
    _jspx_th_ss_a_2.setParent(null);
    _jspx_th_ss_a_2.setHref("MemOrderListAction.do?userid=1&pageNumber=1&ispay=0");
    _jspx_th_ss_a_2.setTargets("divCatList");
    int _jspx_eval_ss_a_2 = _jspx_th_ss_a_2.doStartTag();
    if (_jspx_eval_ss_a_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ss_a_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ss_a_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ss_a_2.doInitBody();
      }
      do {
        out.write("我的订单");
        int evalDoAfterBody = _jspx_th_ss_a_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ss_a_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_ss_a_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ss_a_targets_href.reuse(_jspx_th_ss_a_2);
      return true;
    }
    _jspx_tagPool_ss_a_targets_href.reuse(_jspx_th_ss_a_2);
    return false;
  }

  private boolean _jspx_meth_ss_a_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ss:a
    org.apache.struts2.dojo.views.jsp.ui.AnchorTag _jspx_th_ss_a_3 = (org.apache.struts2.dojo.views.jsp.ui.AnchorTag) _jspx_tagPool_ss_a_targets_href.get(org.apache.struts2.dojo.views.jsp.ui.AnchorTag.class);
    _jspx_th_ss_a_3.setPageContext(_jspx_page_context);
    _jspx_th_ss_a_3.setParent(null);
    _jspx_th_ss_a_3.setHref("MemOwnCatsAction.do?userid=1&pageNumber=1");
    _jspx_th_ss_a_3.setTargets("divCatList");
    int _jspx_eval_ss_a_3 = _jspx_th_ss_a_3.doStartTag();
    if (_jspx_eval_ss_a_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ss_a_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ss_a_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ss_a_3.doInitBody();
      }
      do {
        out.write("我的猫咪");
        int evalDoAfterBody = _jspx_th_ss_a_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ss_a_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_ss_a_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ss_a_targets_href.reuse(_jspx_th_ss_a_3);
      return true;
    }
    _jspx_tagPool_ss_a_targets_href.reuse(_jspx_th_ss_a_3);
    return false;
  }

  private boolean _jspx_meth_ss_div_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ss:div
    org.apache.struts2.dojo.views.jsp.ui.DivTag _jspx_th_ss_div_0 = (org.apache.struts2.dojo.views.jsp.ui.DivTag) _jspx_tagPool_ss_div_id_href_nobody.get(org.apache.struts2.dojo.views.jsp.ui.DivTag.class);
    _jspx_th_ss_div_0.setPageContext(_jspx_page_context);
    _jspx_th_ss_div_0.setParent(null);
    _jspx_th_ss_div_0.setId("divCatList");
    _jspx_th_ss_div_0.setHref("MemOwnCatsAction.do?userid=1&pageNumber=1");
    int _jspx_eval_ss_div_0 = _jspx_th_ss_div_0.doStartTag();
    if (_jspx_th_ss_div_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ss_div_id_href_nobody.reuse(_jspx_th_ss_div_0);
      return true;
    }
    _jspx_tagPool_ss_div_id_href_nobody.reuse(_jspx_th_ss_div_0);
    return false;
  }
}
