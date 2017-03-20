<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>

<div id="conteudo"  class="conteudo">
<h2> Cadastrar Usuario </h2> 
<div id="form"> 
 
 <form id="ds" class="form-labels-on-top"action="${pageContext.request.contextPath}/usuario/add" ModelAttribute="usuario" method="POST">
 
 
 
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
			
			
	    <div class="leftColumn" style="width: 50%; float:left">
			
			
				 		  <div class="form-row">
				   <label>
				  	<span>Ativo?</span>
						<input id="isAtivo" name="isAtivo" type="checkbox" checked="${usuario.isAtivo}"/>
					</label>
			 </div>

			  <div class="form-row">
				   <label>
				  	<span>Id Usuario</span>
						<input id="id" name="id" type="text" value="${usuario.id}" />
					</label>
			 </div>
			 
		
			 
		 	  <div class="form-row">
			   		<label>
			  		<span>UserName</span>
						<input id="userName" name="userName" type="text" value="${usuario.userName}"/>
					</label>
		 	 </div>
		 	 
		 	
		 	 
		 	 
			
			<div class="form-row">
                <label>
                    <span>Tipo de Usuario</span>
                    
                         <select id="roles"name="roles" multiple="multiple" >
	                                  <optgroup label="Tipos de Permissoes do usuario">
		           					<c:forEach var="role" items="${roleList}">
		           			
		           				<option value="${role.id}">${role.name}</option>
		           				      				
		           				
		       				</c:forEach>
		                </optgroup>
	                    </select>
	                    
	                    
<!--                     		<input type="button" onclick="javascript:adiciona();" value="Adicionar" /> -->
                    
                </label>
            </div>
            
             </div>
             
                  <div class="rightColumn" style="width: 50%; float:left">
             
			
			<div class="form-row">
			   		<label>
			  		<span>Senha</span>
						<input id="senha" name="senha" type="text" value="${usuario.senha}"/>					
					</label>
		 	 </div>
			
		
			
<!--             <p> Tipo: -->
<!-- 	            <select id="tipo" name="tipo" id="files" class="inp-form">            -->
<!-- 	                <optgroup label="Tipos de Usuario"> -->
<%-- 	           			<c:forEach var="tipo" items="${tipoList}"> --%>
	           			
<%-- 	           				<option value="${tipo}">${tipo}</option> --%>
	           				      				
	           				
<%-- 	       				</c:forEach> --%>
<!-- 	                </optgroup> -->
<!-- 	            </select> -->
<!-- 			</p> -->

		
			<div class="form-row">
			   		<label>
			  		<span>Email</span>
						<input id="email" name="email" type="text" value="${usuario.email}" />
					</label>
		 	 </div>
		 	 
		 	 
<!-- 		 	  	 <div class="form-row"> -->
		 	 
		 	 
<!-- 		 	 <fieldset> -->
		 	 
		 	 
<!-- 		 	 <label>Roles do Usuario</label> -->
<%--                 <ul id="roles" name="${usuario.roles }" path="roles" ></ul> --%>
<!-- <!--                      <div id="roles_name" name="roles_name"></div> --> 

				


              		
              		   
<!--               </fieldset>                                  -->
              
<!--                	<input type="button" onclick="javascript:removeLinha(this);" value="Delete"> -->
              
              
              
              		
<!--               </div> -->
              
              
           
		 	 
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">


	</div>	 	 
			
			<div class="form-row">
				<button type="submit">Cadastrar</button>
				<button type="reset">Voltar</button>
			</div>
										

</form>
</div>
</div>

