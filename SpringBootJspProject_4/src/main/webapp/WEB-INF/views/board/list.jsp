<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-lg-12 text-center">
      <h2>게시판</h2>
        <span>목록</span>
    </div>
  </div>
</div>
<div class="container">
  <div class="row">
    <table class="table">
     <tbody>
      <tr>
       <td>
        <a href="/board/insert">새글</a>
       </td>
      </tr>
     </tbody>
    </table>
    <table class="table">
      <thead>
       <tr>
        <th width=10% class="text-center">번호</th>
        <th width=45% class="text-center">제목</th>
        <th width=15% class="text-center">이름</th>
        <th width=20% class="text-center">작성일</th>
        <th width=10% class="text-center">조회수</th>
       </tr>
      </thead>
      <tbody>
       <tr>
        <th width=10% class="text-center">번호</th>
        <th width=45% class="text-left">제목</th>
        <th width=15% class="text-center">이름</th>
        <th width=20% class="text-center">작성일</th>
        <th width=10% class="text-center">조회수</th>
       </tr>
       <tr>
        <td colspan="5" class="text-center">
         <button>이전</button>
         <button>다음</button>
        </td>
       </tr>
      </tbody>
    </table>
  </div>
</div>
</body>
</html>