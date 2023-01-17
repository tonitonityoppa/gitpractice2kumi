<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Kadai161dto" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>下記の内容で登録します。よろしいですか？</p>
	<%
		Kadai161dto account = (Kadai161dto)session.getAttribute("input_data");
	%>
	名前：<%=account.getName() %><br>
	年齢：<%=account.getAge() %><br>
	性別：<%=account.getGender() %><br>
	電話番号：<%=account.getTel() %><br>
	メール：<%=account.getMail() %><br>
	パスワード：********<br>
	<a href="KadaiExecute">OK</a><br>
	<a href="KadaiServlet">戻る</a>
</body>
</body>
</html>