<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/index.jsp</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/board/list.do" >게시판 목록</a> <br>
<a href="<c:url value="/board/list.do" />" >게시판 목록</a>
<hr>
<a href="<c:url value="/admin/member/list.do" />" >관리자 회원 목록 </a>


</body>
</html>