<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>

<div id="conteudo"  class="conteudo">
<h2> Cadastrar Vereador </h2> 
<div id="form"> 
 
 <form id="ds" class="form-labels-on-top"action="${pageContext.request.contextPath}/vereador/add" ModelAttribute="vereador" method="POST">
 
 
 
   <!-- 				DADOS DO REGISTRO DIVIDIDOS EM DOIS PARAGRAFOS	 -->
			
<!-- 			<fieldset> -->
				
<!-- 				<legend>Dados do Registro</legend> -->
			
			
<!-- 				<p>Data Criacao: -->
<!-- 					<input name="datacriacao" type="date" class="inp-form" /> -->
<%-- 					<fmt:formatDate type="date"  value="${registro.data}" pattern="dd/MM/yyyy"/> --%>
				
				
<!-- 				Usuario Criou: -->
<!-- 				<input name="usuario" type="date" class="inp-form" /> -->
<%-- 				<fmt:formatDate type="date"  value="${registro.usuario}" pattern="dd/MM/yyyy"/> --%>
				
			
<!-- 				Data Ultima Modificacao: -->
<!-- 				<input name="datamodificacao" type="date" class="inp-form" /> -->
<%-- 				<fmt:formatDate type="date"  value="${registro.datamodificacao}" pattern="dd/MM/yyyy"/> --%>
				
<!-- 				</p> -->
				
<!-- 				<p> -->
				
<!-- 				Usuario Modificou: -->
<!-- 				<input name="usuario" type="text" class="inp-form"/> -->
<%-- 				<fmt:formatDate type="date"  value="${registro.usuario}" pattern="dd/MM/yyyy"/> --%>
				
				
<!-- 				Status: -->
<!-- 				<input name="status" type="text" class="inp-form" /> -->
<%-- 				<fmt:formatDate type="date"  value="${registro.status}" pattern="dd/MM/yyyy"/> --%>
				
<!-- 			</p> -->
			
<!-- 			</fieldset> -->
			
			
		
		
			<div class="form-row">
				   <label>
				  	<span>Ativo?</span>
						<input id="isAtivo" name="isAtivo" type="checkbox" checked="checked"/>
					</label>
			 </div>
			 
			 
			 
			  <div class="form-row">
				   <label>
				  	<span>Id Vereador</span>
						<input id="id" name="id" type="number"/>
					</label>
			 </div>
			 
		
			 
		 	  <div class="form-row">
			   		<label>
			  		<span>Nome</span>
						<input id="nome" name="nome" type="text" />
					</label>
		 	 </div>
			

			
			<div class="form-row">
			   		<label>
			  		<span>Telefone</span>
						<input id="telefone" name="telefone" type="text" />					
					</label>
		 	 </div>
		 	 
		 	 			<div class="form-row">
			   		<label>
			  		<span>Email</span>
						<input id="email" name="email" type="text" />					
					</label>
		 	 </div>
			
	
			
			<div id="botoes">
				<button class="button">Adicionar</button>
				<button class="button">Apagar</button>
		 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
				
			</div>
			

				

				

</form>
</div>
</div>

