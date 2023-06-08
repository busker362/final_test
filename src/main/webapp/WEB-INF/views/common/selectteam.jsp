<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html>
<head>
  <title>선수 팀 별 조회</title>
</head>
<body>
<h3>MEMBER 테이블에서 같은 팀으로 선수 정보 조회하기</h3>
<form action="${pageContext.servletContext.contextPath}/member/selectteam">
  <label>조회할 팀</label>
  소속팀 :
  <select name="teamCode">
    <option value="1">북산고교</option>
    <option value="2">산왕공고</option>
    <option value="3">능남고교</option>
    <option value="4">해남부속고</option>
  </select>
  <br>
  <button type="submit">팀조회하기</button>
</form>

</body>
</html>
