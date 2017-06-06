<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="entity.*,java.util.*,service.*,service.impl.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/jwj.js"></script>
<style type="text/css">
    .bar{
			background-color:#FAFAFA;
			text-align: center;
		}
	  .c{
	        background-color:#E9F8F3;
	    }
</style>
</head>
<body>
<%List<Postjob> list=(List<Postjob>)request.getAttribute("list");
  request.setAttribute("Postjob",list);
%>
<table >
<tr>
<td class="bar">发布编号</td>
<td class="bar">专业名称</td>
<td class="bar">校区名称</td>
<td class="bar">招生人数</td>
<td class="bar">发布时间</td>
<td class="bar">截止时间</td>
<td class="bar">修改</td>
<td class="bar">删除</td>
</tr>
<c:forEach items="${requestScope.Postjob}" step="1" var="Postjob" varStatus="st">
<tr>
<td class="c">${Postjob.getId()}</td>
<td class="c">${Postjob.getSecondpost()}</td>
<td class="c">${Postjob.getSecondorg()}</td>
<td class="c">${Postjob.getPersonnumber()}</td>
<td class="c">${Postjob.getFiling_time()}</td>
<td class="c">${Postjob.getEtime()}</td>
<td class="c"><input type="button" value="修改" onclick="UpdateById1(this)"></td>
<td class="c"><input type="button" value="删除" onclick="DeleteById(this)"></td>
</tr>
</c:forEach>
</table>
</body>
</html>