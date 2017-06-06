<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/myjs.js"></script>
 <style type="text/css">
		tr{
		 	border:1px solid;
		}
		td{
			border:1px solid;
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
<div><input type="button" value="市场活动计划添加" onclick="window.location='add.jsp'"/></div>
<table style="width:100%;height:300px;background-color:#E9F8F3;border:1px solid;">
	<tr class="hi">
		<th class="bar">计划名称</th>
		<th class="bar">负责人</th>
		<th class="bar">预估费用</th>
	    <th class="bar">实际/目标收单量</th>
	    <th class="bar">完成百分比</th>
	    <th class="bar">目标成单量</th>
	    <th class="bar">实际成单量/实际收单量</th>
	    <th class="bar">转化率</th>
	    <th class="bar">开始日期</th>
	    <th class="bar">截止日期</th>
	</tr>
	
	<c:forEach items="${pager.pl }" var="pl" varStatus="statu">
	    
		<tr class="hi">
			<td class="bar">${pl.planname}</td>
			<td class="bar">${pl.personname }</td>
			<td class="bar">${pl.estimatedcost }</td>
			<td class="bar">${pl.actualshou }/${pl.aimshou }</td>
			<td class="bar">${pl.percentcompl }</td>
			<td class="bar">${pl.aimcheng }</td>
			<td class="bar">${pl.actualcheng }/${pl.actualshou }</td>
			<td class="bar">${pl.percentconv }</td>
			<td class="bar">${pl.starttime }</td>
			<td class="bar">${pl.endtime }</td>
			
		</tr>
		
	</c:forEach>
</table>
</body>
</html>