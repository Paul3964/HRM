<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
	<table style="width:100%;height:300px;background-color:#E9F8F3;border:1px solid;">
		<tr class="hi">
			<th>意向课程</th>
			<th>意向人数</th>
			<th>报班人次</th>
		    <th>创建时间</th>
		    <th>截止日期</th>
		    
		</tr>
		<c:forEach items="${hrm11}" var="hrm11">
		<tr class="hi">
			<td class="bar">${hrm11.aimcourse}</td>
			<td class="bar">${hrm11.aimnum}</td>
			<td class="bar">${hrm11.actnum}</td>
			<td class="bar">${hrm11.createtime}</td>
			<td class="bar">${hrm11.stoptime}</td>
		</tr>
		</c:forEach>
	 </table>
</body>
</html>