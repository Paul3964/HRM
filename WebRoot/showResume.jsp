<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="entity.*,java.util.*,service.*,service.impl.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表</title>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>
<link rel="stylesheet" href="css/bootstrap.css" />
<style type="text/css">
        .ca{
            background-color:lightblue;
        }
        .c{
            background-color:lightgreen;
			text-align: center;
			border:#FAFAFA;
        }		
        .bar{
			background-color:#FAFAFA;
			text-align: center;
		}
</style>
</head>
<body>
<div style="width:1250px;height:500px;">
<% List<Resume> list=(List<Resume>)request.getAttribute("list");
request.setAttribute("resume",list);
%>
<table style="margin:0 auto;width:80%" class="table table-hover">
<tr class="danger" style="font-weight:bold;height:50px;">
<td>学员编号</td>
<td>专业分类</td>
<td>专业名称</td>
<td>课程类型</td>
<td>姓名</td>
<td>性别</td>
</tr>
<c:forEach items="${requestScope.resume}" step="1" var="resume" varStatus="st">
<tr class="active">
<td>${resume.getId()}</td>
<td>${resume.getFirstpost()}</td>
<td>${resume.getSecondpost()}</td>
<td>${resume.getPosttype()}</td>
<td>${resume.getName()}</td>
<td>${resume.getGender()}</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>