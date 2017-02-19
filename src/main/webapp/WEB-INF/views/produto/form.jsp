<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Import da taglib -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
	<meta content="charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>

	<form action="/bookstrore/produtos" method="POST">
		<div>
			<label>Título</label>
			<input type="text" name="titulo" />
		</div>
		<div>
			<label>Descrição</label>
			<input type="text" name="descricao" />
		</div>
		<div>	
			<label >Pnáginas</label>
			<input type="text" name="paginas" />
		</div>		
		
		
	    <c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
	        <div>
	            <label>${tipoPreco}</label>
	            <input type="text" name="precos[${status.index}].valor" />
	            <input type="hidden" name="precos[${status.index}].tipo" value="${tipoPreco}" />
	        </div>
	    </c:forEach>		
						
		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>