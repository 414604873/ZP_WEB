<%-- 
    Document   : index
    Created on : 2015-5-4, 15:08:35
    Author     : hp-pc
    公共部分
--%>

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
            body{
                background-color: yellowgreen;
}
            #main{
                margin-left:  10%;
                width: 20%;
                height:80%;

                float: left;
                position: absolute;
            }
            #nav1{
                margin-left:   40%;
                margin-top:   20%;

                text-align: right;
                height: 48px;
                font-size: 38px;
                width: 59%;
                background-color: green;
            }
            #nav2{
                margin-left:   40%;
                margin-top:   15%;

                text-align: right;
                height: 48px;
                font-size: 38px;
                width: 59%;
                background-color: green;   
            }
            #nav1:hover{
                background-color: darkgreen;
            }
            #nav2:hover{
                background-color: darkgreen;
            }
        </style>
    </head>
    <body>
        <div id="main">
            <div id="nav1">
                <a href="SwitchAck.jsp" style="text-decoration: none;color:black; "> 控制方式 </a>
            </div>
            <div id="nav2">
                <a href="Control_M.jsp"style="text-decoration: none;color:black; ">方式选择</a>
            </div>
            <div id="nav2">
                <a href="newjsp.jsp"style="text-decoration: none;color:black; ">实时数据</a>
            </div>
            <div id="nav2">
                <a href="AutoParam.jsp"style="text-decoration: none;color:black; ">参数设置</a>
            </div>


        </div>
        <div id="mathod"></div>
    </body>
</html>
