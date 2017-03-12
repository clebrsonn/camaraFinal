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
				   <label>
				  	<span>Ativo?</span>
						<input id="isAtivo" name="isAtivo" type="checkbox" checked="checked"/>
					</label>
			 </div>
			 
			 
			 
			  <div class="form-row">
				   <label>
				  	<span>Id Oradores Dia</span>
						<input id="id" name="id" type="number" value="${oradoresdia.id}"/>
					</label>
			 </div>
			 
		
			 
		 	  
		 	  <div class="form-row">
			   		<label>
			  		<span>Data</span>
						<input id="nome" name="nome" type="date" value="${oradoresdia.data}" />
					</label>
		 	 </div>
			

			
			<div class="form-row">
                <label>
                    <span>Reuniao</span>
	                    <select id="reuniao"name="reuniao">
	                                  <optgroup label="Escolha a Reuniao">
		           			<c:forEach var="reuniao" items="${reuniaoList}">
		           			
		           				<option value="${reuniao.id}">${reuniao.numero}</option>
		           				      				
		           				
		       				</c:forEach>
		                </optgroup>
	                    </select>
<!--                     		<button type="reset" >Add</button> -->
                    
                </label>
            </div>
		 	 
			
	
	
			
			<div id="botoes">
				<button class="button">Fechar</button>
				<button class="button">Apagar</button>
		 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
				
			</div>
			

				

				

</form>