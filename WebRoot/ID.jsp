<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>试卷生成成功~</title>
    
	
  </head>
  	
  <body>
    	
    	<form action="CreateExamServlet2" method="post">
    	<span>请输入要抽取的试卷编号：</span>
    	<input type="text" name="id"></br>
    	<input type="submit" value="提交"/>
    	</form>
  </body>
</html>
