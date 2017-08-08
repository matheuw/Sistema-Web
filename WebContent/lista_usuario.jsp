<jsp:include page="header.jsp"></jsp:include>
<div class="container">
    <div class="row col-md-6 col-md-offset-2 custyle">
    <table class="table table-striped custab">
    <thead>
    <a href="CadastrarUsuario.action" class="btn btn-primary btn-xs pull-right"><b>+</b> Cadastra</a>
        <tr>
            <th>Nome</th>
            <th>E-mail</th>
            <th>Sexo</th>
            <th>Usuario</th>
            <th class="text-center">Action</th>
        </tr>
    </thead>
            <c:forEach var="usuario" items="${usuario}">
		<tr>
			<td>${usuario.nome}</td>
			<td>${usuario.email}</td>
			<td>${usuario.sexo}</td>
			<td>${usuario.usuario}</td>
			<c:url var="usuario" value="/Editar">
				<c:param name="numSala">${usuario.id }</c:param>
			</c:url>
			
			<td><a href="${alunosUrl }" class="botao"><button class="btn btn-primary">Aluno</button></a></td>		
		</tr>
		
		
		
	</c:forEach>
           
            
    </table>
    </div>
    
</div>

</body>
</html>