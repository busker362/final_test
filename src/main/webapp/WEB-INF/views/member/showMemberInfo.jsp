<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="../common/header.jsp"/>

    선수코드 : ${ requestScope.selectedMember.memberCode }<br>
    선수명 : ${ requestScope.selectedMember.memberName }<br>
    키 : ${ requestScope.selectedMember.height }<br>
    몸무게 : ${ requestScope.selectedMember.weight }<br>
    포지션 : ${ requestScope.selectedMember.position }<br>
    소속팀 : ${ requestScope.selectedMember.teamCode }<br>
</body>
</html>
