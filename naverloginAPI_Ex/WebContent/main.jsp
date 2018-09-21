<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
<div class="mes">dwadw</div>
<script>
window.addEventListener('load', function () {
	naverLogin.getLoginStatus(function (status) {
		if (status) {
			/* 필수적으로 받아야하는 프로필 정보가 있다면 callback처리 시점에 체크 */
			var email = naverLogin.user.getEmail();
			if( email == undefined || email == null) {
				alert("이메일은 필수정보입니다. 정보제공을 동의해주세요.");
				/* 사용자 정보 재동의를 위하여 다시 네아로 동의페이지로 이동함 */
				naverLogin.reprompt();
				return;
			}

			window.location.replace("index2.jsp");
		} else {
			console.log("callback 처리에 실패하였습니다.");
		}
	});
});
	</script>
</body>
</html>