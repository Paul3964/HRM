<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="entity.*,java.util.*,service.*,service.impl.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询界面</title>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>
<link rel="stylesheet" href="css/bootstrap.css" />
<style type="text/css">
        .c{
            background-color:lightgreen;
			text-align: center;
			border:#96E1A0;
        }		
        .bar{
			background-color:#96E1A0;
			text-align: center;
		}
</style>
</head>
<body>
<% 
IRegisterService register=new RegisterServicImpl();
List<Staff> list =(List<Staff>)session.getAttribute("list");
request.setAttribute("staff", list);
 %>
 <div style="width:1250px;height:500px;">
<form>
<div style="width:1250px;height:750px;">
<table style="margin:0 auto;width:80%" class="table table-hover">
<tr class="danger" style="font-weight:bold;height:50px;">
<td>档案编号</td>
<td>姓名</td>
<td>性别</td>
<td>I级校区</td>
<td>II级校区</td>
<td>III级校区</td>
<td>专业分类</td>
<td>专业名称</td>
<td colspan="2">操作</td>
</tr>
<c:forEach items="${requestScope.staff}" step="1" var="staff" varStatus="st">
<tr class="danger" style="font-weight:bold;height:50px;">
<td>${staff.getId()}</td>
<td>${staff.getName()}</td>
<td>${staff.getGender()}</td>
<td>${staff.getGroup()}</td>
<td>${staff.getCompany()}</td>
<td>${staff.getDepartment()}</td>
<td>${staff.getJob()}</td>
<td>${staff.getJobtittle()}</td>
<td><input type="button" value="修改" class="btn btn-success"  onclick="SelectById(this)"></td>
<td><input type="button" value="转班" class="btn btn-success"  onclick="UpdateById(this)"></td>
</tr>
</c:forEach> 
</table>
</div>
</form>
</div>
</body>
</html>