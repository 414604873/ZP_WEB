<%--
    Document   : create_ajax
    Created on : 2015-5-22, 14:55:54
    Author     : Administrator
    实时数据
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>实时环境参数</title>
        <script type="text/javascript">
            function $(id){
                return document.getElementById(id);
            }
            var xmlHttp;
            //根据浏览器创建 x mlHttpRequest对象
            function getXmlHttpRequest() {
                //<!--针对FireFox,Mozillar,Opera,Safari,IE7,IE8  -->
                if(window.XMLHttpRequest)
                    return new XMLHttpRequest();
                //<!--针对IE5，IE5.5，IE6 -->
                else if (window.ActiveXObject){
                    //<!--两个可以用于创建XMLHTTPRequest对象的控件名称,保存在一个JS数组中。-->
                    var activexName = ["MSXML2.XMLHTTP","Microsoft.XMLHTTP"];
                    for(var i = 0; i < activexName.length; i++){
                        //<!--取出一个控件名进行创建，如果成功就终止循环 -->
                        try{
                            return new ActiveXObject(activexName[i]);
                            break;
                        }catch(e){
                            return null;
                        }
                    }
                }
            };
            function load(){//刷新调用函数
                xmlHttp=getXmlHttpRequest();
                var url="CurrentServlet";
                //<!--注册回调函数,只写函数名，不能写括号，写括号表示调用函数 -->
                xmlHttp.onreadystatechange = getResult;//注册回掉函数
                //<!-- 确定发送请求的方式和URL以及是否同步执行下段代码  -->
                xmlHttp.open("GET", url , true);
                //<//!--发送数据，开始和服务器进行交互  -->
                xmlHttp.send(null);
            }
            //回调函数
            function getResult(){
                if (xmlHttp.readyState === 4) {  //<!--判断对象状态-->
                    if (xmlHttp.status === 200) {// <!-- 信息已经成功返回，开始处理信息 -->
                        var text=xmlHttp.responseXML;
                        var innerWendu=text.getElementsByTagName("inW")[0].firstChild.nodeValue;
                        var innerShidu=text.getElementsByTagName("inS")[0].firstChild.nodeValue;
                        var innerGuangzhao=text.getElementsByTagName("inG")[0].firstChild.nodeValue;
                        var innerCO2=text.getElementsByTagName("inC")[0].firstChild.nodeValue;
                        var outerWendu=text.getElementsByTagName("outW")[0].firstChild.nodeValue;
                        var outerShidu=text.getElementsByTagName("outS")[0].firstChild.nodeValue;
                        var outerGuangzhao=text.getElementsByTagName("outG")[0].firstChild.nodeValue;
                        var outerFengsu=text.getElementsByTagName("outF")[0].firstChild.nodeValue;

                        $("innerWendu").innerHTML=innerWendu;//把值写进name中
                        $("innerShidu").innerHTML=innerShidu;
                        $("innerGuangzhao").innerHTML=innerGuangzhao;
                        $("innerCO2").innerHTML=innerCO2;
                        $("outerWendu").innerHTML=outerWendu;
                        $("outerShidu").innerHTML=outerShidu;
                        $("outerGuangzhao").innerHTML=outerGuangzhao;
                        $("outerFengsu").innerHTML=outerFengsu;
                        setTimeout("load()", 1000);
                    } else {
                        alert("请求的出错啦!");
                    }
                }
            }
        </script>

    </head>
    <body  onload="load()">
        <div id="main" style=" width:70%;margin:0 auto;">
            <div id="left" style="width:30%; float:left">
                <div id="in" style="height:200px;">
                    <fieldset>
                        <legend>室内</legend>
                        <form>
                            <table>
                                <thead>
                                    <tr>
                                        <th colspan="2">
                                        </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>温度</td>
                                        <td id="innerWendu"></td>
                                    </tr>
                                    <tr>
                                        <td>湿度</td>
                                        <td id="innerShidu"></td>
                                    </tr>
                                    <tr>
                                        <td>光照</td>
                                        <td id="innerGuangzhao"></td>
                                    </tr>
                                    <tr>
                                        <td>CO2</td>
                                        <td id="innerCO2"></td>
                                    </tr>
                                </tbody>
                            </table>
                        </form>
                    </fieldset>
                </div>
                <div id="out" style="height:200px;">
                    <fieldset>
                        <legend>室外</legend>
                        <form>
                            <table>
                                <thead>
                                    <tr>
                                        <th colspan="2">
                                        </th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>温度</td>
                                        <td id="outerWendu"></td>
                                    </tr>
                                    <tr>
                                        <td>湿度</td>
                                        <td id="outerShidu"></td>
                                    </tr>
                                    <tr>
                                        <td>光照</td>
                                        <td id="outerGuangzhao"></td>
                                    </tr>
                                    <tr>
                                        <td>风速</td>
                                        <td id="outerFengsu"></td>
                                    </tr>
                                </tbody>
                            </table>
                        </form>
                    </fieldset>
                </div>
            </div>
            <div id="container" style="width:69%;height:400px; float:right;"></div>
            <div style="text-align:center;clear:both;">
                <!--<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
                <script src="/follow.js" type="text/javascript"></script>-->
            </div>
        </div>
    </body>
</html>
