<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	session.setAttribute("messageContent", "messageContent");
    session.setAttribute("messageType", "messageType");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/custom.css">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</head>
<body>
	<div class="container">
	<form method="post" action="./userRegister">
		<table class="table table-bordered table-hover" style="text-align:center; border:1px solid #ddd">
			<thead>
				<tr>
					<th colspan="3"><h4>회원 등록 양식</h4></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td style="width: 110px;"><h5>아이디</h5></td>
					<td><input class="form-control" type="text" id="userID" name="userID" maxLength="20"></td>
					<td style="width:110px;"><button class="btn btn-primary" onclick="registerCheckFunction();" type="button">중복체크</button>
				</tr>
				<tr>
					<td style="width: 110px;"><h5>비밀번호</h5></td>
					<td colspan="2"><input class="form-control" type="password" id="userPassword1" name="userPassword1" maxLength="20"></td>
				</tr>
				<tr>
					<td style="width: 110px;"><h5>비밀번호확인</h5></td>
					<td colspan="2"><input class="form-control" type="password" id="userPassword2" name="userPassword2" maxLength="20"></td>
				</tr>
				<tr>
					<td style="width: 110px;"><h5>이름</h5></td>
					<td colspan="2"><input class="form-control" type="text" id="userName" name="userName" maxLength="20"></td>
				</tr>
				<tr>
					<td style="width: 110px;"><h5>나이</h5></td>
					<td colspan="2"><input class="form-control" type="text" id="userAge" name="userAge" maxLength="20"></td>
				</tr>
				<tr>
					<td style="width: 110px;"><h5>성별</h5></td>
					<td colspan="2">
						<div class="form-group" style="text-align: center; margin: 0 auto;">
							<div class="btn-group" data-toggle="buttons">
							<label class="btn btn-primary active">
								<input type="radio" name="userGender" autocomplete="off" value="남자" checked>남자
							</label>
							<label class="btn btn-primary active">
								<input type="radio" name="userGender" autocomplete="off" value="여자" >여자
							</label>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td style="width: 110px;"><h5>이메일</h5></td>
					<td colspan="2"><input class="form-control" type="email" id="userEmail" name="userEmail" maxLength="20"></td>
				</tr>
				<tr>
					<td style="text-align: left" colspan="4"><input class="btn btn-primary pull-right" type="submit" value="회원가입"></td>
				</tr>
			</tbody>
		</table>
	</form>
	</div>
	<%
		String messageContent = null;
		if(session.getAttribute("messageContent")!=null) {
			messageContent = (String) session.getAttribute("messageContent");
		}
		String messageType = null;
		if(session.getAttribute("messageType")!=null) {
			messageType = (String) session.getAttribute("messageType");
		}
		if(messageContent != null) { %>
		
		<div class="modal fade" id="messageModal" tabindex="-1" role="dialog" aria-hidden="true">
			<div class="vertical-align-helper">
				<div class="modal-dialog vertical-align-center">
					<div class="modal-content" <% if(messageType.equals("오류 메시지")) out.println("panel-warning"); else out.println("panel-seccess"); %> >
						<div class="modal-header panel-heading">
							<button type="button" class="close" data-dismiss="modal">
								<span aria-hidden="true">&times;</span>
								<span class="sr-only">Close</span>
							</button>
							<h4 class="modal-title">
								<%= messageType %>
							</h4>
						</div>
						<div class="modal-body">
							<%= messageContent %>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary" data-dismiss="modal">확인</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script>
			$('#messageModal').modal("show");
		</script>
	<%
		session.removeAttribute("messageContent");
		session.removeAttribute("messageType");
		}
	%>
</body>
</html>