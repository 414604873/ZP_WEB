<%-- 
    Document   : ChooseDev
    Created on : 2015-5-14, 10:34:27
    Author     : hp-pc
    手动控制
--%>

<%@page import="java.util.concurrent.FutureTask"%>
<%@page import="com.udp.Send"%>
<%@page import="com.thread.ReceiveThread"%>
<%@page import="com.javabeans.udpentity.MessageContextType"%>
<%@page import="com.javabeans.udpentity.UDPData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
          
            #mathod{
                width:70%;
                position: relative;
                font:微软雅黑;
                font-size:18px;
                float: right;
            }
        </style>
    </head>
    <body>
        <%@ include file="/index.jsp" %>
        <div id="mathod">
            <form action="SwitchServlet" method="post">
               <%
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

                %>
                <input type="submit" value="<%=futureTask.get().getCurrentDevices().get(i).getDevName()%>"    name="action" style="width:60px;  ">

                <%
                               } else {
                %>
                <input type="submit" value="<%=futureTask.get().getCurrentDevices().get(i).getDevName()%>打开" name="action" style="width:80px;  ">
                <input type="submit" value="<%=futureTask.get().getCurrentDevices().get(i).getDevName()%>关闭" name="action" style="width:80px;  "><br>
                <%  }
                            }
                %>

            </form>
        </div>
    </body>
</html>
