<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
  <title>선수코드 조회 결과 출력</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
</head>
<body>
<form id="searchForm">
  <jsp:text>선수 검색</jsp:text>
  <br>
  <input type="text" id="keywordInput">
  <button type="submit">검색</button>
</form>
<div id="resultContainer"></div>

<script>
  $(document).ready(function() {
    $("#searchForm").submit(function(event) {
      event.preventDefault();

      var keyword = $("#keywordInput").val();

      $.ajax({
        url: "/selectOneMemberByCode",
        method: "GET",
        data: {
          memberCode: keyword
        },
        success: function(response) {
          $("#resultContainer").html(response);
        },
        error: function(xhr, status, error) {
          console.error(error);
        }
      });
    });
  });
</script>
</body>
</html>
