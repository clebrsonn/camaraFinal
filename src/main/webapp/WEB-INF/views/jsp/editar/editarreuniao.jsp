<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo"  class="conteudo">
<h2> Cadastro Usuario </h2> 
<div id="form"> 
 
 <form id="formUsuario" action="add" method="POST">
 
 
 
   <!-- 				DADOS DO REGISTRO DIVIDIDOS EM DOIS PARAGRAFOS	 -->
			
			<fieldset>
				
				<legend>Dados do Registro</legend>
			
			
				<p>Data Criacao:
					<input name="datacriacao" type="date" class="inp-form" />
					<fmt:formatDate type="date"  value="${registro.data}" pattern="dd/MM/yyyy"/>
				
				
				Usuario Criou:
				<input name="usuario" type="date" class="inp-form" />
				<fmt:formatDate type="date"  value="${registro.usuario}" pattern="dd/MM/yyyy"/>
				
			
				Data Ultima Modificacao:
				<input name="datamodificacao" type="date" class="inp-form" />
				<fmt:formatDate type="date"  value="${registro.datamodificacao}" pattern="dd/MM/yyyy"/>
				
				</p>
				
				<p>
				
				Usuario Modificou:
				<input name="usuario" type="text" class="inp-form"/>
				<fmt:formatDate type="date"  value="${registro.usuario}" pattern="dd/MM/yyyy"/>
				
				
				Status:
				<input name="status" type="text" class="inp-form" />
				<fmt:formatDate type="date"  value="${registro.status}" pattern="dd/MM/yyyy"/>
				
			</p>
			
			</fieldset>
			
			
	<fieldset>
		
		<legend>Dados do Usuario</legend>

			<p>Id Usuario
				<input id="id" name="id" type="text" readonly="readonly"/>
			</p>
			
			<p>Nome
				<input id="nome" name="nome" type="text" />
			</p>
			<p>Senha
				<input id="senha" name="senha" type="text" />
			</p>
			
            <p> Tipo:
	            <select id="tipo" name="tipo" id="files" class="inp-form">           
	                <optgroup label="Tipos de Usuario">
	           			<c:forEach var="tipo" items="${tipoList}">
	           			
	           				<option value="${tipo}">${tipo}</option>
	           				      				
	           				
	       				</c:forEach>
	                </optgroup>
	            </select>
			</p>
			<p>Email
				<input id="email" name="email" type="text" />
			</p>
	
			
			<div id="botoes">
				<button class="button">Adicionar</button>
				<button class="button">Apagar</button>
			</div>
			
	</fieldset>
				

				

</form>
</div>
</div>

