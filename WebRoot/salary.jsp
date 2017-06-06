<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/myjs.js"></script>

<link rel="stylesheet" href="css/bootstrap.css" />

</head>
<body>
	<form action="savesalary" method="post">
	<div style="margin:0 auto">
		<span style="color:#1214FE">您正在做的业务是：教育培训机构管理系统-财务管理-收入支出录入-单据创建</span>
	</div>
		<table  style="width:100%;" class="table">
		<tr>
			<td>单据编号:<input type="text" value="${number }" name="number" readonly='true'></td>
			<td>单据名称:<input type="text" name="post" placeholder="请输入单据名称"></td>
			<td>单据总额:<input type="text" name="count" id="sum"/></td>
			
			<td>制定人:<input type="text" name="markes" placeholder="请输入姓名"></td>
			<td>登记人:<input type="text" name="registrant" placeholder="请输入姓名"></td>
			<td>登记时间:<input type="text" id="time" name="time" value="${time}" style="width:210px;" readonly='true'></td>
		</tr>
		</table>
		<table  style="width:100%;margin:0 auto;text-align:center" class="table table-hover">
		<tr class="success" style="font-weight:bold;">
			<td>序号</td>
			<td>单据项目名称</td>
			<td>金额</td>
			<td></td>
		</tr>
		<tr class="active">
			<td>1</td>
			<td>基本款项</td>
			<td><input type="text" name="standard" class="check" placeholder="请输入数字" onkeyup="calculate(this)" id="a"></td><td><span style="display:none">请重新输入正确的格式</span></td>
		</tr>
		<tr class="active">
			<td>2</td>
			<td>交通款项</td>
			<td><input type="text" name="travel" class="check" placeholder="请输入数字" onkeyup="calculate(this)" id="b"></td><td><span style="display:none">请重新输入正确的格式</span></td>
		</tr>
		<tr class="active">
			<td>3</td>
			<td>通讯款项</td>
			<td><input type="text" name="message" class="check" placeholder="请输入数字" onkeyup="calculate(this)" id="c"></td><td><span style="display:none">请重新输入正确的格式</span></td>
		</tr>
		<tr class="active">
			<td>4</td>
			<td>浮动款项</td>
			<td><input type="text" name="difirt" class="check" placeholder="请输入数字" onkeyup="calculate(this)" id="d"></td><td><span style="display:none">请重新输入正确的格式</span></td>
		</tr>
		<tr class="active">
			<td>5</td>
			<td>常规</td>
			<td><input type="text" name="common" class="check" placeholder="请输入数字" onkeyup="calculate(this)" id="e"></td><td><span style="display:none">请重新输入正确的格式</span></td>
		</tr>
		<tr class="active">
			<td>6</td>
			<td>午餐款项</td>
			<td><input type="text" name="lunch" class="dd" placeholder="请输入数字" onkeyup="calculate(this)" id="f"></td><td class="war"><span style="display:none">请重新输入正确的格式</span></td>
		</tr>
		<tr class="active">
			<td>7</td>
			<td>交通款项</td>
			<td><input type="text" name="traffic" class="check" placeholder="请输入数字" onkeyup="calculate(this)" id="g"></td><td><span style="display:none">请重新输入正确的格式</span></td>
		</tr>
		<tr class="active">
			<td>8</td>
			<td>车补款项</td>
			<td><input type="text" name="car" class="check" placeholder="请输入数字" onkeyup="calculate(this)" id="h"></td><td><span style="display:none">请重新输入正确的格式</span></td>
		</tr>
	</table>
	<table style="margin:0 auto">
		<tr><td><input type="submit" value="提交" class="btn btn-warning">
		<input type="button" value="返回" onclick="backmain()" class="btn btn-warning"></td></tr>
	</table>
	</form>
</body>
</html>