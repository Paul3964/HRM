<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<title>试题查询</title>
    <link rel="stylesheet" href="css/bootstrap.css" />	
	<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
	<script type="text/javascript" src="js/test1.js"></script>
	<script type="text/javascript">
	 $(function(){
			$("#main").load("SearchServlet");
		}) 
		
	</script>
<!-- 	<style type="text/css">
		*{
			padding:0px;
			margin:0px;
		}
		.bar{
			background-color:#96E1A0;
			text-align: center;
		}
		.hi{
			height:4%;
		}
	
	</style> -->
	

  </head>
  
  <body>
  <div id="main" style="width:100%;height:600px">
  </div>

  </body>
</html>
