<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>转班变动管理</title>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/test.js"></script>
<style type="text/css">
	    
		
	</style>
<link rel="stylesheet" href="css/transfer.css" />
</head>
<%request.getAttribute("list");%>
<body>
<form action="in" method="post">
<div style="width:1200px;height:900px;">
<span style="color:#1214FE">您正在做的业务是：教育培训机构管理系统--转班管理--转班登记</span>
<div id="nav" >
<input type="submit"  style="float:right;width:80px;height:30px;">
<input type="button" value="返回" style="float:right;width:80px;height:30px;" onclick="javascript:location.href='main.jsp'">
</div>

<table  class="content">
<tr>
<td class="bar" class="bar">档案编号</td>
<td colspan="7" class="pol"><input type="text" name="number" value="${list[0].getId()}"></td>
</tr>

<tr>
<td class="bar">原I级校区</td>
<td class="pol"><input type="text" name="org1" value="${list[0].getGroup()}"></td>
<td class="bar">原II级校区</td>
<td class="pol"><input type="text" name="org2" value="${list[0].getCompany()}"></td>
<td class="bar">原III级校区</td>
<td class="pol"><input type="text" name="org3" value="${list[0].getDepartment()}"></td>
<td class="bar">姓名</td>
<td class="pol"><input type="text" name="name" value="${list[0].getName()} "></td>
</tr>

<tr>
<td class="bar">原专业分类</td>
<td class="pol"><input type="text" name="post1" value="${list[0].getJob()}"></td>
<td class="bar">原专业名称</td>
<td class="pol"><input type="text" name="post2" value="${list[0].getJobtittle()}"></td>
<td class="bar">复核状态</td>
<td class="pol"><input type="text" name="state" value="${list[0].getStates()}"></td>
<td class="bar"></td>
<td class="pol"></td>
</tr>


<tr>
<td class="bar">新I级校区</td>
<td class="pol"><select id="pro" name="a"></select></td>
<td class="bar">新II级校区</td>
<td class="pol"><select id="second" name="b"></select></td>
<td class="bar">新III级校区</td>
<td class="pol"><select id="third" name="c"></select></td>
<td class="bar"></td>
<td class="pol"></td>
</tr>


<tr>
<td class="bar">新专业分类</td>
<td class="pol"><select id="sort" name="d"></select></td>
<td class="bar">新专业名称</td>
<td class="pol"><select id="jname" name="e"></select></td>
<td class="bar"></td>
<td class="pol"></td>
<td class="bar"></td>
<td class="pol"></td>
</tr>

<tr>
<td class="bar">登记人</td>
<td class="pol"><input type="text" value="admin"></td>
<td class="bar">登记时间</td>
<td class="pol"><input type="text" name="getBookTime" id="getBookTime" value=""></td>
<td class="bar"></td>
<td class="pol"></td>
<td class="bar"></td>
<td class="pol"></td>
</tr>

<tr>
<td class="bar">转班原因</td>
<td colspan="7" class="pol"><input type="textarea"></td>
</tr>
</table>
</div>
</form>
</body>
</html>