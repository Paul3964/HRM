<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="entity.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人力资源管理档案登记</title>
	<link rel="stylesheet" href="css/bootstrap.css" />
	<script type="text/javascript" src="js/myjs.js"></script>
	<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
	<style type="text/css">
		.bar{
			background-color:#FAFAFA;
			text-align: center;
		}
		.hi{
			height:3%;
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
  <%
  Employee employee=(Employee)request.getAttribute("employee");
  orgpost op=(orgpost)request.getAttribute("op");
  List<Post> list=(List<Post>)request.getAttribute("list");
  request.setAttribute("employee",employee);
  request.setAttribute("op",op);
  request.setAttribute("Post",list);
  %>
   <div style="background-image: url(picture/背景11.jpeg);">
  	<span style="color:#1214FE">您正在做的业务是：教育培训机构管理系统--学员管理--学员信息修改</span>
  	<form action="update" method="post">
  	<input type="submit" value="提交" style="float:right" />
  	<input type="button" value="返回" style="float:right" onclick="location.href='SelectTerm.jsp'"/>
	<table id = "touming5" style="width:100%;height:600px;background-color:#E9F8F3;"margin border="3px";>
	<tr class="hi">
	<td class="bar">档案编号：</td>
	<td colspan="6"><input type="text" name="file_number"  readonly= "true "  value="<%=employee.getEid()%>"></td>
	</tr>
    <tr class="hi">
     	<td class="bar">I级校区</td>
     	<td><input type="text" name="firstorg"  readonly= "true "  value="<%=op.getFirstorg()%>"></td>
     	<td class="bar">II级校区</td>
     	<td><input type="text" name="secondorg" readonly= "true " value="<%=op.getSecondorg()%>"></td>
     	<td class="bar" >III级校区</td>
     	<td colspan="2"><input type="text" name="thirdorg" readonly= "true " value="<%=op.getThirdorg()%>"></td>
     </tr>
    
     <tr class="hi">
     	<td class="bar">专业分类</td>
     	<td><input type="text" name="firstpost" readonly= "true " value="<%=op.getFirstpost()%>"></td>
     	<td class="bar">专业名称</td>
     	<td><input type="text" name="secondpost" readonly= "true " value="<%=op.getSecondpost()%>"></td>
     	<td class="bar">专业</td>
     	<td colspan="2"><select name="thirdpost">
     	<c:forEach items="${requestScope.Post}" step="1" var="Post" varStatus="st"> 
     			           <option value="${Post.getTitile()}">${Post.getTitile()}</option>
        </c:forEach>
     		            </select></td>
     </tr>
     <tr class="hi">
     	<td class="bar">姓名</td>
     	<td><input type="text" name="name" value="<%=employee.getName()%>"/></td>
     	<td class="bar">性别</td>
     	<td>
     		<select name="gender">
     			<option value="男">男</option>
     			<option value="女">女</option>
     		</select>
     	</td>
     	<td class="bar">Email</td>
     	<td colspan="2"><input type="text" name="Email" value="<%=employee.getEmail()%>"/></td>
     </tr>
     <tr class="hi">
     	<td class="bar">电话</td>
     	<td><input type="text" name="phone" value="<%=employee.getPhone()%>"/></td>
     	<td class="bar">QQ</td>
     	<td><input type="text" name="QQ" value="<%=employee.getQQ()%>"/></td>
     	<td class="bar">手机</td>
     	<td colspan="2"><input type="text" name="mobile" value="<%=employee.getMobile()%>"/></td>
     </tr>
     <tr class="hi">
     	<td class="bar">住址</td>
     	<td colspan="3"><input type="text" name="address" value="<%=employee.getAddress()%>"/></td>
     	<td class="bar">邮编</td>
     	<td colspan="2"><input type="text" name="postcode" value="<%=employee.getPostcode()%>"/></td>
     </tr>
     <tr class="hi">
     	<td class="bar">国籍</td>
     	<td>
     		<select name="nationality">
     			<option value="中国">中国</option>
     		</select>
     	</td>
     	<td class="bar">出生地</td>
     	<td><input type="text" name="birthplace" value="<%=employee.getBirthplace()%>"/></td>
     	<td class="bar">生日</td>
     	<td><input type="text" name="birthday" value="<%=employee.getBirthday()%>"/></td>
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
     	<td class="bar">变更时间</td>
     	<td><input type="text" name="filing_time" value="<%=employee.getFiling_time()%>"/></td>
     	<td class="bar">账号</td>
     	<td><input type="text" name="account" value="<%=employee.getAccount()%>"/></td>
     	<td class="bar">登记人</td>
     	<td><input type="text" name="registrant" value="<%=employee.getNotes()%>"/></td>
     </tr>
     <tr>
     	<td class="bar">个人学习状况</td>
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
    </form>
    </div>
  </body>
</html>