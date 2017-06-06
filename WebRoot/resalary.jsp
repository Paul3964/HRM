<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>薪酬发放登记</title>
<link rel="stylesheet" href="css/salary.css" />
</head>
<body>
<span style="color:#1214FE">您正在做的业务是：人力资源--薪酬发放管理--薪酬发放登记</span>
<div id="nav" >
<input type="submit"  style="float:right;width:80px;height:30px;">
<input type="button" value="返回" style="float:right;width:80px;height:30px;">
</div>
<div id="top">
薪酬单编号:<input type="text"><br>
机构:&nbsp&nbsp&nbsp<input type="text"><br>
本机构总人数:<input type="text">基本薪酬总额:<input type="text">
<div style="width:1250px;height:750px;background-image: url(picture/大背景.jpg);">
<table id="table">
<tr>
<td>序号</td>
<td>档案编号</td>
<td>姓名</td>
<td>基本工资</td>
<td>交通补贴</td>
<td>通讯补贴</td>
<td>浮动工资</td>
<td>常规</td>
<td>午餐补助</td>
<td>交通补助</td>
<td>车补</td>
<td>奖励金额</td>
<td>销售绩效金额</td>
<td>应扣金额</td>
</tr>
<c:forEach items="${pager.staff }" var="p">
<td>${p.id}</td>
<td>档案编号</td>
<td>姓名</td>
<td>基本工资</td>
<td>交通补贴</td>
<td>通讯补贴</td>
<td>浮动工资</td>
<td>常规</td>
<td>午餐补助</td>
<td>交通补助</td>
<td>车补</td>
<td>奖励金额</td>
<td>销售绩效金额</td>
<td>应扣金额</td>
</c:forEach>

</table>
</body>
</html>