<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>Test_reg.jsp</title>
    <link rel="stylesheet" href="css/bootstrap.css" />	
	<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="js/test1.js"></script>
	<style type="text/css">
	    #touming1{
	    	filter:alpha(opacity=80); 
            -moz-opacity:0.8; 
            opacity:0.5;
	    }
		*{
			padding:0px;
			margin:0px;
		}
		.bar{
			background-color:#FAFAFA;
			text-align: center;
		}
		.h{
			height:5%
		}
		.hi{
			height:15%;
		}
		select{
			width:100%;
		}
		input[type^=text]{
			width:100%;
			height:100%
		}	
	</style>


  </head>
  
  <body>
  	<span style="color:#1214FE">您现在做的业务是：教育培训机构管理系统-在线考试系统--新建题目</span>
  	<form action="TestServlet" method="post">
  	<div style="width:1250px;height:900px;">
  	<input type="submit" value="提交" style="float:right" />
  	<input type="reset" value="清除" style="float:right" />
  	<input type="button" value="返回主页" style="float:right" onclick="javascript:location.href='main.jsp'" />
  	<table style="width:100%;height:600px;background-color:#E9F8F3;">
  		<tr class="h">
  			<td class="bar">试题I级分类</td>
  			<td>
  				<select id="ftest" name="ftest">
  				</select>
  			</td>
  			<td class="bar">试题II级分类</td>
  			<td>
  				<select id="stest" name="stest">
  				</select>
  			</td>
  			<td class="bar">登记人</td>
  			<td><input type="text" value="admin" name="resume"></td>
  			<td class="bar">登记时间</td>
  			<td><input type="text" name="filing_time"></td>
  		</tr>
  		<tr class="hi">
  			<td class="bar">题干</td>
  			<td colspan="7"><input type="textarea" name="question"></td>
  		</tr>
  		<tr class="hi">
  			<td class="bar">答案a</td>
  			<td colspan="7"><input type="textarea" name="a"></td>
  		</tr>
  		<tr class="hi">
  			<td class="bar">答案b</td>
  			<td colspan="7"><input type="textarea" name="b"></td>
  		</tr>
  		<tr class="hi">
  			<td class="bar">答案c</td>
  			<td colspan="7"><input type="textarea" name="c"></td>
  		</tr>
  		<tr class="hi">
  			<td class="bar">答案d</td>
  			<td colspan="7"><input type="textarea" name="d"></td>
  		</tr>
  		<tr class="hi">
  			<td class="bar">答案e</td>
  			<td colspan="7"><input type="textarea" name="e"></td>
  		</tr>
  		<tr class="h">
  			<td class="bar">正确答案</td>
  			<td><input type="text" name="answer"></td>
  			<td class="bar">试题出处</td>
  			<td><input type="text" name="source"></td>
  			<td class="bar"></td>
  			<td></td>
  			<td class="bar"></td>
  			<td></td>
  		</tr>
  	</table>
  	</div>
  	</form>
  </body>
</html>
