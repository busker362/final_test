<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
  <title>선수 포지션별 조회</title>
</head>
<body>
<h3>MEMBER 테이블에서 같은 포지션별로 선수 정보 조회하기</h3>
<form action="${pageContext.servletContext.contextPath}/member/selectposition" method="get">
  <label>조회할 포지션</label>
  포지션 :
  <select name="position">
    <option value="C">센터</option>
    <option value="PF">파워포워드</option>
    <option value="SF">스몰포워드</option>
    <option value="SG">슈팅가드</option>
    <option value="PG">포인트가드</option>
  </select>
  <br>
  <button type="submit">포지션 조회하기</button>
</form>
</body>
</html>
