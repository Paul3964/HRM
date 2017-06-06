<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/myjs.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
 <style type="text/css">
		tr{
		 	border:0px solid;
		}
		td{
			border:0px solid;
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
<form action="AddThing" method="post">
<table style="width:100%;height:100px;background-color:#E9F8F3;border:1px solid;">
	<tr class="hi">
		<th class="bar">计划名称</th>
		<th class="bar">负责人</th>
		<th class="bar">预估费用</th>
	    <th class="bar">实际收单量</th>
	    <th class="bar">目标收单量</th>
	</tr>
	<tr class="hi">
			<td class="bar"><input type="text" name="planname" /></td>
			<td class="bar"><input type="text" name="personname" /></td>
			<td class="bar"><input type="text" name="estimatedcost" /></td>
			<td class="bar"><input type="text" name="actualshou" /></td>
			<td class="bar"><input type="text" name="aimshou" /></td>
		</tr>
		<tr class="hi">
		    <th class="bar">目标成单量</th>
		    <th class="bar">实际成单量</th>
		    <th class="bar">开始日期</th>
		    <th class="bar">截止日期</th>
		</tr>
		
		<tr class="hi">
			<td class="bar"><input type="text" name="aimcheng" /></td>
			<td class="bar"><input type="text" name="actualcheng" /></td>
			<td class="bar"><input type="text" name="starttime"/></td>
			<td class="bar"><input type="text" name="endtime"/></td>
		</tr>
		<tr>
			<td> <input type="submit" value="保存" /></td>
		</tr>
	
</table>
</form>
</body>
</html>