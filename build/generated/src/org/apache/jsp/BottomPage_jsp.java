package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.javabeans.entity.Device;
import java.util.ArrayList;
import java.util.List;

public final class BottomPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/lc_switch.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"lc_switch.css\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body * {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            h1 {\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                padding-left: 35px;\n");
      out.write("                background: url('data:image/jpg;base64,/9j/4AAQSkZJRgABAQEASABIAAD/2wBDAAIBAQEBAQIBAQECAgICAgQDAgICAgUEBAMEBgUGBgYFBgYGBwkIBgcJBwYGCAsICQoKCgoKBggLDAsKDAkKCgr/2wBDAQICAgICAgUDAwUKBwYHCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgr/wAARCAAZABkDAUEAAhEBAxEB/8QAGgAAAgIDAAAAAAAAAAAAAAAABgcECAADBf/EADQQAAAFBAADAwkJAAAAAAAAAAECAwQFAAYHEQgSIRMxVhQVFhg3cXaz0TM4QUKTlJW04f/EABcBAAMBAAAAAAAAAAAAAAAAAAIFBgD/xAAiEQABAwMDBQAAAAAAAAAAAAABAAIRAwQhBhIxBRMUIkH/2gAMAwEAAhEDEQA/AL52nHcRlzcUcFc1629dipAvVqo5VcMXIIIoFdlEwdS8pUilD3AFNK5WOX4jN8rOW/Fz5NXIuZBZFqsJDpiuYS9waMUS66d2qk52i8qoZtl5u2o24OUF0jNHTJFYS6BImuUxQ1oBD8KPPT/iR8MP/wCGP9KndHC5Gm6Hkgh/sTukGS9xzOUv6WKgsGdyZzM88lLrGGZ8pI5fjYtzekg7bPZxNs5avXBlSdmoqBTaKYR5dAOw1rVW3qqedcr5MtLNswlB3rJNUWyyXk7QFzCiUOyIb7M2yCAj17utHPrL5D8Ktf0VPrVLAkpgcIVxzxOZYd5TYW7cEui/ZP5dNmZA7NJMUynVAgGKYhQHYb313Wu6uKLK9pZVl48ZVFzGMJtwgSPUZpgAokVMUCgYpQNvlDvEamZj4jMr2Ll+Ug4OcS83sl0wSYrMkjEMApkMICblA/URN+ajP1sE/CBv3P8AlYtQ7gkZYH3gIr4sS/sBWZc9u038QH+ZXR4qfblM+5v8glMCjKH4v//Z') no-repeat 0px 5px transparent;\n");
      out.write("            }\n");
      out.write("            a {\n");
      out.write("                color: #888;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            small {\n");
      out.write("                font-size: 13px;\n");
      out.write("                font-weight: normal;\n");
      out.write("                padding-left: 10px;\n");
      out.write("            }\n");
      out.write("            #first_div {\n");
      out.write("                width: 90%;\n");
      out.write("                max-width: 600px;\n");
      out.write("                min-width: 340px;\n");
      out.write("                margin: 50px auto 0;\n");
      out.write("                color: #444;\n");
      out.write("            }\n");
      out.write("            #second_div {\n");
      out.write("                width: 10%;\n");
      out.write("                max-width: 600px;\n");
      out.write("                min-width: 340px;\n");
      out.write("                margin: 50px auto 0;\n");
      out.write("                background: #f3f3f3;\n");
      out.write("                border: 6px solid #eaeaea;\n");
      out.write("                padding: 20px 40px 40px;\n");
      out.write("                text-align: center;\n");
      out.write("                border-radius: 2px;\n");
      out.write("            }\n");
      out.write("            #third_div {\n");
      out.write("                width: 90%;\n");
      out.write("                max-width: 600px;\n");
      out.write("                min-width: 340px;\n");
      out.write("                margin: 10px auto 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"sensor\">\n");
      out.write("            ");

                        List<Device> list = new ArrayList<Device>();
                        list = (ArrayList) request.getAttribute("hyxx");
                        for (int i = 0; i < 2; i++) {
            
      out.write("\n");
      out.write("            <div id=\"second_div\">\n");
      out.write("                <form>\n");
      out.write("                    <div style=\"float: right; width: 50%;\">\n");
      out.write("                        <p>\n");
      out.write("                            <input type=\"radio\" name=\"radio-1\" value=\"1\" class=\"lcs_check lcs_tt2\" autocomplete=\"off\" />\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <input type=\"radio\" name=\"radio-1\" value=\"2\" class=\"lcs_check lcs_tt2\" disabled=\"disabled\" autocomplete=\"off\" />\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <input type=\"radio\" name=\"radio-1\" value=\"3\" class=\"lcs_check lcs_tt2\" checked=\"checked\" autocomplete=\"off\" />\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div style=\" clear: both;\"></div>\n");
      out.write("            </div>\n");
      out.write("            ");
                                 }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(e) {\n");
      out.write("                $('input').lc_switch();\n");
      out.write("                // triggered each time a field changes status\n");
      out.write("                $('body').delegate('.lcs_check', 'lcs-statuschange', function() {\n");
      out.write("                    var status = ($(this).is(':checked')) ? 'checked' : 'unchecked';\n");
      out.write("                    console.log('field changed status: '+ status );\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                // triggered each time a field is checked\n");
      out.write("                $('body').delegate('.lcs_check', 'lcs-on', function() {\n");
      out.write("                    console.log('field is checked');\n");
      out.write("                });\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("                // triggered each time a is unchecked\n");
      out.write("                $('body').delegate('.lcs_check', 'lcs-off', function() {\n");
      out.write("                    console.log('field is unchecked');\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
