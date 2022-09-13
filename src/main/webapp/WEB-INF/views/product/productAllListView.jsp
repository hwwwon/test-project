<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#wrap{
		margin: 0 auto;
		width: 100%;
		text-align: center;
	}
	table{
				margin:0 auto;
				width: 800px;
			}
			
	table th{ 
		background-color: skyblue;
	}
</style>
</head>
<body>
	<div id="wrap">
	<h3>전체 상품 조회</h3>
	<table border="1">
			<tr><th>상품번호</th><th>상품명</th><th>가격</th>
					<th>제조사</th><th>재고</th></tr>
			<c:forEach items="${prdList }" var="prd">
				<tr>
					<td><a href="<c:url value='/product/productDetailView/${prd.prdNo}'/>">${prd.prdNo }</a></td>
					<td>${prd.prdName }</td>
					<td>${prd.prdPrice }</td>
					<td>${prd.prdCompany }</td>
					<td>${prd.prdStock }</td>
					<td><img src="<c:url value='/images/${prd.prdNo}.png' />" width='30' height='20'></td>
				</tr>
			</c:forEach>		
		</table> <br><br><br>
	
	
	<a href="<c:url value='/' />">메인화면으로 이동</a><br><br> <!-- 같은 표현 -->
	</div>
</body>
</html>