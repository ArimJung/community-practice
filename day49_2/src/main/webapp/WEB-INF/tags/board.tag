<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ attribute name="midCheck" %>
<%@ attribute name="bid" %>

<c:if test="${mid==midCheck}">
<a href="deleteB.do?bid=${bid}">[삭제]</a>
</c:if>
<a href="fav.do?bid=${bid}&cnt=${cnt}">&nbsp;♥</a>