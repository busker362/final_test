<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<h1>선수 정보 관리 시스템</h1>
<jsp:include page="../common/header.jsp" />
<ul>
    <li><jsp:include page="/WEB-INF/views/common/search.jsp" /></li>
    <li><jsp:include page="/WEB-INF/views/common/selectposition.jsp" /></li>
    <li><jsp:include page="/WEB-INF/views/common/selectteam.jsp" /></li>
    <li><jsp:include page="/WEB-INF/views/common/insert.jsp" /></li>
    <li><jsp:include page="/WEB-INF/views/common/update.jsp" /></li>
    <li><jsp:include page="/WEB-INF/views/common/delete.jsp" /></li>
</ul>
</body>
</html>
