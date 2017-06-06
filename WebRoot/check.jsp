<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<script type="text/javascript" src="js/myjs.js"></script>
  <head>
    <title>添加显示</title>
    <style type="text/css">
		.bar{
			background-color:#FAFAFA;
			text-align: center;
		}
		.hi{
			height:3%;
		}
	.bar1{	
			text-align: center;
		}
	</style>
	<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="js/myjs.js"></script>
  </head>
  
  <body>
     <div style="width:1250px;height:500px;">
   	 <table style="text-align:center;width:100%;margin-left:auto;margin-right:auto;">
   	 	<tr class="hi">
   	 		<th class="bar">档案编号</th>
   	 		<th class="bar">姓名</th>
   	 		<th class="bar">性别</th>
   	 		<th class="bar">电话</th>
   	 		<th class="bar">登记人</th>
   	 		<th class="bar">状态</th>
   	 	</tr>
	   	 
	   	 <c:forEach items="${pager.employees}" var="employee">
	   	 	<tr class="hi">
	   	 		<td class="bar1">${employee.eid}</td>
	   	 		<td class="bar1">${employee.name}</td>
	   	 		<td class="bar1">${employee.gender}</td>
	   	 		<td class="bar1">${employee.phone}</td>
	   	 		<td class="bar1">${employee.registrant}</td>
	   	 		<td class="bar1">${employee.states}</td>
	   	 	</tr>
	   	 </c:forEach>
	   	 
   	 <tr>
   	 	<td colspan="8">
   	 	<a href="DateServlet?pageNum=1">首页</a>
   	 	<a href="DateServlet?pageNum=${pager.currentPage-1>1?pager.currentPage-1:1 }">上一页</a>
   	 	<a href="DateServlet?pageNum=${pager.currentPage+1<pager.totalPage?pager.currentPage+1:pager.totalPage}">下一页</a>
   	 	<a href="DateServlet?pageNum=${pager.totalPage}">尾页</a>
   	 	<a href="javascript:location.href='main.jsp'">返回首页</a>
   	 	</td>
   	 </tr>
    </table>
    </div>
  </body>
</html>
