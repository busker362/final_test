<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
  <title>선수 정보 전체 조회</title>
</head>
<body>
<h3>MEMBER 테이블에서 선수 전체 정보 조회</h3>
<form action="${pageContext.servletContext.contextPath}/member/list" method="get">
  <button type="submit">선수 정보 전체 조회하기</button>
</form>
</body>
</html>

