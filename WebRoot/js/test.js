/**
 * 
 */
//function selectPro(ele){
//	var pro = $(ele).val();
//	alert(pro);
//	location.href = "LoginServlet?id="+pro;
//}

$(function(){
//	alert(12);
	$.getJSON("FirstOrganization?callBack=?",function(response){
//		alert(34);
		$.each(response,function(index,item){
//			alert(item.id);
			$("#pro").append(new Option(item.fname,item.fid));	
		});
		$("#pro").change();
	});
	
	
	
	$("#pro").change(function(){	
		var proId = $(this).val();
//		alert(proId);
		$.getJSON("SecondOrgnizationServlet?callBack=?&pid="+proId,function(response){
			$("#second").empty();//清空旧数据
			$.each(response,function(index,item){
//				alert(item.sname);
				$("#second").append(new Option(item.sname,item.sid));
			});
			$("#second").change();
		});
	
		
	});

	$("#second").change(function(){
	
//		alert(12);
		var proId1 = $(this).val();
//		alert(proId1);
		$.getJSON("ThirdOrganizationServlet?callBack=?&pid="+proId1,function(response){
			$("#third").empty();
			$.each(response,function(index,item){
//				alert(item.tname);
				$("#third").append(new Option(item.tname,item.tid));
			});
			$("#third").change();
		});
		
	});
	
	$("#third").change(function(){
		
//		alert(12);
		var proId1 = $(this).val();
//		alert(proId1);
		$.getJSON("FirstPostServlet?callBack=?&pid="+proId1,function(response){
			$("#sort").empty();
			$.each(response,function(index,item){
//				alert(item.name);
				$("#sort").append(new Option(item.name,item.id));
			});
			$("#sort").change();
		});
		
	});
	
	$("#sort").change(function(){
		
//		alert(12);
		var proId1 = $(this).val();
//		alert(proId1);
		$.getJSON("SecondPortServlet?callBack=?&pid="+proId1,function(response){
			$("#jname").empty();
			$.each(response,function(index,item){
//					alert(item.id);
				$("#jname").append(new Option(item.name,item.id));
			});
			$("#jname").change();
		});
	});
	
	$("#jname").change(function(){		
//		alert(12);
		var proId1 = $(this).val();
//		alert(proId1);
		$.getJSON("ThirdPostServlet?callBack=?&pid="+proId1,function(response){
			$("#titile").empty();
			$.each(response,function(index,item){
//					alert(item.id);
				$("#titile").append(new Option(item.name,item.id));
			});
		});
		
	});
	
	
});



window.onload = function(){
	function getDate(){
	debugger;
	var today = new Date();
	var date;
	date = (today.getFullYear()) +"-" + (today.getMonth() + 1 ) + "-" + today.getDate();
	return date;
	}
	window.setInterval(function(){
	document.getElementById("getBookTime").value=getDate();
	}, 1000);
	}
