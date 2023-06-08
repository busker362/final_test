<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>MEMBER 테이블에서 신규 선수 정보 추가</h3>
<form action="${pageContext.servletContext.contextPath}/member/insert" method="post">
    선수명 : <input type="text" name="memberName"><br>
    나이 : <input type="text" name="memberAge"><br>
    등번호 : <input type="text" name="backNumber"><br>
    키 : <input type="text" name="height"><br>
    몸무게 : <input type="text" name="weight"><br>
    포지션 :
    <select name="position">
        <option value="C">센터</option>
        <option value="PF">파워포워드</option>
        <option value="SF">스몰포워드</option>
        <option value="SG">슈팅가드</option>
        <option value="PG">포인트가드</option>
    </select>
    <br>
    소속팀 :
    <select name="teamCode">
        <option value="1">북산고교</option>
        <option value="2">산왕공고</option>
        <option value="3">능남고교</option>
        <option value="4">해남부속고</option>
    </select>
    <br>
    <button type="submit">등록하기</button>
</form>

</body>
</html>
