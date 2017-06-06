<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>简历查询</title>
<style type="text/css">
        .ca{
            background-color:lightblue;
        }
        .c{   
           background-color:#FAFAFA;
           border:1px solid green;
		   width:80%;
		   height:200px;
		   border-color:lightblue;
        }
		.bar{
			background-color:#FAFAFA;
			text-align:left;
			height:50px;
			width:300px;
		}
		.bar1{
			background-color:#FAFAFA;
			text-align:left;
			height:30px;
			width:300px;
		}
		.c1{
		    height:50px;
		    width:150px;
		}
		.c2{
		    height:20px;
		    width:139px;
		}
		.c3{
		    background-color:#FAFAFA;
			text-align:left;
			height:20px;
			width:200px;
		}
		.c4{
		    height:40px;
		    width:315px;
		}
		.c5{
		    height:40px;
		    width:150px;
		}
</style>
<link rel="stylesheet" href="css/bootstrap.css" />
</head>

<body>
<div style="width:1250px;height:500px;">
<form action="sr" method="post">
<table style="margin:0 auto;width:80%" class="table table-hover">
<tr class="danger" style="font-weight:bold;height:50px;">
<td colspan="2">
<span style="color:#1214FE">您正在做的业务是：教育培训机构管理系统--教学管理--课程信息查询</span><input type='submit' class="btn btn-success" style="float:right;" value='开始'></td>

</tr>
<tr class="danger" style="font-weight:bold;height:50px;">
<td class="bar">请选择专业分类</td>
<td><input type='text' name='firstpost' class="c1">&nbsp;&nbsp;&nbsp;<input type='text' name='secondpost' class="c1"></td>
</tr>
<tr class="danger" style="font-weight:bold;height:50px;">
<td class="bar1">请输入关键字</td>
<td><input type='text' name='keyword' class="c4"></td>
</tr>
<tr class="danger" style="font-weight:bold;height:50px;">
<td class="bar1">请输入登记时间</td>
<td><input type='text' name='stime' class="c5">至<input type='text' name='etime' class="c5"></td>
</tr>
</table>
</form> 
</div>
</body>
</html>