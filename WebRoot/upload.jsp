<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>教师办公</title>
    
		<style type="text/css">
		*{
			padding:0px;
			margin:0px;
		}
		.bar{
			background-color:#FAFAFA;
			text-align: center;
		}
		.hi{
			height:4%;
		}
		select{
			width:100%;
		}
		input[type^=text]{
			width:100%;		
		}	
		input[type = textarea]{
			height:132px;			
		}
	</style>

  </head>
  
  <body>
  	<span style="color:#1214FE">您正在做的业务是：教育培训机构--学员管理--学员登记和查询</span><br>
  	
  	<br>
  	
  	<form action="file.action" method="POST" enctype="multipart/form-data">
	  	<table style="width:auto;height:auto;background-color:#E9F8F3;">
		   
			 <tr>
				<td><input type="file" name="file"></td>
				<td><input type="submit" value="提交"></td>
			</tr>
		  
	   	</table>
   	</form>
   	<br>
   	
   	 <form action="multifile.action" method="POST" enctype="multipart/form-data">
   	   	<table style="width:auto;height:auto;background-color:#E9F8F3;">	
		<tr>
			<td><input type="file" name="file"></td>
			<td><input type="file" name="file"></td>
			<td><input type="file" name="file"></td>
			<td><input type="submit" value="提交"></td>
		</tr>
		</table>
	 </form>
	
  </body>
</html>
