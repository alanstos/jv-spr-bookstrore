<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			<label>Num. páginas</label>
			<input type="text" name="paginas" />
		</div>						
		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>