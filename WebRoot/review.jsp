<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>
<link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
	<table style="margin:0 auto;width:85%" class="table table-hover">
		<tr class="danger">
			<td>单据编号</td>
			<td>单据名称</td>
			<td>制定人</td>
			<td>登记人</td>
			<td>登记时间</td>
			<td></td>
		</tr>
		<c:forEach items="${pager.salary }" var="s">
			<tr>
				<td>${s.number }</td>
				<td>${s.post }</td>
				<td>${s.markes }</td>
				<td>${s.registrant }</td>
				<td>${s.time }</td>
				<td><input type="button" value="审核" onclick="checkSalary(this)" class="btn btn-info"></td>
			</tr>
		</c:forEach>
			
	</table>
	<table style="margin:0 auto">
		<tr style="text-align:center">
			<td colspan='10'>
				<ul class="pagination pagination-sm">
				    <li><a href="review?pageNum=1">首页</a></li>
				    <li><a href="review?pageNum=${pager.currentPage-1>1?pager.currentPage-1:1 }">上一页</a></li>
				    <li><a href="review?pageNum=${pager.currentPage+1<pager.totalPage?pager.currentPage+1:pager.totalPage }">下一页</a></li>
				    <li><a href="review?pageNum=${pager.totalPage }">尾页</a></li>
				</ul>
				
			</td>
		</tr>
	</table>
</body>
</html>