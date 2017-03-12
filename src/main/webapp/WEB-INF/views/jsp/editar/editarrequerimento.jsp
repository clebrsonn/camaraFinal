<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>

<div id="conteudo"  class="conteudo">
<h2> Editar Requerimento </h2> 
 <form id="ds" class="form-labels-on-top"action="${pageContext.request.contextPath}/requerimento/editar" ModelAttribute="requerimento"  method="POST">
 
 
 
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
						<input id="isAtivo" name="isAtivo" type="checkbox" checked="${requerimento.isAtivo}"/>
					</label>
			 </div>
			 
			 
			 
			  <div class="form-row">
				   <label>
				  	<span>Id Requerimento</span>
						<input id="id" name="id" type="number" value="${requerimento.id}"/>
					</label>
			 </div>
			 
		
			 
		 	  <div class="form-row">
			   		<label>
			  		<span>Numero</span>
						<input id="numero" name="numero" type="text" value="${requerimento.numero}"/>
					</label>
		 	 </div>
			

			
			<div class="form-row">
			   		<label>
			  		<span>Descricao</span>
						<input id="descricao" name="descricao" type="text" value="${requerimento.descricao}"/>					
					</label>
		 	 </div>
		 	 
		 	 			<div class="form-row">
			   		<label>
			  		<span>Data</span>
						<input id="data" name="data" type="text" value="${requerimento.data}"/>					
					</label>
		 	 </div>
		 	 
		 	 	 			<div class="form-row">
			   		<label>
			  		<span>Autor</span>
						<input id="autor" name="autor" type="text" value="${requerimento.autor}" />					
					</label>
		 	 </div>
			
	
			
			<div class="form-row">
				<button class="button">Editar</button>
				<button class="button">Apagar</button>
		 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
				
			</div>
			

				

				

</form>
</div>


