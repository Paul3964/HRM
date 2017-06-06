<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css" />	
	<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="js/test1.js"></script>
	<script type="text/javascript" src="js/test.js"></script>
	<style type="text/css">
	    #touming1{
	    	filter:alpha(opacity=80); 
            -moz-opacity:0.8; 
            opacity:0.5;
	    }
		*{
			padding:0px;
			margin:0px;
		}
		.bar{
			background-color:#FAFAFA;
			text-align: center;
		}
		.h{
			height:5%
		}
		.hi{
			height:15%;
		}
		select{
			width:100%;
		}
		input[type^=text]{
			width:100%;
			height:100%
		}
		</style>
</head>
<body>
<form action="Hrm2Servlet" method="post">
<table  style="width:100%;height:100px;background-color:#E9F8F3;">
		<span>添加成功，请输入要查询的信息的相关条件，或<a href="add1.jsp">点此</a>继续添加：</span>
		<tr>
			<th>一级校区</th>
			<th>二级校区</th>
			<th>三级校区</th>
			<th>课程类别</th>
			<th>具体课程</th>
		</tr>
		<tr>
			<td>
	     		<select id="pro" name="firstorg1">
	     		</select>
	     	</td>
	     	<td>
	     		<select id="second" name="secondorg2">
	     			
	     		</select>
	     	</td>
			<td>
	     		<select id="third" name="thirdorg3">   		
	     		</select>
	     	</td>
			<td>
  				<select id="ftest" name="ftest">
  				</select>
  			</td>
  			<td>
  				<select id="stest" name="stest">
  				</select>
  			</td>
  		</tr>
		<tr>
			<th>意向课程</th>
			<th>意向人数</th>
			<th>报班人次</th>
		    <th>创建时间</th>
		    <th>截止日期</th>
		    
		</tr>
		<tr>
			<td><input type="text" name="aimcourse" /></td>
			<td><input type="text" name="aimnum" /></td>
			<td><input type="text" name="actnum" /></td>
			<td><input type="text" name="createtime" /></td>
			<td><input type="text" name="stoptime" /></td>
		</tr>
		<tr>
		<td colspan="8"> <input type="submit" value="查询该决策" /></td>
		</tr>
</table>
</form>
</body>
</html>