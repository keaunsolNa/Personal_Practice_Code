<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="../common/header.jsp"/>

	<div align="center" id="div_1">
	    <form action="${ pageContext.servletContext.contextPath }/dbeloper/select/login" method="post">
	        <label> 아이디: </label> <input type="text" name = "id" ><button type="reset"> 취소 </button>  <br>
	        <label> 비밀번호: </label> <input type="password" name= "password"> <button type="submit"> 로그인 </button> <br>
	    </form>
	    <br>
	</div>
	<div align="center" id="div_2">
		<form action= "${ pageContext.servletContext.contextPath }/dbeloper/select/Account" method="post">
			<button type="submit">회원 가입</button>
		</form>
	</div>
</body>
</html>