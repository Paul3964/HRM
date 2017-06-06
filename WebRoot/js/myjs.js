function checkUser(){
	var value = document.getElementById("username").value;
	if(value == '') {
		document.getElementById("error1").style.display = 'block';
	} else {
		document.getElementById("error1").style.display = 'none';
		}
}

function checkPassword(){
	var value = document.getElementById("password").value;
	if(value == '') {
		document.getElementById("error2").style.display = 'block';
	} else {
		document.getElementById("error2").style.display = 'none';
		}
}






var lastEle;
window.onload = function(){
	var lis = document.getElementsByTagName("li");
	for(var index in lis){
		lis[index].onclick = function(){
			if(lastEle){
				lastEle.style.backgroundColor='#ccc';
			}
			this.style.backgroundColor = 'orange';
			this.style.backgroundColor = '#FF6699';
			lastEle = this;
		}
	}
	
	var titles = document.getElementsByClassName("sub-title");
	for(var index in titles){
		titles[index].parentElement.lastElementChild.style.display = 'block';
		titles[index].onclick = function(){	
			isShow(this.parentElement.lastElementChild);
		}
	}
}


function isShow(ele){
	if(ele.style.display=='none'){
		ele.style.display = 'block';
	}else if(ele.style.display=='block'){
		ele.style.display ='none';
	}
}


function updatebyid(ele){
	var id = $(ele).parent().parent().children("td:first").html();
	location.href="delete?eid="+id;
}


function SelectById(ele){
	var id = $(ele).parent().parent().children("td:first").html();
	location.href="sse?did="+id;
}
function UpdateById(ele){
	var id = $(ele).parent().parent().children("td:first").html();
	location.href="transfer?did="+id;
}

function back(){
	location.href="select";
}
function updateByid(ele){
	var id = $(ele).parent().parent().children("td:first").html();
	location.href="check?sid="+id;
}




function main5(){
	$("#main").load("SelectTerm.jsp");
	
}
function main6(){
	$("#main").load("data");
}
function main7(){
	$("#main").load("salary");
}
function main8(){
	$("#main").load("review");
}
function main9(){
	$("#main").load("mainserach.jsp");
}
function main10(){
	$("#main").load("InsertPost.jsp");
}
function main11(){
	$("#main").load("SelectResume.jsp");
}
function main12(){
	$("#main").load("Test_reg.jsp");
}
function main13(){
	$("#main").load("DateServlet1");
}
function main17(){
	$("#main").load("upload.jsp");
}
function main14(){
	$("#main").load("Campus.jsp");
}
function main15(){
	$("#main").load("Plan");
}
function main16(){
	$("#main").load("add1.jsp");
}


//自动计算工资总额
function calculate(obj){
	  var a = document.getElementById("a");
    var b = document.getElementById("b");
    var c = document.getElementById("c");
    var d = document.getElementById("d");
    var e = document.getElementById("e");
    var f = document.getElementById("f");
    var g = document.getElementById("g");
    var h = document.getElementById("h");
    var s = document.getElementById("sum");
    if(a.value===""||b.value===""||c.value===""||d.value===""||e.value===""||f.value===""||g.value===""||h.value===""){
  	  return;
    }
    s.value = parseFloat(a.value) + parseFloat(b.value) + parseFloat(c.value) + parseFloat(d.value) + parseFloat(e.value) + parseFloat(f.value) + parseFloat(g.value) + parseFloat(h.value);
}

function checkSalary(ele){
	var id = $(ele).parent().parent().children("td:first").html();
	location.href="reviewsalary?did="+id;
}



//匹配正则,判断输入是否为数字
$(function(){
	$(".check").blur(function(){
		var num =  /^[0-9]*[0-9][0-9]*$/;
		var str = $(this).val();
		if(!(num.test(str)||num=='')){
			alert('请输入数字');
			$(this).val('');
			$(".war").css('display','none');
		}
	});	
});



function updateByid2(ele){
	
	var state  = $(ele).parent().parent().children("td:gt(7)").html();
	if(state=="已复核"){
		alert("已通过审核");
		$("#check").attr("disabled",true);
	}else{
		var id = $(ele).parent().parent().children("td:first").html();
		location.href="check?sid="+id;
	}
}



function SelectById(ele){
	var id = $(ele).parent().parent().children("td:first").html();
	location.href="sse?did="+id;
}



function updatebyid1(ele){
	var state = $(ele).parent().parent().children("td:gt(7)").html();
	if(state=="待复核"){
		alert("不能删除'待复核'的员工哦");
		$("#delete").attr("disabled",true);
	}else{
		var id=$(ele).parent().parent().children("td:first").html();
		location.href="delete?eid="+id;
	}	
}


/*function add(){
	location.href="add.jsp";
}
*/


