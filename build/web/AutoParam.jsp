<%-- 
    Document   : AutoParam
    Created on : 2015-5-18, 17:57:26
    Author     : hp-pc
    自动参数
--%>

<%@page import="java.util.concurrent.FutureTask"%>
<%@page import="com.udp.Send"%>
<%@page import="com.thread.ReceiveThread"%>
<%@page import="com.javabeans.udpentity.UDPData"%>
<%@page import="com.javabeans.udpentity.MessageContextType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            *{
                margin:0px;
                padding:0px;
            }
        
          
            #mathod{
                width:70%;
                position: relative;
                font:微软雅黑;
                font-size:18px;
                float: right;
            }
            #autop{
                clear:both;}
            #autop fieldset{
                width:29%;
                height:200px;
                margin:5px;
                float:left;
                text-align:center;
            }
            #autop fieldset legend{
                font-family:幼圆;
                font-size:24px;
                text-align:center;}
            #autop fieldset table tr{
                width:95%;
                margin:0 auto;}
            #autop fieldset table tr td{
                width:30%;
                height:50px;
                line-height:50px;
                margin:0 auto;}
            #autop fieldset input{
                width:50px;}
            #timing{
                height:80px;
                padding-top:30px;
                margin-bottom:20px;
                clear:both;}
            #timing td{
                width:25%;
               text-align: center;
            }
            #timing td input{
                width:20%;
                float:left;
                 text-align: center;
            }
            #timing1{
                margin-left: 35%;
                width: 100%;
}
            #bottom{
                padding-left:300px;
                clear:both;}
            #bottom input{
                float:left;
                left:200px;
                width:80px;
                margin:10px;
                font:微软雅黑;
                font-size:18px;}
            
            </style>
        </head>

        <body>
            <%@ include file="/index.jsp" %>
            <div id="mathod">
                <form action="AutoServlet" >
                    <%
                                UDPData data = new UDPData();
                                data.getMessage().setSender("zptest1");
                                data.getMessage().setReceiver("dev0");
                                data.getMessage().setText("");
                                data.getMessage().setMessageContext(MessageContextType.GETAUTOPARAM);
                                Send send = new Send();
                                send.send(data, 33226, "192.168.1.120");
                                ReceiveThread Rthred = new ReceiveThread(send);
                                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthred);
                                new Thread(futureTask).start();
                                
                    %>
                    <div id="autop">
                        <fieldset>
                            <legend>温度</legend>
                            <span>
                                <p>降温&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp加温</p>
                                <table>
                                    <tr>
                                        <td><p>上限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getWenduAutoParamInfo().getFallTopValue()%>" name="wdft" /></td>
                                        <td><p>上限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getWenduAutoParamInfo().getRaiseTopValue()%>" name="wdrt" /></td>
                                    </tr>
                                    <tr>
                                        <td><p>下限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getWenduAutoParamInfo().getFallLowValue()%>" name="wdfl" /></td>
                                        <td><p>下限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getWenduAutoParamInfo().getRaiseLowValue()%>" name="wdrl" /></td>
                                    </tr>
                                </table>
                            </span>
                        </fieldset>
                        <fieldset>
                            <legend>光照</legend>
                            <span>
                                <p>遮光&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp补光</p>
                                <table>
                                    <tr>
                                        <td><p>上限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getGuangzhaoAutoParamInfo().getFallTopValue()%>" name="gzft" /></td>
                                        <td><p>上限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getGuangzhaoAutoParamInfo().getRaiseTopValue()%>" name="gzrt" /></td>
                                    </tr>
                                    <tr>
                                        <td><p>下限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getGuangzhaoAutoParamInfo().getFallLowValue()%>" name="gzfl" /></td>
                                        <td><p>下限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getGuangzhaoAutoParamInfo().getRaiseLowValue()%>" name="gzrl" /></td>
                                    </tr>
                                </table>
                            </span>
                        </fieldset>
                        <fieldset>
                            <legend>湿度</legend>
                            <span>
                                <p>除湿&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp加湿</p>
                                <table>
                                    <tr>
                                        <td><p>上限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getShiduAutoParamInfo().getFallTopValue()%>" name="sdfl" /></td>
                                        <td><p>上限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getShiduAutoParamInfo().getRaiseTopValue()%>" name="sdrl" /></td>
                                    </tr>
                                    <tr>
                                        <td><p>下限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getShiduAutoParamInfo().getFallLowValue()%>" name="sdfl" /></td>
                                        <td><p>下限</p></td>
                                        <td><input type="text" value="<%=futureTask.get().getShiduAutoParamInfo().getRaiseLowValue()%>" name="sdrl" /></td>
                                    </tr>
                                </table>
                            </span>
                        </fieldset>
                    </div>
                    <div id="timing">
                        <table>
                            <tr>
                                <td>
                                    <p>自然通风</p>
                                    <div id="timing1">
                                        <input type="text" value="<%=futureTask.get().getWenduAutoParamInfo().getTime()%>" name="wdt" />
                                    </div>
                                </td>
                                <td>
                                    <p>光照干扰时间（S）</p>
                                    <div id="timing1">
                                        <input type="text" value="<%=futureTask.get().getGuangzhaoAutoParamInfo().getTime()/1000%>" name="gzt" />
                                    </div>
                                </td>
                                <td>
                                    <p>风机加湿时间（S）</p>
                                    <div id="timing1">
                                        <input type="text" value="<%=futureTask.get().getShiduAutoParamInfo().getTime()/1000%>" name="sdt" />
                                    </div>
                                </td>
                                <td>
                                    <p>加湿时间（S）</p>
                                    <div>
                                        <input type="text" value="开" name="#" />
                                        <input type="text" value="2" name="#" />
                                        <input type="text" value="关" name="#" />
                                        <input type="text" value="2" name="#" />
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </div>
                    <div id="bottom">
                        <input type="submit" name="action" onclick="" value="设置" />
                        <input type="submit" name="action" onclick="" value="刷新/取消" />
                    </div>

                </form>
            </div>
        
    </body>
</html>
