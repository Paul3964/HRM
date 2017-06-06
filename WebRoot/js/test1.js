$(function(){
//	alert(12);
	$.getJSON("FtestServlet?callBack=?",function(response){
//		alert(34);
		$.each(response,function(index,item){
//			alert(item.fid);
			$("#ftest").append(new Option(item.fname,item.fid));			
		});
		$("#ftest").change();
	});
	
	$("#ftest").change(function(){	
		var proId = $(this).val();
		$.getJSON("STestServlet?callBack=?&pid="+proId,function(response){
			$("#stest").empty();//清空旧数据
			$.each(response,function(index,item){
//				alert(item.sname);
				$("#stest").append(new Option(item.sname,item.sid));
			});
			
		});
	
		
	});
	
	
});