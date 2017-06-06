<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>复核界面</title>
</head>
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
<body>
<span style="color:#1214FE">您正在做的业务是：教育培训机构管理系统--学员管理--学员资料复核</span>
  	<form action="register" method="post">
  	<div style="width:1200px;height:900px;">
  	<input type="button" value="返回" style="float:right;" onclick="javascript:location.href='organization.jsp'" />
  	<input type="reset" value="清除" style="float:right;" />
  	<input type="submit" value="复核通过" style="float:right;" />
	<table id = "touming4" style="width:100%;height:600px;background-color:#E9F8F3;">
    <tr class="hi">
    <td class="bar">档案编号</td>
   	<td colspan="6"><input type="text" name="number"/></td>
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
     	<td class="bar">专业分类</td>
     	<td>
     		<select id="sort" name="sort1">
     		
     		</select>
     	</td>
     	<td class="bar">专业名称</td>
     	<td>
     		<select id="jname" name="jname2">
     			
     		</select>
     	</td>
     	<td class="bar">专业</td>
     	<td colspan="2">
     		<select id="titile" name="titile3">
     			
     		</select>
     	</td>
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
     	<td class="bar">QQ</td>
     	<td><input type="text" name="QQ"/></td>
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
     	<td class="bar">民族</td>
     	<td>
     		<select name="nation">
     			<option value="汉族">汉族</option>
     		</select>
     	</td>
     </tr>
     
     <tr class="hi">
     	<td class="bar">课程标准</td>
     	<td>
     		<select name="salary_standard">
     			<option value="普通班/10500">普通班/10500</option>
     			<option value="精英班/20500">精英班/20500</option>
     		</select>
     	</td>
     	<td class="bar">建档时间</td>
     	<td><input type="text" name="filing_time"/></td>
     	<td class="bar">账号</td>
     	<td><input type="text" name="account"/></td>
     	<td class="bar">登记人</td>
     	<td><input type="text" name="registrant"/></td>
     </tr>
     <tr>
     	<td class="bar">个人学习情况</td>
     	<td colspan="7"><input type="textarea" name="resume"/></td>
     </tr>
     <tr>
     	<td class="bar">培训需求</td>
     	<td colspan="7"><input type="textarea" name="family"/></td>
     </tr>
      <tr>
     	<td class="bar">备注</td>
     	<td colspan="7"><input type="textarea" name="notes"/></td>
     </tr>
     
    </table>
    	 <div  class = "btn2" style = "width:100px;height:30px;margin-left:900px;margin-top:50px;background-color:#FFCCCC;text-align:center;lign-height:20px;">
		<a href="main.jsp" >返回主页</a>	
   </div> 
    </div>
    </form>
  </body>



</body>
</html>