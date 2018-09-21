<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script> 

 var naverLogin = new naver.LoginWithNaverId( 
 { 
		clientId: "UIR5lNGJc33VnxYKM2Tc",
		callbackUrl: "http://localhost:8080/naverloginAPI_Ex/callback.jsp",
 isPopup: false, 
 loginButton: {color: "green", type: 3, height: 60} 
 } 
 ); 
 /* (4) 네아로 로그인 정보를 초기화하기 위하여 init을 호출 */ 
naverLogin.init(); 

 

 /* (5) 현재 로그인 상태를 확인 */ 
window.addEventListener('load', function () { 
 naverLogin.getLoginStatus(function (status) { 
 if (status) { 
 /* (6) 로그인 상태가 "true" 인 경우 로그인 버튼을 없애고 사용자 정보를 출력합니다. */ 
setLoginStatus(); 
 } 
 }); 
 }); 

 /* (6) 로그인 상태가 "true" 인 경우 로그인 버튼을 없애고 사용자 정보를 출력합니다. */ 
function setLoginStatus() { 
 var profileImage = naverLogin.user.getProfileImage(); 
 var nickName = naverLogin.user.getNickName(); 
 var email = naverLogin.user.getEmail(); 
 var name = naverLogin.user.getName(); 
 var birthday = naverLogin.user.getBirthday(); 
 var uniqId = naverLogin.user.getId(); 

 $("#naverIdLogin_loginButton").html('<br><br><img src="' + profileImage + '" height=50 /> <p>' + name + '--' + nickName +'('+uniqId+ ')'+'('+email+ ')님 반갑습니다.</p>'); 
 $("#gnbLogin").html("Logout"); 
 $("#gnbLogin").attr("href", "#"); 
 /* (7) 로그아웃 버튼을 설정하고 동작을 정의합니다. */ 

 $("#gnbLogin").click(function () { 
 naverLogin.logout(); 
 document.location.reload(); 
 }); 
 
 </script>
</body>
</html>