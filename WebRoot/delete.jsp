<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除</title>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>
<link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
<div style="width:1250px;height:500px;">
	<table style="width:80%" class="table table-hover">
		<tr class="danger" style="font-weight:bold;height:50px;">
		<td>学员编号</td>
		<td>姓名</td>
		<td>性别</td>
		<td>一级校区</td>
		<td>二级校区</td>
		<td>三级校区</td>
		<td>专业分类</td>
		<td>专业</td>
		<td>转班状态</td>
		<td colspan="2" style="text-align:center;">操作</td>
		</tr>
		<c:forEach items="${pager.staff }" var="p">
			<tr class="active">
				<td>${p.id }</td>
				<td>${p.name }</td>
				<td>${p.gender }</td>
				<td>${p.group }</td>
				<td>${p.company }</td>
				<td>${p.department }</td>
				<td>${p.job }</td>
				<td>${p.jobtittle }</td>
				<td>${p.states }</td>
				<td><input type="button" class="btn btn-success" value="删除" onclick="updatebyid1(this)"></td>
				<td><input type="button" class="btn btn-success" value="同意转班" onclick="updateByid2(this)"></td>
			</tr>
		</c:forEach>
		
		
		
	</table>
	<table style="margin:0 auto">
		<tr style="text-align:center">
			<td colspan='10'>
				<ul class="pagination pagination-sm">
				    <li><a href="data?pageNum=1">首页</a></li>
				    <li><a href="data?pageNum=${pager.currentPage-1>1?pager.currentPage-1:1 }">上一页</a></li>
				    <li><a href="data?pageNum=${pager.currentPage+1<pager.totalPage?pager.currentPage+1:pager.totalPage }">下一页</a></li>
				    <li><a href="data?pageNum=${pager.totalPage }">尾页</a></li>
				    <li><a href="main.jsp">返回首页</a></li>
				</ul>
				
			</td>
		</tr>
	</table>
	</div>
</body>
</html>