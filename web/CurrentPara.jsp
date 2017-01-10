<%-- 
    Document   : newjsp
    Created on : 2015-5-17, 15:40:44
    Author     : Administrator

      当前参数


--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="js1/jquery.js"></script> 
        <script type="text/javascript" src="js1/highcharts.js"></script>
        <style type="text/css">
            #mathod{
                width:70%;
                position: relative;
                font:微软雅黑;
                font-size:18px;
                float: right;
            }
        </style>
        <script type="text/javascript">
     
            $(function () {
                $(document).ready(function() {
                    Highcharts.setOptions({
                        global: {
                            useUTC: false
                        }
                    });
																				
                    var chart;
                    $('#container').highcharts({
                        chart: {
                            type: 'spline',
                            animation: Highcharts.svg, // don't animate in old IE
                            marginRight: 10,
                            events: {
                                load: function() {
																				
                                    // set up the updating of the chart each second
                                    var series1 = this.series[0];
                                    var series2 = this.series[1];
                                    var series3 = this.series[2];
                                    setInterval(function() {
                                        var x = (new Date()).getTime(), // current time
                                        y = Math.random();
                                        series1.addPoint([x, y], true, true);
                                    }, 1000);
                                    setInterval(function() {
                                        var x = (new Date()).getTime(), // current time
                                        y = Math.random();
                                        series2.addPoint([x, y], true, true);
                                    }, 1000);
                                    setInterval(function() {
                                        var x = (new Date()).getTime(), // current time
                                        y = Math.random();
                                        series3.addPoint([x, y], true, true);
                                    }, 1000);
                                }
                            }
                        },
                        title: {
                            text: '数据动态走势图'
                        },
                        xAxis: {
                            type: 'datetime',
                            tickPixelInterval: 100
                        },
                        yAxis: {
                            title: {
                                text: '数据动态走势图'
                            },
                            plotLines: [{
                                    value: 0,
                                    width: 1,
                                    color: '#808080'
                                }]
                        },
                        tooltip: {
                            formatter: function() {
                                return '<b>'+ this.series.name +'</b><br/>'+
                                    Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+
                                    Highcharts.numberFormat(this.y, 2);
                            }
                        },
                        exporting: {
                            enabled: false
                        },
                        plotOptions: {
                            series:{marker:{radius:0,
                                    states:{
                                        hover:{
                                            radius:5}}}}
                        },
                        series: [{
                                name: 'CO2 data',
                                data: (function() {
                                    // generate an array of random data
                                    var data = [],
                                    time = (new Date()).getTime(),
                                    i;
																				
                                    for (i = -19; i <= 0; i++) {
                                        data.push({
                                            x: time + i * 1000,
                                            y: Math.random()
                                        });
                                    }
                                    return data;
                                })()
                            },{
                                name: 'TEM data',
                                data: (function() {
                                    // generate an array of random data
                                    var data = [],
                                    time = (new Date()).getTime(),
                                    i;
																				
                                    for (i = -19; i <= 0; i++) {
                                        data.push({
                                            x: time + i * 1000,
                                            y: Math.random()
                                        });
                                    }
                                    return data;
                                })()
                            },{
                                name: 'TEMinroom data',
                                data: (function() {
                                    // generate an array of random data
                                    var data = [],
                                    time = (new Date()).getTime(),
                                    i;
																				
                                    for (i = -19; i <= 0; i++) {
                                        data.push({
                                            x: time + i * 1000,
                                            y: Math.random()
                                        });
                                    }
                                    return data;
                                })()
                            }]
                    });
                });
																				
            });
        </script>
    </head>
    <body>
        <%@ include file="/index.jsp" %>
        <div id="mathod">
            <div id="main" style=" width:70%;margin:0 auto;">
                <div style="width: 30%; height: 400px; float: left;">
                    <iframe src="create_ajax.jsp"width="100%"  height="100%" name="ymziframe" border="0" vspace="0" hspace="0" marginwidth="0" marginheight="0" framespacing="0" frameborder="0" scrolling="no">
                    </iframe>
                </div>
                <div id="container" style="width:69%;height:400px; float:right;"></div>
                <div style="text-align:center;clear:both;">
                    <!--<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
                    <script src="/follow.js" type="text/javascript"></script>-->
                </div>
            </div>
        </div>
    </body>
</html>
