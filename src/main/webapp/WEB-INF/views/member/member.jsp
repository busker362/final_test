<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>선수 목록 조회</h1>
<jsp:text>선수 명단</jsp:text>
<% if (request.getAttribute("selectedMember") != null) { %>
<h2>Selected Member Information:</h2>
<ul>
  <li>선수 코드: ${selectedMember.memberCode}</li>
  <li>선수 이름: ${selectedMember.memberName}</li>
  <li>나이: ${selectedMember.memberAge}</li>
  <li>등번호: ${selectedMember.backNumber}</li>
  <li>포지션: ${selectedMember.position}</li>
  <li>키: ${selectedMember.height}</li>
  <li>몸무게: ${selectedMember.weight}</li>
  <li>소속 팀 코드: ${selectedMember.teamCode}</li>
  <li>팀명: ${selectedMember.teamName}</li>
  <li>팀 소속 지역: ${selectedMember.region}</li>
</ul>
<% } else { %>
<p>No member selected.</p>
<% } %>

</body>
</html>
