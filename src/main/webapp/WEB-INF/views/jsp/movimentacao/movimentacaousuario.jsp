<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

      <table class="flatTable">
    			
    	<tr class="titleTr">
				    <td class="titleTd">USUARIOS</td>
				       <td class="search"> <input type="text"></td>
				    <td colspan="2"></td>
				    <td><a href="#cadastroadd" rel="modal" ><img src="${pageContext.request.contextPath}/resources/images/add.png"></div></a></td>
  				</tr>
  				
  				
  				<tr class="headingTr">
  				    <td>Id</td>
				    <td>Nome</td>
				    <td>Senha</td>
				    <td>Email</td>
				    <td>Ação</td>
				    
				    </tr>

     
  <c:forEach var="usuario" items="${usuarioList}" varStatus="id">

		<c:choose>
		  <c:when test="${usuario.id % 2 == 0}">
		    <tr>
			      <td>${usuario.id}</td>
                  <td>${usuario.nome}</td>
                  <td ><input type="password" value="${usuario.senha}"></td>
                  <td>${usuario.email}</td>

	 <td class="options-width">
			        
			     
                        <a href="edicao?id=${usuario.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="/delete?id=${usuario.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="/edit?id=${usuario.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
                    </td>
			  </tr>
		  </c:when>
		  
		  <c:when test="${usuario.id % 2 != 0}">
		           	    <tr>
			     <td>${usuario.id}</td>
		                     <td>${usuario.nome}</td>
		                    <td ><input type="password" value="${usuario.senha}"></td>
		                     <td>${usuario.email}</td>
<%-- 		                    <td>${vereador.hora}</td> --%>
<%-- 		                      <td>${vereador.presidente}</td> --%>
<%-- 		                     	<td>${vereador.primeirosecretario}</td> --%>
			    <td class="options-width">
			        
			     
                        <a href="edicao?id=${usuario.id}" title="Edit"><img src="${pageContext.request.contextPath}/resources/images/visualizar.png" alt="X"/></a>
                        <a href="/delete?id=${usuario.id}"  title="aaa"><img src="${pageContext.request.contextPath}/resources/images/editar.png" alt="placeholder icon" /></a>
                         <a href="/edit?id=${usuario.id}" title="bbb"><img src="${pageContext.request.contextPath}/resources/images/excluir.png" alt="placeholder icon" /></a>
                                               
                        
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

<h2> Cadastro Usuario </h2> 
<div id="form"> 
 
 <form id="formUsuario" action="add" method="POST">
 
 
 
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
			
<!--             <p> Tipo: -->
<!-- 	            <select id="tipo" name="tipo" id="files" class="inp-form">            -->
<!-- 	                <optgroup label="Tipos de Usuario"> -->
<%-- 	           			<c:forEach var="tipo" items="${tipoList}"> --%>
	           			
<%-- 	           				<option value="${tipo}">${tipo}</option> --%>
	           				      				
	           				
<%-- 	       				</c:forEach> --%>
<!-- 	                </optgroup> -->
<!-- 	            </select> -->
<!-- 			</p> -->
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
    
    <div id="mascara"></div>
    
    
</div>





