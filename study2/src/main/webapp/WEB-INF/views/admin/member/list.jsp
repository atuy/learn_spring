<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>/WEB-INF/views/admin/member/list.jsp</title>
<%@include file="/WEB-INF/views/inc/include.jsp" %>
</head>
<body>
<%@ include file="/WEB-INF/views/inc/top.jsp" %>
<div class="container">
	<p>
		<a href="regist.do" class="btn btn-sm btn-primary">회원가입</a>
	</p>
	
	<table class="table table-striped">
		<thead>
			<tr>
				<td>아이디</td>
				<td>이름</td>
				<td>연락처</td>
				<td>포인트</td>
				<td>가입일</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="member" items="${memberList}">
			<tr>
				<td>${member.id}</td>
				<td>${member.name}</td>
				<td>${member.tel}</td>
				<td>${member.point}</td>
				<td>${member.regDate}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>