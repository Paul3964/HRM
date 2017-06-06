<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    
    <title>Campus.jsp</title>
    <link rel="stylesheet" href="css/bootstrap.css" />	
	<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="js/test.js"></script>
   <style type="text/css">
		tr{
		 	border:1px solid;
		}
		td{
			border:1px solid;
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
   <span style="color:#1214FE">您正在做的业务是：教育培训机构管理--校长管理--校区管理</span>
   <form action="campus" method="post" >
  	<input type="submit" value="提交" style="float:right" />
  	<input type="reset" value="清除" style="float:right" />
	  	<table style="width:100%;height:300px;background-color:#E9F8F3;border:1px solid;">
	  		 <tr class="hi">
			    <td colspan="3" class="bar">校区编号</td>
			   	<td colspan="3"><input type="text" name="number"/></td>
		     </tr>
		    <tr class="hi">
		     	<td class="bar">I级校区</td>
		     	<td>
		     		<select id="pro" name="firstorg1">
		     		</select>
     			</td>
	     		<td class="bar">II级校区</td>
	     		<td>
		     		<select id="second" name="secondorg2">
		     		</select>
	     		</td>
		     	<td class="bar" >III级校区</td>
		     	<td colspan="2">
		     		<select id="third" name="thirdorg3">   		
		     		</select>
		     	</td>
	     	</tr>
	     <tr class="hi">
	     	<td class="bar">校长姓名</td>
	     	<td><input type="text" name="name"/></td>
	     	<td class="bar">校区注册时间</td>
	     	<td><input type="text" name="filing_time" id="getBookTime" value=""/></td>
	     	<td class="bar">招收专业</td>
	     	<td><input type="text" name="major"/></td>
	     	<td class="bar">可招人数</td>
	     	<td><input type="text" name="pnum"/></td>
	     </tr>
	     
	     <tr class="hi">
	     	 <td class="bar" colspan="8">校长联系方式</td>
     	 </tr>
     	 <tr class="hi">
	     	<td class="bar">手机号码：</td>
	     	<td><input type="text" name="phone1"/></td>
	     	<td class="bar">第二联系号码：</td>
	     	<td><input type="text" name="phone2"/></td>
	     	<td class="bar">QQ：</td>
	     	<td><input type="text" name="QQ"/></td>
	     	<td class="bar">电子邮箱：</td>
	     	<td><input type="text" name="email"/></td>
	     </tr>
	  	</table>
  	</form>
  </body>
</html>
