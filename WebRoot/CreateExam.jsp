<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>CreateExam.jsp</title>
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
      <span style="color:#1214FE">您正在做的业务是：教育培训机构管理系统-在线考试系统-试题查询</span>
	  <form  action="CreateExamServlet1" method="post">
      <input type="submit" value="创建" style="float:right"/>
  	  <input type="reset" value="清除" style="float:right" />
  	  <table style="width:100%;height:100px;background-color:#E9F8F3;">
  	  			<tr>
  	  			<td class="bar">试卷编号</td>
     				<td>
  	  					<input type="text" value="" name="id">
     				</td>
  	  			</tr>
  	  			<tr >
  	  				<td class="bar">专业分类</td>
  	  				<td>
  	  					<input type="text" value="理科" name="fpost">
     				</td>
     				
  	  			</tr>
  	  			<tr>
  	  				<td class="bar">专业名称</td>
  	  				<td>
  	  					<input type="text" value="高数" name="spost">
     				</td>
  	  				<td class="bar">登记人</td>
  	  				<td><input type="text" value="admin" name="resigner"></td>
  	  				<td class="bar">登记时间</td>
  	  				<td><input type="text" value="1995-02-13" name="time"></td>
  	  				<td class="bar">答题限时(分钟)</td>
  	  				<td><input type="text" value="60" name="atime"></td>
  	  			</tr>
  	  			<tr>
  	  				<td class="bar">文科</td>
  	  				<td colspan="3">试题II级分类名称</td>
  	  				<td colspan="2">可用试题数量</td>
  	  				<td colspan="2">出题数量</td>
  	  			</tr>
  
  	  			<c:forEach items="${posts}" var="posts">
  	  			<tr>
  	  				<td class="bar"></td>
  	  				<td colspan="3"><input type="hidden" value="${posts.titile}" name="titile" >${posts.titile}</td>
  	  				<td colspan="2">${posts.id }</td>
  	  				<td colspan="2"><input type="text" value="" name="postn"></td>
  	  			</tr>
  	  			</c:forEach>
  	  			
  	  			<tr>
  	  				<td class="bar">理科</td>
  	  				<td colspan="3">试题II级分类名称</td>
  	  				<td colspan="2">可用试题数量</td>
  	  				<td colspan="2">出题数量</td>
  	  			</tr>
  	  			
  
  	  			<c:forEach items="${postI}" var="postI">
  	  			<tr>
  	  				<td class="bar"></td>
  	  				<td colspan="3"><input type="hidden" value="${postI.name}" name="name1" >${postI.name}</td>
  	  				<td colspan="2">${postI.num}</td>
  	  				<td colspan="2"><input type="text" value="" name="postIn"></td>
  	  			</tr>
  	  			</c:forEach>
  	  			
  	  			
  	  			<tr>
  	  				<td class="bar">专业类</td>
  	  				<td colspan="3">试题II级分类名称</td>
  	  				<td colspan="2">可用试题数量</td>
  	  				<td colspan="2">出题数量</td>
  	  			</tr>
 	
  	  			<c:forEach items="${postII}" var="postII">
  	  			<tr>
  	  				<td class="bar"></td>
  	  				<td colspan="3"><input type="hidden" value="${postII.name}" name="name2" >${postII.name}</td>
  	  				<td colspan="2">${postII.num}</td>
  	  				<td colspan="2"><input type="text" value="" name="postIIn"></td>
  	  			</tr>
  	  			</c:forEach>
      </table>	
      </form>
  </body>
</html>
