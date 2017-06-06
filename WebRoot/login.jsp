<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>
	<link rel="stylesheet" href="css/bootstrap.css" />
	<style type="text/css">
		.content {
			width: 350px;
			margin-top: 150px;
		}
		.custom-login-btn {
			width: 80px;
			margin-left:45px;
		}
		p{
			text-align: center;
			font-size:30px;
			margin-top:-50px;
			
		}
		
	</style>
	<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="js/myjs.js"></script>
</head>

<body style="background-image: url(picture/樱花背景3.jpg);height:100%;">


<div class="container content" >
		<p >启明星教育培训机构管理系统</p>
			<form action="login" method="post" >
				<div class="form-group">
					<label for="uername">用户名:</label>
					<input type="text" class="form-control" id="username" onblur="checkUser()" placeholder="请输入用户名" name="name">
					<div id="error1" class="alert alert-danger" role="alert" style="display: none;">用户名不存在，请重新输入</div>
				</div>
				
				<div class="form-group">
					<label for="password">密码:</label>
					<input type="password" class="form-control" id="password" onblur="checkPassword()" placeholder="请输入密码" name="password">
					<div id="error2" class="alert alert-danger" role="alert" style="display: none;">密码不能为空</div>
				</div>
		
				<div class="checkbox">
				   <div>
				    <input type="radio" name="teacher" value="teacher"/>教员
					<input type="radio" name="principal" value="principal"/>校长
					<input type= "radio" name="finance" value="finance"/>财务
				   </div>
					<br>
					<label> 
				      	<input type="checkbox"> 记住密码
				    </label> 
				</div>
				<button type="submit" class="btn btn-primary custom-login-btn">登陆</button>
				<button type="reset" class="btn btn-primary custom-login-btn">重置</button>
			</form>
</div>

</body>
</html>