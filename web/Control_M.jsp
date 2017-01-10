<%-- 
    Document   : Control_M
    Created on : 2015-5-17, 19:46:43
    Author     : Administrator
        控制方式
--%>

<%@page import="com.javabeans.udpentity.CtlMode"%>
<%@page import="java.util.concurrent.FutureTask"%>
<%@page import="com.thread.ReceiveThread"%>
<%@page import="com.udp.Send"%>
<%@page import="com.javabeans.udpentity.MessageContextType"%>
<%@page import="com.javabeans.udpentity.UDPData"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javabeans.entity.Device"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            *{ 
                margin:0px;
            }
            body{
                background-color: yellowgreen;
            }
            p{
                float:left;
            }
            input{
                float:left;
                width: 50px;
                margin: 10px;}
            .main{
                width: 70%;
                margin: 0 auto;
            }
            table tr{
                width: 70%
            }
 #mathod{
                width:70%;
                position: relative;
                font:微软雅黑;
                font-size:18px;
                float: right;
            }
            table tr td span{
                background-color:   #75b936;
            }
        </style>

        <%//本段可复用
                    ArrayList<Device> devices = new ArrayList<Device>();
                    UDPData data = new UDPData();
                    data.getMessage().setSender("zptest1");
                    data.getMessage().setReceiver("dev0");
                    data.getMessage().setText("");
                    data.getMessage().setMessageContext(MessageContextType.GETDEVICEINFO);
                    Send send = new Send();
                    send.send(data, 33226, "192.168.1.120");//丢包情况未考虑
                    ReceiveThread Rthred = new ReceiveThread(send);
                    FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthred);
                    new Thread(futureTask).start();
                    //int num = futureTask.get().getDeviceNum();
                    devices = futureTask.get().getCurrentDevices();
                    /*request.setAttribute("devices", devices);
                    request.setAttribute("wenduq", futureTask.get().getWenduAutoParamInfo());
                    request.setAttribute("guangzhaoq", futureTask.get().getGuangzhaoAutoParamInfo());
                    request.setAttribute("shiduq", futureTask.get().getShiduAutoParamInfo());*/
        %>
    </head>
    <body>
        <%@ include file="/index.jsp" %>
            <div id="mathod">
        <form action="Control_M_Servlet" >
            <div class="main">
                <div>
                    <table style="width:99%;">
                        <%
                                    //List<Device> list = new ArrayList<Device>();
                                    //list = (ArrayList) request.getAttribute("hyxx");
                                    for (int i = 0; i < devices.size(); ) {
                        %>
                        <tr>
                            <td >
                                <span style="float:left; width:20%;">
                                    <p><%=devices.get(1).getDevName()%></p>
                                    <p>端口:</p>
                                </span>
                                <span style="margin-left:20px;width:18px;overflow:hidden;">
                                    <select style="width:60px;margin-left:-30px; " onchange="this.parentNode.nextSibling.value=this.value" name="<%=i++%>">
                                        <option value="<%=CtlMode.MANUAL%>">手动<%=i++%></option>
                                        <option value="<%=CtlMode.AUTO%>"> 自动 </option>
                                        <option value="<%=CtlMode.TIMER%>"> 定时 </option>
                                    </select>
                                </span>
                                <span style="clear:both;"></span>
                            </td>
                            <td>
                                <span style="float:left; width:20%;">
                                    <p><%=devices.get(2).getDevName()%></p>
                                    <p>端口:</p>
                                </span>
                                <span style="margin-left:20px;width:18px;overflow:hidden;">
                                    <select style="width:60px;margin-left:-30px" onchange="this.parentNode.nextSibling.value=this.value" name="<%=i++%>">
                                        <option value="<%=CtlMode.MANUAL%>">手动<%=i++%></option>
                                        <option value="<%=CtlMode.AUTO%>"> 自动 </option>
                                        <option value="<%=CtlMode.TIMER%>"> 定时 </option>
                                    </select>
                                </span>
                                <span style="clear:both;"></span>
                            </td>
                            <td>
                                <span style="float:left; width:20%;">
                                    <p><%=devices.get(3).getDevName()%></p>
                                    <p>端口:</p>
                                </span>
                                <span style="margin-left:20px;width:18px;overflow:hidden;">
                                    <select style="width:60px;margin-left:-30px" onchange="this.parentNode.nextSibling.value=this.value" name="<%=i++%>">
                                        <option value="<%=CtlMode.MANUAL%>">手动<%=i++%></option>
                                        <option value="<%=CtlMode.AUTO%>"> 自动 </option>
                                        <option value="<%=CtlMode.TIMER%>"> 定时 </option>
                                    </select>
                                </span>
                                <span style="clear:both;"></span>
                            </td>
                        </tr>
                        <%
                                    }
                        %>
                    </table>
                </div>
                <div>
                    <p>温度 <select style="width:60px;" onchange="this.parentNode.nextSibling.value=this.value" name="wendu">
                            <option value="<%=CtlMode.MANUAL%>">手动</option>
                            <option value="<%=CtlMode.AUTO%>"> 自动 </option>
                            <option value="<%=CtlMode.TIMER%>"> 定时 </option>
                        </select></p>
                    <p>湿度 <select style="width:60px;" onchange="this.parentNode.nextSibling.value=this.value" name="shidu">
                            <option value="<%=CtlMode.MANUAL%>">手动</option>
                            <option value="<%=CtlMode.AUTO%>"> 自动 </option>
                            <option value="<%=CtlMode.TIMER%>"> 定时 </option>
                        </select></p>
                    <p>光照 <select style="width:60px;" onchange="this.parentNode.nextSibling.value=this.value" name="guangzhao">
                            <option value="<%=CtlMode.MANUAL%>">手动</option>
                            <option value="<%=CtlMode.AUTO%>"> 自动 </option>
                            <option value="<%=CtlMode.TIMER%>"> 定时 </option>
                        </select></p>
                    <p>CO<sub>2</sub> <select style="width:60px;" onchange="this.parentNode.nextSibling.value=this.value" name="CO2">
                            <option value="<%=CtlMode.MANUAL%>">手动</option>
                            <option value="<%=CtlMode.AUTO%>"> 自动 </option>
                            <option value="<%=CtlMode.TIMER%>"> 定时 </option>
                        </select></p>
                    <p style="clear:both;"></p>
                </div>
                <div>
                    <input type="button" name="up" value="上一页" />
                    <input type="button" name="up" value="上一页" />
                    <input type="submit" name="sub" value="设置" />
                    <!--<input type="hidden" name="devicesNum"  value="" />-->
                </div>
            </div>
        </form>
            </div>
    </body>
</html>
