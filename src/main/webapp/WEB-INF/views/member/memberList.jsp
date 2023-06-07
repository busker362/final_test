<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>선수 목록 전체 조회</h1>
    <table>
        <tr>
            <th>선수번호</th>
            <th>선수명</th>
            <th>나이</th>
            <th>등번호</th>
            <th>포지션</th>
            <th>키</th>
            <th>몸무게</th>
            <th>소속팀</th>
        </tr>
        <c:forEach items="${ requestScope.memberList }" var="member">
            <tr>
                <td>${ member.memberCode }</td>
                <td>${ member.memberName }</td>
                <td>${ member.memberAge }</td>
                <td>${ member.backNumber }</td>
                <td>${ member.position }</td>
                <td>${ member.height }</td>
                <td>${ member.weight }</td>
                <td>${ member.teamCode }</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
