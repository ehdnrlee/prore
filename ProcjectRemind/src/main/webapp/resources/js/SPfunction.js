var img_L = 0;
var img_T = 0;
var targetObj;
var startdrag="startDrag(event,this)";
var totalfcl=0;
var totaldot=0;
var dotInfo=new Array;




////정보 추가/////
function Loadinformation(){
	$.ajax({
		type:"post",
		url:"Loadinfo",
		dataType:"json",
		contentType:"Application/json;charset=UTF-8",
			success:function(data){
				 if(data.isExist){
					 console.log("불러오기 실패사용불가");
				 }else{
					 dotinfo=data.dotinfo;
					 fclinfo=data.fclinfo;
				 }	
			}		
	});
}
function saveInfomation(){
	for(var i=0;i<totaldot;i++){
		dotInfo[i].dot_x=$('.'+i+"dot").offset().top;
		dotInfo[i].dot_y=$('.'+i+"dot").offset().left;
		console.log(dotInfo[i].dot_x);
	}
	
	
	$.ajax({
		 type:"post",
		 dataType:"json",
		 url:"Save",
		 data:JSON.stringify(dotInfo),
		 contentType:"Application/json;charset=UTF-8",
		 success: function(data){
			 if(data.isExist){
				 console.log("사용불가");
			 }else{
				 alert("저장완료");}}
})}
function adddot(){
dotInfo.push({
	dot_num:totaldot,
})
console.log(dotInfo[0].dot_num);
$("#AddJob").append("<div class='"+totaldot+"dot' id='dot' name='"+totaldot+"dot' resize='both' style='position:absolute; left:200px; top:220px; cursor:pointer; cursor:hand' onmousedown="+startdrag+">"+totaldot+"교차점</p>");
totaldot+=1;

		}	
	

function addfcl(){
var name=prompt("기구의 이름을 쳐주세요","please enter fcl name");
name=name.replace(/\s/gi,"");
searching(name,"fcl");
$("#AddJob").append("<div class='"+totalfcl+"fcl' id='fcl' name='"+totalfcl+"fcl' resize='both' style='position:absolute; left:200px; top:120px; cursor:pointer; cursor:hand' onmousedown="+startdrag+">"+name+"</p>");
totalfcl+=1;

	}



//중복검사///
function check(name,type){
	$.ajax({
		type:"post",
		url:type+"check",
		dataType:"text",
		data: name,
		contentType: "application/json; charset=UTF-8",
		success:function(data){
			if(data=="0"){
				alert("사용가능한 이름입니다.");
				
			}else{
				name=prompt("중복된 이름입니다 다른 이름을 쳐주세요","please enter"+type+" name");
				check(name,type);
				}
			var a=data;
		}
		});
	
}



////마우스로 움직이기////
function getLeft(o){//해당 오브젝트 타켓을 가져온다
    return parseInt(o.style.left.replace('px',''));// 해당오브젝트의 왼쪽으로부터 위치를 px단위로 가져와서 int로 반환
}
function getTop(o){//해당 오브젝트 타겟을 가져온다.
    return parseInt(o.style.top.replace('px',''));//해당 오브젝의 높이를 파악하여 위치를 int로
}

//이미지 움직이기
function moveDrag(e){//event 함수를 가져온다.
    var e_obj = window.event? window.event : e;//삼항연산자 이벤트면 이벤트그대로 아니면 e로
    var dmvx = parseInt(e_obj.clientX + img_L);//start drag에서 정의되므로 img_L과 img_T에대한 값은 변해있다.
    var dmvy = parseInt(e_obj.clientY + img_T);//마우스 포인터 위치만큼옮기면 이미지가 움직이는거처럼 보이게된다.
    if(dmvx<0||dmvy<0){//바깥으로 벗어나지마!
    	dmvx=0;
    	dmvy=0;
    }if(dmvx<160){//일정선넘지마라
    	dmvx=160;
    }else{
    targetObj.style.left = dmvx +"px";//해당값에  움직이는 만큼 px단위로 left에 넣어줌
   //해당 오브젝트의 x좌표를 변환한다.
    targetObj.style.top = dmvy +"px";
    //해당 오브젝트의 y좌표를 변환한다.}
    return false;//반환할 내용이 딱히없음
}}

//드래그 시작
function startDrag(e, obj){//e=event obj=this
	console.log(obj);
    targetObj = obj;//움직일것을 정함
    var e_obj = window.event? window.event : e;//삼항연산자로 해당 타입이 window.event가 참이면 window.event로 아니면 e로  
    img_L = getLeft(obj) - e_obj.clientX;//움직일것의 왼쪽으로부터의 위치를 가져오고 후에 clientx가 마우스포인터의 x좌표 위치란다
    img_T = getTop(obj) - e_obj.clientY;//움질일것의 위로부터의 위치 후에 clienty가 마우스포인의 y좌표 위치란다
    document.onmousemove = moveDrag;//함수를 축약적으로 쓴듯 그냥 자동인식인듯 마우스가 움직일때 마다 무브 드래그를 수행해서 false값을 반환한다,.
//마우스가 움직일때 실행
    document.onmouseup = stopDrag;//함수를 실행해서반환값없는데 이걸?? 아마 그냥 비우는 용도가아닐까싶다,
//마우스에서 버튼에서 손이 때져있을때 실행
    if(e_obj.preventDefault){e_obj.preventDefault();}//해당 이벤트 오브젝트가
    
}

//드래그 멈추기
function stopDrag(){
    document.onmousemove = null;
    document.onmouseup = null;
}//드래그가 멈췄을때 해당 값들을 비워낸다.
function test(){
	alert("경보");
}