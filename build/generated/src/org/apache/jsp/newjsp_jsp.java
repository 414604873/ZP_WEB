package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"js1/jquery.js\"></script> \n");
      out.write("        <script type=\"text/javascript\" src=\"js1/highcharts.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #mathod{\n");
      out.write("                width:70%;\n");
      out.write("                position: relative;\n");
      out.write("                font:微软雅黑;\n");
      out.write("                font-size:18px;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("     \n");
      out.write("            $(function () {\n");
      out.write("                $(document).ready(function() {\n");
      out.write("                    Highcharts.setOptions({\n");
      out.write("                        global: {\n");
      out.write("                            useUTC: false\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                    var chart;\n");
      out.write("                    $('#container').highcharts({\n");
      out.write("                        chart: {\n");
      out.write("                            type: 'spline',\n");
      out.write("                            animation: Highcharts.svg, // don't animate in old IE\n");
      out.write("                            marginRight: 10,\n");
      out.write("                            events: {\n");
      out.write("                                load: function() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    // set up the updating of the chart each second\n");
      out.write("                                    var series1 = this.series[0];\n");
      out.write("                                    var series2 = this.series[1];\n");
      out.write("                                    var series3 = this.series[2];\n");
      out.write("                                    setInterval(function() {\n");
      out.write("                                        var x = (new Date()).getTime(), // current time\n");
      out.write("                                        y = Math.random();\n");
      out.write("                                        series1.addPoint([x, y], true, true);\n");
      out.write("                                    }, 1000);\n");
      out.write("                                    setInterval(function() {\n");
      out.write("                                        var x = (new Date()).getTime(), // current time\n");
      out.write("                                        y = Math.random();\n");
      out.write("                                        series2.addPoint([x, y], true, true);\n");
      out.write("                                    }, 1000);\n");
      out.write("                                    setInterval(function() {\n");
      out.write("                                        var x = (new Date()).getTime(), // current time\n");
      out.write("                                        y = Math.random();\n");
      out.write("                                        series3.addPoint([x, y], true, true);\n");
      out.write("                                    }, 1000);\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        title: {\n");
      out.write("                            text: '数据动态走势图'\n");
      out.write("                        },\n");
      out.write("                        xAxis: {\n");
      out.write("                            type: 'datetime',\n");
      out.write("                            tickPixelInterval: 100\n");
      out.write("                        },\n");
      out.write("                        yAxis: {\n");
      out.write("                            title: {\n");
      out.write("                                text: '数据动态走势图'\n");
      out.write("                            },\n");
      out.write("                            plotLines: [{\n");
      out.write("                                    value: 0,\n");
      out.write("                                    width: 1,\n");
      out.write("                                    color: '#808080'\n");
      out.write("                                }]\n");
      out.write("                        },\n");
      out.write("                        tooltip: {\n");
      out.write("                            formatter: function() {\n");
      out.write("                                return '<b>'+ this.series.name +'</b><br/>'+\n");
      out.write("                                    Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+\n");
      out.write("                                    Highcharts.numberFormat(this.y, 2);\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        exporting: {\n");
      out.write("                            enabled: false\n");
      out.write("                        },\n");
      out.write("                        plotOptions: {\n");
      out.write("                            series:{marker:{radius:0,\n");
      out.write("                                    states:{\n");
      out.write("                                        hover:{\n");
      out.write("                                            radius:5}}}}\n");
      out.write("                        },\n");
      out.write("                        series: [{\n");
      out.write("                                name: 'CO2 data',\n");
      out.write("                                data: (function() {\n");
      out.write("                                    // generate an array of random data\n");
      out.write("                                    var data = [],\n");
      out.write("                                    time = (new Date()).getTime(),\n");
      out.write("                                    i;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    for (i = -19; i <= 0; i++) {\n");
      out.write("                                        data.push({\n");
      out.write("                                            x: time + i * 1000,\n");
      out.write("                                            y: Math.random()\n");
      out.write("                                        });\n");
      out.write("                                    }\n");
      out.write("                                    return data;\n");
      out.write("                                })()\n");
      out.write("                            },{\n");
      out.write("                                name: 'TEM data',\n");
      out.write("                                data: (function() {\n");
      out.write("                                    // generate an array of random data\n");
      out.write("                                    var data = [],\n");
      out.write("                                    time = (new Date()).getTime(),\n");
      out.write("                                    i;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    for (i = -19; i <= 0; i++) {\n");
      out.write("                                        data.push({\n");
      out.write("                                            x: time + i * 1000,\n");
      out.write("                                            y: Math.random()\n");
      out.write("                                        });\n");
      out.write("                                    }\n");
      out.write("                                    return data;\n");
      out.write("                                })()\n");
      out.write("                            },{\n");
      out.write("                                name: 'TEMinroom data',\n");
      out.write("                                data: (function() {\n");
      out.write("                                    // generate an array of random data\n");
      out.write("                                    var data = [],\n");
      out.write("                                    time = (new Date()).getTime(),\n");
      out.write("                                    i;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    for (i = -19; i <= 0; i++) {\n");
      out.write("                                        data.push({\n");
      out.write("                                            x: time + i * 1000,\n");
      out.write("                                            y: Math.random()\n");
      out.write("                                        });\n");
      out.write("                                    }\n");
      out.write("                                    return data;\n");
      out.write("                                })()\n");
      out.write("                            }]\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
      out.write("            <div id=\"main\" style=\" width:70%;margin:0 auto;\">\n");
      out.write("                <div style=\"width: 30%; height: 400px; float: left;\">\n");
      out.write("                    <iframe src=\"create_ajax.jsp\"width=\"100%\"  height=\"100%\" name=\"ymziframe\" border=\"0\" vspace=\"0\" hspace=\"0\" marginwidth=\"0\" marginheight=\"0\" framespacing=\"0\" frameborder=\"0\" scrolling=\"no\">\n");
      out.write("                    </iframe>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"container\" style=\"width:69%;height:400px; float:right;\"></div>\n");
      out.write("                <div style=\"text-align:center;clear:both;\">\n");
      out.write("                    <!--<script src=\"/gg_bd_ad_720x90.js\" type=\"text/javascript\"></script>\n");
      out.write("                    <script src=\"/follow.js\" type=\"text/javascript\"></script>-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
