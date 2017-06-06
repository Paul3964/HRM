<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="entity.*,java.util.*,service.*,service.impl.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css" />	
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>
<style type="text/css">
		*{
			padding:0px;
			margin:0px;
		}
		.c{
		    background-color:#E9F8F3;
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
			height:100%
		}	
	</style>
</head>
<body class="c">
<%Postjob postjob=(Postjob)request.getAttribute("postjob");
  int id=(int)request.getAttribute("id");
  request.setAttribute("postjob", postjob);
%>
<span style="color:#1214FE">您正在做的业务是：教育培训机构管理系统--教学管理--课程发布管理--课程信息变更</span>
<form action="ups" method="post">
  	<input type="submit" value="重新提交" style="float:right" />
  	<input type="button" value="返回" onclick="toback()" style="float:right" />
	<table style="width:100%;height:300px;background-color:#E9F8F3;">
	<tr class="hi">
	<td class="bar">发布编号</td>
	<td colspan="7"><input type="text" name="id" readonly= "true " value="<%=id%>"></td>
    <tr class="hi">
     	<td class="bar">I级校区</td>
     	<td>
     		<input type="text" readonly= "true " value="<%=postjob.getFirstorg()%>">
     	</td>
     	<td class="bar">II级校区</td>
     	<td>
     		<input type="text" readonly= "true " value="<%=postjob.getSecondorg()%>">
     	</td>
     	<td class="bar" >III级校区</td>
     	<td>
     		<input type="text"  readonly= "true " value="<%=postjob.getThirdorg()%>">
     	</td>
     	<td class="bar">课程类型</td>
     	<td>
     	<select  id="type" name="posttype">
     	<option>一般课程</option>
     	<option>精英课程</option>
     	</select>
     	</td>
     </tr>
     <tr class="hi">
     	<td class="bar">专业分类</td>
     	<td>
     		<input type="text" readonly= "true " value="<%=postjob.getFirstpost()%>">
     	</td>
     	<td class="bar">专业名称</td>
     	<td>
     		<input type="text" readonly= "true " value="<%=postjob.getSecondpost()%>">
     	</td>
     	<td class="bar">招生人数</td>
     	<td>
     		<input type="text" name="personnumber" value="<%=postjob.getPersonnumber()%>">
     	</td>
     	<td class="bar">截止日期</td>
     	<td>
     		<input type="text" name="etime" value="<%=postjob.getEtime()%>">
     	</td>
     </tr>
     <tr class="hi">
     	<td class="bar">登记人</td>
     	<td>
     		<input type="text" name="register" value="<%=postjob.getRegister()%>">
     	</td>
     	<td class="bar">登记时间</td>
     	<td>
     	    <input type="text" name="filing_time" value="<%=postjob.getFiling_time()%>">
     	</td>
     	<td class="bar"></td>
     	<td>
     	</td>
     	<td class="bar"></td>
     	<td>
     	</td>
     </tr>
     <tr>
        <td style="text-valign:middle;" class="bar">课程描述 </td>
        <td colspan="7">
        <input type="textarea" name="detail" value="<%=postjob.getDetail()%>">
        </td>    
     </tr>
     <tr>
        <td style="text-valign:middle;" class="bar">课程要求 </td>
        <td colspan="7">
        <input type="textarea" name="demand" value="<%=postjob.getDemand()%>">
        </td>    
     </tr>
</table>
</form>
</body>
</html>