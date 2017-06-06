<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<script type="text/javascript" src="js/myjs.js"></script>
  <head>

    
    <title>date.jsp</title>
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
	<script type="text/javascript" src="js/test1.js"></script>
	<script type="text/javascript">
 	 $(function(){
	 		$("#btn").click(function(){
	 			var data = $("#form").serialize();
				  $.post("SearchServlet",data,function(responseData){
					$("#main").html(responseData);
				})
			})  
		}) 
		 
		
		function skipPage(page){
			var data = $("#form").serialize();
		//	alert("SearchServlet"+data+"&pageNum="+page);
			$("#main").load("SearchServlet?"+data+"&pageNum="+page);
		} 
	</script> 
  </head>
  
  <body>
   <span style="color:#1214FE">您正在做的业务是：教育培训机构管理系统-在线考试系统-题目查询</span>
     <form id="form" action="SearchServlet" method="post">
    	<input type="button" value="查询" style="float:right" id="btn"/>
  		<input type="reset" value="继续出题" onclick="javascript:location.href='Test_reg.jsp'" style="float:right" />
	     <table style="width:100%;height:100px;background-color:#E9F8F3;">
	     	<tr >
	     		<td class="bar">请选择试题分类</td>
	     		<td>
	     			<select id="ftest" name="ftest1" value="${condition.id}">
	     			</select>
	     		</td>
	     	</tr>
	     	<tr>
	     		<td class="bar">请输入关键字</td>
	     		<td><input type="text" name="key" value="${condition.a}"></td>
	     	</tr>
	     	<tr>
	     		<td class="bar">请输入登记时间</td>
	     		<td><input type="text" name="year1" value="${condition.filing_time}">至<input type="text" name="year2" value="${condition.filing_time2}">(YYYY-MM-DD)</td>
	     	</tr>
	     </table>
	  
     </form>	
   
   	 <table style="text-align:center;width:100%;margin-left:auto;margin-right:auto;background-color:#E9F8F3;">
   	 	<tr class="hi">
   	 		<th class="bar">题干</th>
   	 		<th class="bar">试题I级分类</th>
   	 		<th class="bar">试题II级分类</th>
   	 		<th class="bar">登记人</th>
   	 		<th class="bar">登记日期</th>
   	 		<th class="bar">出处</th>
   	 		<th class="bar">正确答案</th>
   	 	</tr>
	   	 
	   	 <c:forEach items="${pager.test}" var="test">
	   	 	<tr class="hi">
	   	 		<td class="bar1">${test.question}</td>
	   	 		<td class="bar1">${test.fname}</td>
	   	 		<td class="bar1">${test.sname}</td>
	   	 		<td class="bar1">${test.resume}</td>
	   	 		<td class="bar1">${test.filing_time}</td>
	   	 		<td class="bar1">${test.source}</td>
	   	 		<td class="bar1">${test.answer}</td>
	   	 	</tr>
	   	 </c:forEach>
	   	 
   	 <tr>
   	 	<td colspan="8">
   	 	<a href="javascript:skipPage('1')">首页</a>
   	 	<a href="javascript:skipPage('${pager.currentPage-1>1?pager.currentPage-1:1 }')">上一页</a>
   	 	<a href="javascript:skipPage('${pager.currentPage+1<pager.totalPage?pager.currentPage+1:pager.totalPage}')">下一页</a>
   	 	<a href="javascript:skipPage('${pager.totalPage}')">尾页</a>
   	 	</td>
   	 </tr>
    </table>

  </body>
</html>
