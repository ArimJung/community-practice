<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
	<c:when test="${mid != null}">
		<a href="logout.do">로그아웃</a>
	</c:when>
	<c:otherwise>
	<form action="login.do" method="post">
		ID&nbsp;<input type="text" name="mid">&nbsp;&nbsp;PW&nbsp;<input type="password" name="mpw">&nbsp;&nbsp;
		<input type="submit" value="로그인">
	</form>
	</c:otherwise>
</c:choose>
