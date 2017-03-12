<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="TRUE" %>

<div id="conteudo" class="conteudo">

      <table class="flatTable">
    			
    	<tr class="titleTr">
				    <td class="titleTd">USUARIOS</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="4"></td>
				    <td><a href="#cadastroadd" rel="modal" ><img src="${pageContext.request.contextPath}/resources/images/add.png"></div></a></td>
  				</tr>
  				
  				
  				<tr class="headingTr">
  				    <td>Id</td>
				    <td>Username</td>
				    <td>Senha</td>
				    <td>Email</td>
				    <td>Roles</td>
				     <td>Ativo</td>
				    <td>Ação</td>
				    
				    </tr>

     
  <c:forEach var="usuario" items="${usuarioList}" varStatus="id">

		<c:choose>
		  <c:when test="${usuario.id % 2 == 0}">
		    <tr>
			      <td>${usuario.id}</td>
                  <td>${usuario.userName}</td>
                  <td ><input type="password" value="${usuario.senha}"></td>
                  <td>${usuario.email}</td>
                   <td>${usuario.roles}</td>
                   <td> ${usuario.isAtivo}</td>

	 <td class="options-width">
			        
			     
                         <a href="${pageContext.request.contextPath}/usuario/visualizacao?id=${usuario.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/usuario/editar?id=${usuario.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/usuario/delete?id=${usuario.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                              
                        
                    </td>
			  </tr>
		  </c:when>
		  
		  <c:when test="${usuario.id % 2 != 0}">
		           	    <tr>
			     <td>${usuario.id}</td>
		                     <td>${usuario.userName}</td>
		                    <td ><input type="password" value="${usuario.senha}"></td>
		                     <td>${usuario.email}</td>
		                      <td>${usuario.roles}</td>
		                       <td> ${usuario.isAtivo}</td>
<%-- 		                    <td>${vereador.hora}</td> --%>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			    <td class="options-width">
			        
			     
                           <a href="${pageContext.request.contextPath}/usuario/visualizacao?id=${usuario.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="${pageContext.request.contextPath}/usuario/editar?id=${usuario.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="${pageContext.request.contextPath}/usuario/delete?id=${usuario.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                          
                        
                    </td>
			  </tr>
			  
		  </c:when>
		
		</c:choose>

    </c:forEach>             
            </table>
            
<!--      <div id="sForm" class="sForm sFormPadding"> -->
<!--         <span id="button close" class="button close"><img src="http://i.imgur.com/nnzONel.png" alt="X"  class="" /></span> -->
<!--         <h2 class="title">Adicionar Nova Reunião</h2>   -->
<!--     </div> -->

<div class="window" id="cadastroadd">
    <a href="#" class="fechar"><img alt="" src="${pageContext.request.contextPath}/resources/images/exitt.png"></a>

<div id="main-content"> 


 
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
			
				 		  <div class="form-row">
				   <label>
				  	<span>Ativo?</span>
						<input id="isAtivo" name="isAtivo" type="checkbox" checked="checked"/>
					</label>
			 </div>

			  <div class="form-row">
				   <label>
				  	<span>Id Usuario</span>
						<input id="id" name="id" type="text" />
					</label>
			 </div>
			 
		
			 
		 	  <div class="form-row">
			   		<label>
			  		<span>UserName</span>
						<input id="userName" name="userName" type="text" />
					</label>
		 	 </div>
			
			<div class="form-row">
                <label>
                    <span>Tipo de Usuario</span>
	                    <select id="roles"name="roles">
	                                  <optgroup label="Tipos de Usuarios">
		           			<c:forEach var="role" items="${roleList}">
		           			
		           				<option value="${role.id}">${role.name}</option>
		           				      				
		           				
		       				</c:forEach>
		                </optgroup>
	                    </select>
                    		<button type="reset" >Add</button>
                    
                </label>
            </div>
			
			<div class="form-row">
			   		<label>
			  		<span>Senha</span>
						<input id="senha" name="senha" type="text" />					
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
						<input id="email" name="email" type="text" />
					</label>
		 	 </div>
		 	 
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">


		 	 
			
			<div class="form-row">
				<button type="submit">Adicionar</button>
				<button type="reset">Apagar</button>
			</div>
										

</form>
</div>
</div>
    
    <div id="mascara"></div>
    
    
</div>





