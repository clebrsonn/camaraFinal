 <form id="ds" class="form-labels-on-top"action="${pageContext.request.contextPath}/expediente/editar"  method="POST">
 
 
 
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
			
				<div class="row-half">
				  
				   <label>
				  	<span>Ativo?</span>
						<input id="isAtivo" name="isAtivo" type="checkbox" checked="${expediente.isAtivo}"/>
					</label>
					
					</div>
					
		  	<div class="row-half">
				   <label>
				  	<span>Id Expediente</span>
						<input id="id" name="id" type="number" value="${expediente.id}"/>
					</label>
			 </div>
					
					
					
			 </div>
			 
		
		 	  <div class="form-row">
			   		<label>
			  		<span>Data</span>
						<input id="data" name="data" type="date" value="${expediente.data}" />
					</label>
		 	 </div>
			

			
			<div class="form-row">
			   		<label>
			  		<span>Reuniao</span>
						<input id="reuniao" name="reuniao" type="text" value="${expediente.reuniao}" />					
					</label>
		 	 </div>
		 	 
		 	 			<div class="form-row">
			   		<label>
			  		<span>Numero</span>
						<input id="numero" name="numero" type="text"  value="${expediente.numero}"/>					
					</label>
		 	 </div>
			
	
			
	
	
			
			<div id="botoes">
				<button class="button">Fechar</button>
		 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
				
			</div>
			

				

				

</form>