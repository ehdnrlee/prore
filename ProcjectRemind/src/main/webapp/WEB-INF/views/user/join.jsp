<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>회원가입</title>
</head>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	var overlapcheck=0;
	function formsubmit(){
		if(overlapcheck==1){
		var form=document.getElementById('joinform');
		form.method="post";
		form.action="join";
		form.submit();}
		else{
			alert("아이디 중복확인부터 실행해주십시요");
			
		}
	}
	
	
	
	function idcheck(){
		
		var id=$("input[name='id']").val();
		
		$.ajax({
			type:"post",
			url:"idcheck",
			dataType:"text",
			data: id,
			contentType: "application/json; charset=UTF-8",
			success:function(data){
				if(data=="0"){
					alert("사용가능한 아이디입니다.");
					overlapcheck=1;
				}else{
					alert("아이디가 이미 존재합니다 변경후 다시 입력해주세요.");
					$("#id").focus();
					overlapcheck=0;
					}
				var a=data;
				
				
				console.log(data.count);
				}
			});
		
	}
</script>
<body>
<form  id="joinform">
아이디:<input type="text" name="id" >
<button type="button" onclick="idcheck()" >중복확인</button>
비밀번호:<input type="password" name="pwd" >
이름:<input type="text" name="name">

<button type="button" onclick="formsubmit()" >입력</button>
</form>

</body>
</html>