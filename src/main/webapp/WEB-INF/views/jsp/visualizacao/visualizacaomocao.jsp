 <form id="ds" class="form-labels-on-top"action="${pageContext.request.contextPath}/mocao/editar"  method="POST">
 
 
 
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
						<input id="isAtivo" name="isAtivo" type="checkbox" checked="${mocao.isAtivo}"/>
					</label>
			 </div>
			 
			 
			 
			  <div class="form-row">
				   <label>
				  	<span>Id Mocao</span>
						<input id="id" name="id" type="number" value="${mocao.id}"/>
					</label>
			 </div>
			 
		
			 
		 	  <div class="form-row">
			   		<label>
			  		<span>Numero</span>
						<input id="numero" name="numero" type="text" value="${mocao.numero}"/>
					</label>
		 	 </div>
			

			
			<div class="form-row">
			   		<label>
			  		<span>Descricao</span>
						<input id="descricao" name="descricao" type="text" value="${mocao.descricao}"/>					
					</label>
		 	 </div>
		 	 
		 	 			<div class="form-row">
			   		<label>
			  		<span>Data</span>
						<input id="data" name="data" type="text" value="${mocao.data}"/>					
					</label>
		 	 </div>
		 	 
		 	 	 			<div class="form-row">
			   		<label>
			  		<span>Autor</span>
						<input id="autor" name="autor" type="text" value="${mocao.autor}" />					
					</label>
		 	 </div>
		 	 
		 	 	 	 			<div class="form-row">
			   		<label>
			  		<span>Homenageado</span>
						<input id="homenageado" name="homenageado" type="text" value="${mocao.homenageado}" />					
					</label>
		 	 </div>
		 	 
		 	  	 	 	 <div class="form-row">
			   		<label>
			  		<span>Expediente</span>
						<input id="expediente" name="expediente" type="text" value="${mocao.expediente}" />					
					</label>
		 	 </div>
			
	
			
			<div class="form-row">
				<button class="button">Fechar</button>
		 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
				
			</div>
			

				

				

</form>