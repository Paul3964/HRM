/**
 * 
 */
function UpdateById1(ele){
	var id = $(ele).parent().parent().children("td:first").html();
	location.href="sps?sid="+id;
}
function DeleteById(ele){
	var id = $(ele).parent().parent().children("td:first").html();
	location.href="dps?sid="+id;
}
function RegisterById(ele){
	var id = $(ele).parent().parent().children("td:first").html();
	location.href="jls?sid="+id;
}
