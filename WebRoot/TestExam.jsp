<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>考试答题</title>	
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
	.wi{
			width:20%;	
		}
		
	</style>
	<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
  </head>
  
  <body>
     <span style="color:#1214FE">您正在做的业务是：人力资源--招聘管理--招聘考试管理--考试答题</span>
    
     <form action="" method="post">
     	<input type="button" value="提交" style="float:right" onclick="alert('试卷提交成功')"/>
  			<table style="width:100%;height:100px;background-color:#E9F8F3;">

				<tr class="hi">
    				<td class="bar">试卷编号</td>
    				<td>${questions[0].id}</td>
    				<td class="bar">试题分类</td>
    				<td>${questions[0].spost}</td>
    			</tr >
    			
    			<tr class="hi">
    			  <td class="bar">出卷人</td>
    			  <td>${questions[0].resigner}</td>
    			  <td class="bar">答题时限(分钟)</td>
    			  <td>${questions[0].atime}</td>
    			</tr>	
    			
    			<c:forEach items="${tests}" var="tests">
  	  			<tr>
  	  				<th><span>题目:</span>${tests.question}</th>
  	  				<td><input type="checkbox" name="a"><span>A.</span>${tests.a}</td>
  	  				<td><input type="checkbox" name="b"><span>B.</span>${tests.b}</td>
  	  				<td><input type="checkbox" name="c"><span>C.</span>${tests.c}</td>
  	  				<td><input type="checkbox" name="d"><span>D.</span>${tests.d}</td>
  	  				<td><input type="checkbox" name="e"><span>E.</span>${tests.e}</td>
  	  			</tr>
  	  			</c:forEach>
  			</table>
     </form>
  </body>
</html>
