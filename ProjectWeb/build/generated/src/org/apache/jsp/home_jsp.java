package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Colorlib | Free Bootstrap Website Template</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" />\n");
      out.write("<meta name=\"robots\" content=\"noindex, nofollow\" />\n");
      out.write("\n");
      out.write("<link href=\"assets/css/A.bootstrap.min.css+template.css+fa.min.css+gfonts.min.css,Mcc.LI5f1xXhbm.css.pagespeed.cf.G00NPyYGCq.css\" rel=\"stylesheet\" media=\"screen\" />\n");
      out.write("<script>if ( top !== self ) top.location.replace( self.location.href );// Hey, don't iframe my iframe!</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("\t\t<script>/*@cc_on'abbr article aside audio canvas details figcaption figure footer header hgroup mark meter nav output progress section summary subline time video'.replace(/\\w+/g,function(n){document.createElement(n)})@*/</script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-23581568-13\"></script>\n");
      out.write("<script>\n");
      out.write("\t  window.dataLayer = window.dataLayer || [];\n");
      out.write("\t  function gtag(){dataLayer.push(arguments);}\n");
      out.write("\t  gtag('js', new Date());\n");
      out.write("\n");
      out.write("\t  gtag('config', 'UA-23581568-13');\n");
      out.write("\t</script>\n");
      out.write("<script nonce=\"71666836-59a8-49e2-aa53-f70d5af78d9c\">(function(w,d){!function(a,e,t,r,z){a.zarazData=a.zarazData||{},a.zarazData.executed=[],a.zarazData.tracks=[],a.zaraz={deferred:[]};var s=e.getElementsByTagName(\"title\")[0];s&&(a.zarazData.t=e.getElementsByTagName(\"title\")[0].text),a.zarazData.w=a.screen.width,a.zarazData.h=a.screen.height,a.zarazData.j=a.innerHeight,a.zarazData.e=a.innerWidth,a.zarazData.l=a.location.href,a.zarazData.r=e.referrer,a.zarazData.k=a.screen.colorDepth,a.zarazData.n=e.characterSet,a.zarazData.o=(new Date).getTimezoneOffset(),a.dataLayer=a.dataLayer||[],a.zaraz.track=(e,t)=>{for(key in a.zarazData.tracks.push(e),t)a.zarazData[\"z_\"+key]=t[key]},a.zaraz._preSet=[],a.zaraz.set=(e,t,r)=>{a.zarazData[\"z_\"+e]=t,a.zaraz._preSet.push([e,t,r])},a.dataLayer.push({\"zaraz.start\":(new Date).getTime()}),a.addEventListener(\"DOMContentLoaded\",(()=>{var t=e.getElementsByTagName(r)[0],z=e.createElement(r);z.defer=!0,z.src=\"/cdn-cgi/zaraz/s.js?z=\"+btoa(encodeURIComponent(JSON.stringify(a.zarazData))),t.parentNode.insertBefore(z,t)}))}(w,d,0,\"script\");})(window,document);</script></head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<header class=\"switcher-bar ssss clearfix\">\n");
      out.write("\n");
      out.write("<div class=\"logo textual pull-left\">\n");
      out.write("<a href=\"https://colorlib.com/wp/templates/\" title=\"Switcher\">\n");
      out.write("<img src=\"data:image/webp;base64,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\" alt=\"Colorlib logo\">\n");
      out.write("</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"product-switcher pull-left\">\n");
      out.write("<a href=\"#\" title=\"Select a Product\">\n");
      out.write("Select a Product <span>+</span>\n");
      out.write("</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"remove-btn header-btn pull-right\">\n");
      out.write("<a href=\"#\" title=\"Close this bar\" class=\"icon-remove\"></a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"purchase-btn header-btn pull-right\">\n");
      out.write("<a href=\"#\" title=\"Buy now\" class=\"icon-shopping-cart\"></a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mobile-btn header-btn pull-right hidden-xs\">\n");
      out.write("<a href=\"#\" title=\"Smartphone View\" class=\"icon-mobile-phone\"></a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"tablet-btn header-btn pull-right hidden-xs\">\n");
      out.write("<a href=\"#\" title=\"Tablet View\" class=\"icon-tablet\"></a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"desktop-btn header-btn pull-right hidden-xs\">\n");
      out.write("<a href=\"#\" title=\"Desktop View\" class=\"icon-desktop\"></a>\n");
      out.write("</div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<section class=\"switcher-body\">\n");
      out.write("<a href=\"#\" title=\"Prev\" class=\"icon-chevron-left products-prev\"></a>\n");
      out.write("<div class=\"products-wrapper\">\n");
      out.write("<div class=\"products-list clearfix\">\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<a href=\"#\" title=\"Next\" class=\"icon-chevron-right products-next\"></a>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<iframe class=\"product-iframe\" frameborder=\"0\" border=\"0\"></iframe>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("<script src=\"assets/js/products.js.pagespeed.ce.eU9FFbENSY.js\"></script>\n");
      out.write("<script src=\"assets/js/application.min.js.pagespeed.ce.k53sHKSrpA.js\"></script>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<script defer src=\"https://static.cloudflareinsights.com/beacon.min.js/v652eace1692a40cfa3763df669d7439c1639079717194\" integrity=\"sha512-Gi7xpJR8tSkrpF7aordPZQlW2DLtzUlZcumS8dMQjwDHEnw9I7ZLyiOj/6tZStRBGtGgN6ceN6cMH8z7etPGlw==\" data-cf-beacon='{\"rayId\":\"6e37f66268858b69\",\"token\":\"cd0b4b3a733644fc843ef0b185f98241\",\"version\":\"2021.12.0\",\"si\":100}' crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
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
}
