<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript">
$(function(){
	$("#btn").click(function(){
		var data = $("#form").serialize();
		$.post("serach",data,function(responseData){
			$("#main").html(responseData);
		})
	})
	
	
	
	
})

function skipPage(page){
	var data = $("#form").serialize();
	$("#main").load("serach?"+data+"&pageNum="+page);
}
</script>
</head>
<body>

<form id="form">
	<table class="table table-hover" style="margin:0;padding:0">
	    <tr class="success">
	      
		<td>单据编号:<input type="text" name="number" value="${condition.number==-1?'':condition.number }"></td>
		<td>单据名称:<input type="text" name="post" value="${condition.post }"></td>
		<td>制定人:<input type="text" name="markes" value="${condition.markes }"></td>
		<td>登记人:<input type="text" name="registrant" value="${condition.registrant }"> </td>
		<td> <input type="button" value="查询" id="btn" class="btn btn-success"></td>
	    </tr>
	</table>
</form>
<table style="text-align:center;width:100%;margin:0;padding:0" class="table table-striped">
	<tr style="text-align:center;font-weight:bold">
		<td>单据编号</td>
		<td>单据名称</td>
		<td>制定人</td>
		<td>登记人</td>
	</tr>
	
	<c:forEach items="${pager.salary }" var="s">
		<tr>
			<td>${s.number }</td>
			<td>${s.post }</td>
			<td>${s.markes }</td>
			<td>${s.registrant }</td>
			
		</tr>
	</c:forEach>
	
	
	</table>
	<table style="margin:0 auto">
	<tr>
		<td colspan="3"><a href="javascript:skipPage('1')">首页</a> 
		<a href="javascript:skipPage('${pager.currentPage-1 >1?pager.currentPage-1:1}')">上一页</a>  
		<a href="javascript:skipPage('${pager.currentPage+1 <pager.totalPage?pager.currentPage+1:pager.totalPage}')">下一页</a>   
		<a href="javascript:skipPage('${pager.totalPage }')">尾页</a></td>
	</tr>
</table>
</body>
</html>