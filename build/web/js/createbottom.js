// JavaScript Document
function addLoadEvent(func){
	var oldonload = window.onload;
	if(typeof window.onload != 'function'){
		window.onload = func;
		} else {
			window.onload = function(){
			oldonload();
			func();
			}
		}
	}
function createbutton(){//创建按钮函数
	if(!document.getElementsByTagName() || !document.createElement()||!document.createTextNode())
		return false;//解决兼容性问题
		var sensor = document.getElementById("sensor");
		var bodiv = document.createElement("p");//按钮的div
		var bottom1 = document.createElement("input");
		//var bottom2 = document.createElement("input");
		//设置bottom的属性
		bottom1.setAttribute("type","radio");
		bottom1.setAttribute("name","radio-1");
		bottom1.setAttribute("class","lcs_check lcs_tt2");
		bottom1.setAttribute("autocomplete","off");
		//设置bottom2的属性
		//bottom2.setAttribute("type","radio");
		//bottom2.setAttribute("name","radio-1");
		//bottom2.setAttribute("class","lcs_check lcs_tt2");
		//bottom2.setAttribute("checked","checked");
		//bottom2.setAttribute("autocomplete","off");
		//添加孩子节点
		bodiv.appendChild(bottom1);
		//bodiv.appendChild(bottom2);
		sensor.appendChild(bodiv);
	}
	addLoadEvent(createbutton);