<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 <script src="http://cdn.static.runoob.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>教育培训机构管理系统主界面</title>
<link rel="stylesheet" href="css/index.css" />
<script type="text/javascript" src="js/myjs.js"></script>

</head>
<body  style="margin-top:-40px;height:1100px;">

	<div class="box">
		<div class="top">
			<div class="top1" style="background-image: url(picture/蓝花1.jpg);"><img src = "picture/logo.gif" style = "float:left;margin-left :25px;margin-top:10px;">
			<p style="margin-left: 150px;margin-top: 40px;font-size: 40px;color:#FF1493;">启明星教育培训机构管理系统</p>			
			</div>
				  	
		 <div class="left">
			<div class="menu">
				<div class="panel-group" id="accordion">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion" 
								   href="#collapseOne">
									系统简介
								</a>
							</h4>
						</div>
						
						<div id="collapseOne" class="panel-collapse collapse in">
							<div class="panel-body">
								<ul class="list-group">
									<li class="list-group-item" id = "1"><a href = "Introduction.jsp">系统简介</a></li>
									<li class="list-group-item" id = "3"><a href = "Introduction3.jsp">功能介绍</a></li>
							    </ul>
							</div>
						</div>
					</div>
					
							
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion" 
								   href="#collapseTwo">
									学员管理
								</a>
							</h4>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse">
							<div class="panel-body">
								<ul class="list-group">
									<li class="list-group-item" id = "6"><span onclick="main6()">学员报班转班和审核</span></li>
									<li class="list-group-item" id = "5"><span onclick="main5()">学员转班信息管理</span></li>
									
								</ul>	
							</div>
						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion" 
								   href="#collapseFour">
									教学管理
								</a>
							</h4>
						</div>
						<div id="collapseFour" class="panel-collapse collapse">
							<div class="panel-body">
								<ul class="list-group">
									<li class="list-group-item" id = "10"><span onclick="main10()">课程发布</span></li>
									<li class="list-group-item" id = "11"><span onclick="main11()">课程信息查询</span></li>
									<li class="list-group-item" id = "17"><span onclick="main17()">教师办公</span></li>
								</ul>
							</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion" 
								   href="#collapsefive">
									题库系统
								</a>
							</h4>
						</div>
						<div id="collapsefive" class="panel-collapse collapse">
							<div class="panel-body">
								<ul class="list-group">
									<li class="list-group-item" id = "12"><span onclick="main12()">题目管理</span></li><br />
									<li class="list-group-item" id = "13"><span onclick="main13()">试题管理</span></li>
								</ul>	
							</div>
						</div>
					</div>
					
				</div>	
			</div>	
		</div>
			
			
			
		<div class="main" id="main" style= "background-color:#E8F2FE">
			<div style= "width:100%;height:100%;margin-left:300px;margin-top:200px;">
				
				<p style="font-size:38px;font-family:YouYuan;color:#000000;">欢迎来到启明星教育培训机构管理系统</p>		
				<div id = "time" style = "height:300px;width:600px;text-align:center">
					<span style="font-size:40px;font-family:YouYuan;color:#006699;">当前时间为：</span>
			    	<input type = "text" id = "tt" readonly = "readonly" style = "font-size:30px;height:80px;width:350px;">
             	</div>
			</div>
	
			<script>
				setInterval("document.getElementById('tt').value=new Date().toLocaleString();",1000);
			</script>
			
			
		</div>	
			
		<div class="footer">
			  <p id ="follow1">关注我们 </p><br>
              <p id ="follow2">我们活跃在各类社交平台，您可以选择自己喜欢的方式来关注我们，获取更多的资讯</p>
	                <div class = "pictures">
	                        <span><img class = "tu" src = "picture/豆瓣1.jpg" width ="50px" height ="50px"></span>
	                        <span><img class = "tu" src = "picture/腾讯微博.jpg" width ="50px" height ="50px"></span>
	                        <span><img class = "tu" src = "picture/QQ1.png" width ="50px" height ="50px"></span>
	                        <span><img class = "tu" src = "picture/微信1jpg.jpg" width ="50px" height ="50px"></span>
	                </div>
         </div> 		
		</div>
			
	</div>	

	
</body>
</html>