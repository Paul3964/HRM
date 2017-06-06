<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>exam.jsp</title>
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
	


  </head>
  
  <body>
    <table  style="width:100%;height:100px;background-color:#E9F8F3;">
    	<tr class="hi">
   	 		<th class="bar">专业分类编号</th>
   	 		<th class="bar">专业分类名称</th>
   	 		<th class="bar">专业编号</th>
   	 		<th class="bar">专业名称</th>

   	 		<th class="bar">出题</th>
   	 	</tr>
   	 	
    	<c:forEach items="${pager.test}" var="test">
	   	 	<tr class="hi">
	   	 		<td class="bar1" name="id">${test.id}</td>
	   	 		<td class="bar1" name="a">${test.a}</td>
	   	 		<td class="bar1" name="id2">${test.id2}</td>
	   	 		<td class="bar1" name="b">${test.b}</td>
	   	 		<td class="bar1"><a href="javascript:location.href='create'">出题</a></td>
	   	 		
	   	 	</tr>
	   	 </c:forEach>
    	
	    <tr class="bar1">
	   	 	<td colspan="5">
	   	 	<a href="DateServlet1?pageNum=1">首页</a>
	   	 	<a href="DateServlet1?pageNum=${pager.currentPage-1>1?pager.currentPage-1:1 }">上一页</a>
	   	 	<a href="DateServlet1?pageNum=${pager.currentPage+1<pager.totalPage?pager.currentPage+1:pager.totalPage}">下一页</a>
	   	 	<a href="DateServlet1?pageNum=${pager.totalPage}">尾页</a>
	   	 	</td>
	   	 </tr>
	   	 
    </table>
  </body>
</html>
