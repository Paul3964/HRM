<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询界面</title>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>
<link rel="stylesheet" href="css/bootstrap.css" />
<style type="text/css">
         #touming2{
	    	filter:alpha(opacity=80); 
            -moz-opacity:0.8; 
            opacity:0.5;
	     }
        .c{   
           background-color:#96E1A0;
           border:1px solid green;
        }
		.bar{
			background-color:#96E1A0;
			text-align:left;
			height:50px;
			width:200px;
		}
		.c1{
		    height:50px;
		    width:300px;
		}
		.c2{
		    height:20px;
		    width:139px;
		}
		.c3{
		    background-color:#96E1A0;
			text-align:left;
			height:20px;
			width:200px;
		}
</style>
</head>
<body>
<div style="width:1250px;height:500px;">
<form action="select" method="post">
<table style="margin:0 auto;width:40%" class="table table-hover">
<tr class="danger" style="font-weight:bold;height:50px;">
<td></td>
<td>
<input type='submit' value='查询' class="btn btn-success" style="float:right">
</td>
</tr>
<tr class="danger" style="font-weight:bold;height:50px;">
<td class="bar">请输入学生所在I级校区</td>
<td><input type='text' name='firstorg' class="c1"></td>
</tr>
<tr class="danger" style="font-weight:bold;height:50px;">
<td class="bar">请输入学生所在II级校区</td>
<td><input type='text' name='secondorg' class="c1"></td>
</tr>
<tr class="danger" style="font-weight:bold;height:50px;">
<td class="bar">请输入学生所在III级校区</td>
<td><input type='text' name='thirdorg' class="c1"></td>
</tr>
<tr class="danger" style="font-weight:bold;height:50px;">
<td class="bar">请输入专业分类</td>
<td><input type='text' name='firstpost' class="c1"></td>
</tr>
<tr class="danger" style="font-weight:bold;height:50px;">
<td class="bar">请输入专业名称</td>
<td><input type='text' name='secondpost' class="c1"></td>
</tr>
<tr class="danger" style="font-weight:bold;height:50px;">
<td class="c3">请输入建档时间(必填)</td>
<td><input type='text' name='stime' class="c2">至<input type='text' name='etime' class="c2"></td>
</tr>
</table>
</form> 
</div>
</body>
</html>