<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="entity.*,java.util.*,service.*,service.impl.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>校区列表</title>
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
<table style="margin:0 auto;width:80%" class="table table-hover">
<tr class="danger" style="font-weight:bold;height:50px;">
<td>校区编号</td>
<td>校长姓名</td>
<td>招收专业</td>
<td>可招人数</td>
<td>联系方式</td>
<td>校区注册时间</td>
</tr>
<c:forEach items="${list}" var="list">
<tr class="active">
<td>${list.getId()}</td>
<td>${list.getName()}</td>
<td>${list.getMajor()}</td>
<td>${list.getPnum()}</td>
<td>${list.getPhone1()}</td>
<td>${list.getFilingTime()}</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>