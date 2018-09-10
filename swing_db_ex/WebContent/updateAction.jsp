<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="exam0907a.memberDAO" %>
<%@ page import="exam0907a.MemberVo" %>
<%request.setCharacterEncoding("UTF-8"); %>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String height = request.getParameter("height");
	String weight = request.getParameter("weight");
	String age = request.getParameter("age");
	
	MemberVo memberVO = new MemberVo();
	memberVO.setUserID(id);
	memberVO.setUserName(name);
	memberVO.setHeight(height);
	memberVO.setWeight(weight);
	memberVO.setAge(age);
	
	memberDAO dao = new memberDAO();
	
	dao.updateMember(memberVO);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="exam01.jsp">돌아가기</a>
</body>
</html>