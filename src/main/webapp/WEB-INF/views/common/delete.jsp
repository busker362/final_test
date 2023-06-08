<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html>
<head>
  <title>Title</title>
</head>
<body>

<h3>MEMBER 테이블에서 선수 정보 삭제</h3>
<form action="${pageContext.servletContext.contextPath}/member/delete" method="post">
  선수 코드 : <input type="text" name="memberCode"><br>
  <button type="submit">선수 정보 삭제</button>
</form>

</body>
</html>
