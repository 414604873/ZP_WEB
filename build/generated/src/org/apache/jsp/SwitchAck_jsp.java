package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.concurrent.FutureTask;
import com.udp.Send;
import com.thread.ReceiveThread;
import com.javabeans.udpentity.MessageContextType;
import com.javabeans.udpentity.UDPData;

public final class SwitchAck_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/index.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("          \n");
      out.write("            #mathod{\n");
      out.write("                width:70%;\n");
      out.write("                position: relative;\n");
      out.write("                font:微软雅黑;\n");
      out.write("                font-size:18px;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            *{\n");
      out.write("                margin:0px;\n");
      out.write("                padding:0px;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: yellowgreen;\n");
      out.write("}\n");
      out.write("            #main{\n");
      out.write("                margin-left:  10%;\n");
      out.write("                width: 20%;\n");
      out.write("                height:80%;\n");
      out.write("\n");
      out.write("                float: left;\n");
      out.write("                position: absolute;\n");
      out.write("            }\n");
      out.write("            #nav1{\n");
      out.write("                margin-left:   40%;\n");
      out.write("                margin-top:   20%;\n");
      out.write("\n");
      out.write("                text-align: right;\n");
      out.write("                height: 48px;\n");
      out.write("                font-size: 38px;\n");
      out.write("                width: 59%;\n");
      out.write("                background-color: green;\n");
      out.write("            }\n");
      out.write("            #nav2{\n");
      out.write("                margin-left:   40%;\n");
      out.write("                margin-top:   15%;\n");
      out.write("\n");
      out.write("                text-align: right;\n");
      out.write("                height: 48px;\n");
      out.write("                font-size: 38px;\n");
      out.write("                width: 59%;\n");
      out.write("                background-color: green;   \n");
      out.write("            }\n");
      out.write("            #nav1:hover{\n");
      out.write("                background-color: darkgreen;\n");
      out.write("            }\n");
      out.write("            #nav2:hover{\n");
      out.write("                background-color: darkgreen;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div id=\"nav1\">\n");
      out.write("                <a href=\"SwitchAck.jsp\" style=\"text-decoration: none;color:black; \"> 控制方式 </a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"nav2\">\n");
      out.write("                <a href=\"Control_M.jsp\"style=\"text-decoration: none;color:black; \">方式选择</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"nav2\">\n");
      out.write("                <a href=\"newjsp.jsp\"style=\"text-decoration: none;color:black; \">实时数据</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"nav2\">\n");
      out.write("                <a href=\"AutoParam.jsp\"style=\"text-decoration: none;color:black; \">参数设置</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"mathod\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div id=\"mathod\">\n");
      out.write("            <form action=\"SwitchServlet\" method=\"post\">\n");
      out.write("               ");

                            UDPData data = new UDPData();
                            data.getMessage().setSender("zptest1");
                            data.getMessage().setReceiver("dev0");
                            data.getMessage().setText("");
                            data.getMessage().setMessageContext(MessageContextType.GETDEVICEINFO);
                            Send send = new Send();
                            send.send(data, 33226, "192.168.1.120");
                            ReceiveThread Rthred = new ReceiveThread(send);
                            FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthred);
                            new Thread(futureTask).start();
                            Rthred.stopThread(true);
                            for (int i = 0; i < futureTask.get().getDeviceNum(); i++) {
                                
                                if (futureTask.get().getCurrentDevices().get(i).getZhengFanZhuan() == 0) {

                
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"");
      out.print(futureTask.get().getCurrentDevices().get(i).getDevName());
      out.write("\"    name=\"action\" style=\"width:60px;  \">\n");
      out.write("\n");
      out.write("                ");

                               } else {
                
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"");
      out.print(futureTask.get().getCurrentDevices().get(i).getDevName());
      out.write("打开\" name=\"action\" style=\"width:80px;  \">\n");
      out.write("                <input type=\"submit\" value=\"");
      out.print(futureTask.get().getCurrentDevices().get(i).getDevName());
      out.write("关闭\" name=\"action\" style=\"width:80px;  \"><br>\n");
      out.write("                ");
  }
                            }
                
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
