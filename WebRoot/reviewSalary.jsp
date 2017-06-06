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

	<form action="audit" method="post">
		<c:forEach items="${review }" var="r">
		<div class="input-group input-group-sm" style="width:100%;margin:0 auto;text-align:center">
            <span class="input-group-addon">单据编号:</span>
            <input type="text" class="form-control" value="${r.number }" name =number>
              <span class="input-group-addon">单据名称:</span>
            <input type="text" class="form-control" value="${r.post }">
            <span class="input-group-addon">总额:</span>
            <input type="text" class="form-control" value="${r.count }">
             <span class="input-group-addon">制定者:</span>
            <input type="text" class="form-control" value="${r.markes }">
             <span class="input-group-addon">审核者:</span>
            <input type="text" class="form-control" value="${r.registrant }">
              <span class="input-group-addon">审核时间:</span>
            <input type="text" class="form-control"value="${r.time }" style="width:194px">
   	    </div>
   	    	
   	    <div class="form-group" style="margin:0;padding:0">
   	      	 <div style="float:left;margin-left:0px";margin:0;padding:0>
			  	<span class="input-group-addon" style="width:50px;height:91px;">审核意见:</span>
		  	 </div>
			 <div style="margin:0;padding:0;">
			   <textarea class="form-control" rows="3" style="width:93.5%;" name="message"></textarea>
			 </div>
		 </div>
		<div style="width:100%;padding:0;margin:0;text-align:center;margin-right:auto;margin-left:auto">
				<span class="input-group-addon">编号:</span> <span class="input-group-addon">单据名称:</span> <span class="input-group-addon">金额:</span>
		</div>
		

           
			<table class="table table-hover" style="width:100%;margin:0 auto;text-align:center">
			   		<tr class="active">
			   		
						<td>1</td>
						<td>基本款项</td>
						<td><input type="text" value="${r.standard }" readonly='true'></td>
					</tr>
					<tr class="active">
							
						<td>2</td>
						<td>交通款项</td>
						<td><input type="text" value="${r.travel }" readonly='true'></td>
					</tr>
					<tr class="active">
						
						<td>3</td>
						<td>通讯款项</td>
						<td><input type="text" value="${r.message }" readonly='true'></td>
					</tr>
					<tr class="active">
						
						<td>4</td>
						<td>浮动款项</td>
						<td><input type="text" value="${r.drift }" readonly='true'></td>
					</tr>
					<tr class="active">
						
						<td>5</td>
						<td>常规</td>
						<td><input type="text" value="${r.common }" readonly='true'></td>
					</tr>
					<tr class="active">
						
						<td>6</td>
						<td>午餐款项 </td>
						<td><input type="text" value="${r.lunch }"readonly='true'></td>
					</tr>
					<tr class="active">
						
						<td>7</td>
						<td>交通款项</td>
						<td><input type="text" value="${r.traffic }" readonly='true'></td>
					</tr>
					<tr class="active">
						
						<td>8</td>
						<td>车补</td>
						<td><input type="text" value="${r.car }" readonly='true'></td>
					</tr>
			</table>
     	</c:forEach>
     		<table style="margin:0 auto">
     			<tr>
     				<td>
     					<input type="submit" value="通过审核" class="btn btn-success">
     					<button type="button" class="btn btn-success" onclick="backmain()">返回系统</button>
     				</td>
     			</tr>
     		</table>
	</form>
</body>
</html>