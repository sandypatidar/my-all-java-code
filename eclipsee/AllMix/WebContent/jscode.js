function validateTextbox() {
	var box1=document.getElementById("name");
	var box2=document.getElementById("address");
	var box3=document.getElementById("phone");
	var box4=document.getElementById("select");
	if(box1.value==""){
		alert("Name field was Empty");
		box1.focus();
		box1.style.border="solid 2px red";
		return false;
	}
	if(box2.value==""){
		alert("Surname field was Empty");
		box2.focus();
		box2.style.border="solid 2px red";
		return false;
	}
	if(box3.value==""){
		alert("please enter number");
		box3.focus();
		box3.style.border="solid 2px red";
		return false;
	}
	if(box1.value<5){
		alert("the name is very short");
		box1.style.border="solid 2px red";
		return false;
	}
	if(box3.value.length <10) {
		 alert("mobile number is not correct");
	box3.style.border= "solid 3px red";
		 return false;
	 }
	 if(box4.value=="-empty-") {
		 alert ("please select contry");
		 box4.style.border= "solid 3px red";
		 return false;
	 }
	 else if (box4.value!="+91(India)") {
		 alert("the contry was not INDIA");
		 box4.style.border= "solid 3px red";
		 return false;
	 }
}