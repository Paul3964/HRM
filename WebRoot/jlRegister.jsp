<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="entity.*,java.util.*,service.*,service.impl.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学员信息登记</title>
<link rel="stylesheet" href="css/bootstrap.css" />	
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>
<style type="text/css">
		*{
			padding:0px;
			margin:0px;
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
<body>
<%Postjob postjob=(Postjob)request.getAttribute("postjob"); %>
<span style="color:#1214FE">您正在做的业务是：教育培训机构管理系统--学员管理--学员信息登记</span>
  	<form action="irs" method="post">
  	<input type="submit" value="提交" style="float:right" />
  	<input type="reset" value="清除" style="float:right" />
	<table style="width:100%;height:600px;background-color:#E9F8F3;">
     <tr class="hi">
     	<td class="bar">专业分类</td>
     	<td>
     		<input type="text" name="firstpost" readonly= "true" value="<%=postjob.getFirstpost()%>">
     	</td>
     	<td class="bar">专业名称</td>
     	<td>
     	    <input type="text" name="secondpost" readonly= "true" value="<%=postjob.getSecondpost()%>">
     	</td>
     	<td class="bar">课程类型</td>
     	<td colspan="2">
     		<select id="type" name="posttype">
     			<option>普通课程</option>
     			<option>精英课程</option>
     		</select>
     	</td>
     	<td rowspan="5"></td>
     </tr>
     <tr class="hi">
     	<td class="bar">姓名</td>
     	<td><input type="text" name="name"/></td>
     	<td class="bar">性别</td>
     	<td>
     		<select name="gender">
     			<option value="男">男</option>
     			<option value="女">女</option>
     		</select>
     	</td>
     	<td class="bar">Email</td>
     	<td colspan="2"><input type="text" name="Email"/></td>
     </tr>
     <tr class="hi">
     	<td class="bar">电话</td>
     	<td><input type="text" name="phone"/></td>
     	<td class="bar">家庭电话</td>
     	<td><input type="text" name="telephone"/></td>
     	<td class="bar">手机</td>
     	<td colspan="2"><input type="text" name="mobile"/></td>
     </tr>
     <tr class="hi">
     	<td class="bar">住址</td>
     	<td colspan="3"><input type="text" name="address"/></td>
     	<td class="bar">邮编</td>
     	<td colspan="2"><input type="text" name="postcode"/></td>
     </tr>
     <tr class="hi">
     	<td class="bar">国籍</td>
     	<td>
     		<select name="nationality">
     			<option value="中国">中国</option>
     		</select>
     	</td>
     	<td class="bar">出生地</td>
     	<td><input type="text" name="birthplace"/></td>
     	<td class="bar">生日</td>
     	<td><input type="text" name="birthday"/></td>
     	</tr>
     	<tr>
     	<td class="bar">民族</td>
     	<td>
     		<select name="nation">
     			<option value="汉族">汉族</option>
     		</select>
     	</td>
     	<td class="bar">宗教信仰</td>
     	<td>
     		<select name="religion">
     			<option value="无">无</option>
     			<option value="佛教">佛教</option>
     			<option value="耶稣">耶稣</option>
     		</select>
     	</td>
     	<td class="bar">政治面貌</td>
     	<td>
     		<select name="status">
     			<option value="无">无</option>
     			<option value="团员">团员</option>
     			<option value="党员">党员</option>
     		</select>
     	</td>
     </tr>
     
     <tr class="hi">
     	<td class="bar">身份证号码</td>
     	<td>
     		<input type="text" name="IDcard"/>
     	</td>
     	<td class="bar">年龄</td>
     	<td><input type="text" name="age"/></td>
     	<td class="bar">毕业院校</td>
     	<td><input type="text" name="school"/></td>
     	<td class="bar">学历</td>
     	<td><select name="education">
     			<option value="职高">职高</option>
     			<option value="职大">职大</option>
     			<option value="专科">专科</option>
     			<option value="本科">本科</option>
     			<option value="硕士">硕士</option>
     			<option value="博士">博士</option>
     		</select></td>
     </tr>
     <tr>
     	<td class="bar">教育年限</td>
     	<td><select name="years">
     			<option value="16以下">16以下</option>
     			<option value="16">16</option>
     			<option value="16以上">16以上</option>
     		</select></td>
     </tr>
     <tr>
     	<td class="bar">学历专业</td>
     	<td><select name="profession">
     			<option value="计算机">计算机</option>
     			<option value="其他">其他</option>
     		</select></td>
     	<td class="bar">课程要求</td>
     	<td><input type="text" name="salary"/></td>
     	<td class="bar">注册时间</td>
     	<td><input type="text" name="time"/></td>
     </tr>
      <tr>
     	<td class="bar">课程需求</td>
     	<td colspan="7"><input type="textarea" name="resume"/></td>
     </tr>
      <tr>
     	<td class="bar">备注</td>
     	<td colspan="7"><input type="textarea" name="remark"/></td>
     </tr>
    </table>
    </form>
</body>
</html>