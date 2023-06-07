<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="../common/header.jsp"/>
    <h3>MEMBER 테이블에서 같은 포지션별로 선수 정보 조회하기</H3>
    <form action="member/selectposition">
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

    <h3>MEMBER 테이블에서 같은 팀으로 선수 정보 조회하기</H3>
    <form action="member/selectteam">
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

    <h3>MEMBER 테이블에서 선수 전체 정보 조회 : /member/list (get)</h3>
    <button onclick="location.href='${pageContext.servletContext.contextPath}/member/list'">선수정보 전체 조회하기</button>

    <h3>MEMBER 테이블에서 신규 선수 정보 추가 (필요한 정보를 입력받을 수 있는 form을 만들어서 추가할 것) : /member/insert (post)</h3>
    <form action="${ pageContext.servletContext.contextPath }/member/insert" method="post">
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

    <h3>MEMBER 테이블에서 선수 정보 수정 (선수 코드와 변경할 정보를 입력 받아 선수코드와 일치하는 선수의 정보 변경 - 원하는 데이터 변경) : /member/update (post)</h3>
    <form action="${ pageContext.servletContext.contextPath }/member/update" method="post">
        선수코드 : <input type="text" name="memberCode"><br>
        나이 : <input type="text" name="memberAge"><br>
        키 : <input type="text" name="height"><br>
        몸무게 : <input type="text" name="weight"><br>
        <button type="submit">정보 수정</button>
    </form>

    <h3>member 테이블에서 선수 정보 삭제 (선수코드를 입력 받아 일치하는 행 삭제) : /member/delete (post)</h3>
    <form action="${ pageContext.servletContext.contextPath }/member/delete" method="post">
        선수 코드 : <input type="text" name="memberCode"><br>
        <button type="submit">선수 정보 삭제</button>
    </form>
</body>
</html>
